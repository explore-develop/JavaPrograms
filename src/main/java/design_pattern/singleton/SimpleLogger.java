package design_pattern.singleton;

public class SimpleLogger {
    private static SimpleLogger simpleLogger;
    private SimpleLogger(){
        System.out.print("constructor called");
    }

    public synchronized static SimpleLogger getInstance(){
        {
            if (simpleLogger == null){
                simpleLogger = new SimpleLogger();
            }
            return simpleLogger;
        }
    }

    public static SimpleLogger resetInstance(){
        simpleLogger = null;
        return simpleLogger;
    }

}