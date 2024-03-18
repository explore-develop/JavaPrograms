package scaler.inheritance;

public class SedanCar extends Car{
    int brand;

    public SedanCar(){}
    public SedanCar(int wheels, String color){
        super(wheels, color);
        System.out.println("Sedan Car Ctor");
    }
}
