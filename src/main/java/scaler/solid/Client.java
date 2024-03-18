package scaler.solid;

public class Client {
    public static void main(String[] args) {
        Bird pigeon = new Pigeon();
        System.out.println(pigeon.getColor());

        Pigeon pigeon1 = (Pigeon) new Bird();

    }
}
