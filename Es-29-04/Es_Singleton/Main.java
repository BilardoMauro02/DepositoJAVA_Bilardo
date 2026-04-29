package Es_Singleton;

public class Main {
    
    public static void main(String[] args) {

        Utente utente1 = new Utente("Mauro");
        Utente utente2 = new Utente("Luca");
        System.err.println(utente1);
        System.err.println(utente2);

        Logger logger = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
    
        logger.scriviMessaggio("Questo è un messaggio di log.");
        System.out.println("Logger è la stessa instanza di Logger2?: " + (logger == logger2));
        System.out.println("Logger2 è la stessa instanza di Logger?: " + (logger2 == logger));
    }
}
