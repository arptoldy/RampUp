public class Car {
    String name;
    int maxSpeed;
    private Type type;
    enum Type {CABRIO, SEDAN, COUPE;}
    double engine;
    int horsePower;

    Car(String name, int maxSpeed, Type type, double engine, int horsePower) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.type = type;
        this.engine = engine;
        this.horsePower = horsePower;
    }

    public String setCarMake(String make) {
        this.name = name;
        return name;
    }

    public String getName() {

        return name;
    }

    public String setMaxSpeed(int maxSpeed) {
        this.name = name;
        return name;
    }

    public int getMaxSpeed() {

        return maxSpeed;
    }

    public double setEngine(double engine) {
        this.engine = engine;
        return engine;
    }

    public double getEngine() {

        return engine;
    }

    public int setHorsePower(int horsePower) {
        this.horsePower = horsePower;
        return horsePower;
    }

    public int getHorsePower() {

        return horsePower;
    }

    public void setType(Type type) {

        this.type = type;
    }

    public Type getType() {

        return type;
    }
}