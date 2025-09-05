package singletonwithcloning;

public class Car implements Cloneable {

    private static Car car;

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

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
