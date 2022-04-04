import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class Tests {

    @Test
    public void test1(){
        ArrayList<Car> cars = TestData.setCars();
        int max =  cars.get(0).horsePower;
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).horsePower > max) {
                max = cars.get(i).horsePower;
            }
        }
        System.out.println("The max horsepower is : " + max);

        Assert.assertTrue(max == 350);
    }

    @Test
    public void test2(){
        ArrayList<Car> cars = TestData.setCars();
        int sedanCars = 0;
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getType() == Car.Type.SEDAN) {
                sedanCars++;
                System.out.println(cars.get(i).name);
            }
        }
        System.out.println("We have " + sedanCars + " sedans cars in the marker");

        Assert.assertTrue(sedanCars == 4);
    }

    @Test
    public void test3(){
        ArrayList<Car> cars = TestData.setCars();
        double engine = 1.6;
        List<Double> bigEngines = new ArrayList<Double>();
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getEngine() > engine) {
                bigEngines.add(cars.get(i).getEngine());
            }
        }

        for (int i= 0; i < bigEngines.size(); i++) {
            Assert.assertTrue(bigEngines.get(i) >= 1.8 );
        }
    }
}
