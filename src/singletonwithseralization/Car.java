package singletonwithseralization;

import java.io.Serializable;

public class Car implements Serializable {

    private  static Car car;

    private Car(){
    }

    public static Car getCar(){
        if (car==null){
            synchronized (Car.class) {
                car = new Car();
            }
        }
        return car;
    }

    protected Object readResolve() {
        return car;
    }
}
