package scaler.beginner;

import scaler.inheritance.Car;
import scaler.inheritance.SedanCar;
import scaler.inheritance.Vehicle;

public class PlayGround {
    public static void main(String[] args) {
//        int a = 10;
//        Point p = new Point();
//        System.out.println(a);
//        System.out.println(p.getX());
//        System.out.println(p.y);
//
//        Circle circle = new Circle();
//        circle.radius = 3;
//
//        FinalizeExample finalizeExample = new FinalizeExample();
//        finalizeExample.invokeCircle(circle);


//        SedanCar sedanCar = new SedanCar(2, "Red");
//        sedanCar.move();

        Car car = new SedanCar(6,"fred");
        car.move();

        Vehicle vehicle = new Car();
    }

}
