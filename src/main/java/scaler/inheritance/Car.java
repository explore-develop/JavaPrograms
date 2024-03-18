package scaler.inheritance;

public class Car extends Vehicle{
    public Car(){
        System.out.println("Car Ctor");
    }

    public Car(int wheels){
        System.out.println("Car Ctor");
    }

    public Car(int wheels, String color){
        super(wheels,color);
        System.out.println("Car Ctor");
    }

    @Override
    public void move() {
        System.out.println("Moving Car");
    }
}
