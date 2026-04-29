package Es_Singleton;

public class Logger {

    private static Logger instance;

    private Logger() {

    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void scriviMessaggio(String message) {
        System.out.println("Log: " + message);
    }
}