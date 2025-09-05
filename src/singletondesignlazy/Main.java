package singletondesignlazy;

public class Main {

    /**
     * Entry point of the application.
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        Bike bike = Bike.getBike();
        System.out.println(bike.hashCode());

        Bike bike2 = Bike.getBike();
        System.out.println(bike2.hashCode());

    }
}