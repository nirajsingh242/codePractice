package designPatternsCreational;
public class PrototypePatternDemo {
    public static void main(String[] args) {
        // Original car object
        Car originalCar = new Car("Toyota", "V6");
        originalCar.displayInfo();  // Display original car info

        // Clone the original car
        Car clonedCar = (Car) originalCar.clone();
        clonedCar.displayInfo();  // Display cloned car info

        // Modify the cloned car's model
        clonedCar.displayInfo(); // Display updated cloned car info
    }
}
