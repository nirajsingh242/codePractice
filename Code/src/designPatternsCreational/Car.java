package designPatternsCreational;
public class Car implements Prototype {
    private String model;
    private String engine;

    public Car(String model, String engine) {
        this.model = model;
        this.engine = engine;
    }

    // Copy constructor for cloning
    public Car(Car car) {
        if (car != null) {
            this.model = car.model;
            this.engine = car.engine;
        }
    }

    @Override
    public Prototype clone() {
        return new Car(this);  // Returning a new Car object by copying the current one
    }

    public void displayInfo() {
        System.out.println("Car Model: " + model + ", Engine: " + engine);
    }
}
