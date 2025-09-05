package singletonwithcloning;


public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Car c1 = Car.getCar();
        Car c2 = (Car) c1.clone();  // clone creates a new object!

        System.out.println("s1 hashcode: " + c1.hashCode());
        System.out.println("s2 hashcode: " + c2.hashCode());
        System.out.println("Are they same object? " + (c1 == c2));
    }
}
