package customLogger;

public class CustomSingletonLogger {

    // private static instance variable to store the single instance of the class
    private static CustomSingletonLogger instance;

    //private constructor to prevent the creation of instances from outside the class
    private CustomSingletonLogger () {}

    // Synchronized method to ensure that the single instance is thread-safe
    public static synchronized CustomSingletonLogger getInstance(){
        if(instance == null){
            instance = new CustomSingletonLogger();
        }
        return instance;
    }
    //public method to access log message
    public void log(String message){System.out.println(message);}
}
