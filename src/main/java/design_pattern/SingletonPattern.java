package design_pattern;

public class SingletonPattern {
    private static SingletonPattern instance = null;

    private SingletonPattern(){

    }

    public static synchronized SingletonPattern getInstance(){
        if(instance == null) {
            instance = new SingletonPattern();
        }
        return instance;
    }
}

