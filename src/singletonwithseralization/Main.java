package singletonwithseralization;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Car car = Car.getCar();
        System.out.println(car.hashCode());
        ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream("abc.ob"));
        obj.writeObject(car);
        System.out.println("serializable is done...");

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.ob"));
        Car car2 = (Car)ois.readObject();
        System.out.println(car2.hashCode());
    }
}
