package scaler.interfaces;

public interface DemoCar {
    int interface1 = 4;
    String color = "White";

    default void displayCarModel(){
        System.out.println("Displaying Car Model from DemoCar Interface");
    }

    public default void displayCarModel(String color){
        System.out.println("Displaying Car Model from DemoCar Interface "+ color);
    }

    public void displayCarPrice();

}
