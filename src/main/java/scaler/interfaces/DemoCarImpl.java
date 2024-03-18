package scaler.interfaces;

import scaler.inheritance.Vehicle;

public class DemoCarImpl extends Vehicle implements DemoCar {
    public void carPrice() {
        System.out.println("Displaying Car Price");
    }

    @Override
    public void displayCarPrice() {
        System.out.println(DemoCar.interface1);
    }
}
