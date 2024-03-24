package design_pattern;

public class Client {
    public static void main(String[] args) {
        Client client = new Client();
        client.testSingleton();
    }

    public void testSingleton(){
        System.out.println(SingletonPattern.getInstance());
        System.out.println(SingletonPattern.getInstance());
        System.out.println(SingletonPattern.getInstance());
        System.out.println(SingletonPattern.getInstance());
    }


}
