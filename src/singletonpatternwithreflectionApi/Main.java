package singletonpatternwithreflectionApi;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Car car = Car.getCar();
        System.out.println(car.hashCode());

        Constructor<Car> declaredConstructor = Car.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        System.out.println(declaredConstructor.newInstance().hashCode());
    }
}
