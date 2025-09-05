package singletonpatternwithreflectionApi;


public class Car {
    private static  Car car;

    private Car(){
        if (car!=null)
            throw new RuntimeException("You are trying to break singleton design pattern");
    }

    public static Car getCar(){
        if (car == null) {
        synchronized (Car.class){
            car = new Car();
        }
        }
        return car;
    }
}
