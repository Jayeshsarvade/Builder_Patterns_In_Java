package singletondesigneager;

public class Car {
    // Eagerly created singleton instance
    private static final Car car = new Car();

    // Private constructor prevents instantiation from other classes
    private Car() {
    }

    /**
     * Returns the singleton instance of Car.
     * @return the single Car instance
     */
    public static Car getCar() {
        return car;
    }
}