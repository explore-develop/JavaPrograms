package scaler.inheritance;

public class Vehicle {
    int wheels;
    String color;


    public Vehicle(int wheels, String color) {
        this.wheels = wheels;
        this.color = color;
        System.out.println("Vehicle Ctor");
    }

    public Vehicle() {
        System.out.println("Vehicle Ctor");
    }

    public void move() {
        System.out.println("Moving the Vehicle with " + wheels + " wheels and " + color + " Color");
    }
}
