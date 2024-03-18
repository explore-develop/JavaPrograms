package scaler.interfaces;

public class Main {
    public static void main(String[] args) {
        DemoCarImpl demoCar = new DemoCarImpl();
        demoCar.displayCarPrice();
        demoCar.displayCarModel("while");
        demoCar.displayCarModel();
        demoCar.move();

        DemoCar obj = new DemoCarImpl();
        obj.displayCarModel();

        InterfaceImpl interfaceImpl = new InterfaceImpl();
        interfaceImpl.fun();
    }
}
