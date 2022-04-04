import java.util.ArrayList;

public class TestData {

    public static ArrayList<Car> setCars() {

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Audi", 250, Car.Type.SEDAN, 1.8, 150));
        cars.add(new Car("BMW", 280, Car.Type.CABRIO, 3.0, 230));
        cars.add(new Car("Dacia", 200, Car.Type.SEDAN, 1.2, 90));
        cars.add(new Car("Lada", 160, Car.Type.SEDAN, 1.6, 90));
        cars.add(new Car("Ferrari", 300, Car.Type.COUPE, 4.0, 350));
        cars.add(new Car("Opel", 250, Car.Type.COUPE, 2.0, 180));
        cars.add(new Car("Renault", 200, Car.Type.SEDAN, 1.4, 140));

        return cars;

    }
}
