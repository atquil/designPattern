package customLogger;

public class Main {
    public static void main(String[] args) {
        CustomSingletonLogger customSingletonLogger = CustomSingletonLogger.getInstance();
        customSingletonLogger.log("Logging the message");
    }
}
