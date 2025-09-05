package singletonwiththreadsafe;

public class Car {
    private static Car car;
    private Car() {
    }
    public static Car getCar() {
        if (car == null) {
            synchronized (Car.class) {
                car = new Car();
            }
        }
        return car;
    }
}