package singletonpatternwithenum;

import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Car car = Car.INSTANCE;
        System.out.println(car.hashCode());
        car.test();
    }
}
