package singletondesigneager;

public class Main {

    /**
     * Entry point of the application.
     * @param args command-line arguments
     */
    public static void main(String[] args){
        Car car = Car.getCar();
        System.out.println(car.hashCode());

        Car car2 = Car.getCar();
        System.out.println(car2.hashCode());
    }
}