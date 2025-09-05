package singletondesignlazy;

public class Bike {

    // Holds the single instance of Bike (lazy initialization)
    private static Bike bike;

    // Private constructor prevents instantiation from other classes
    private Bike() {
    }

    /**
     * Returns the single instance of Bike, creating it if it does not exist.
     *
     * @return the singleton instance of Bike
     */
    public static Bike getBike() {
        if (bike == null) {
            bike = new Bike();
        }
        return bike;
    }
}
