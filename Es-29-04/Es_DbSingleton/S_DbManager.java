package Es_DbSingleton;

import java.util.ArrayList;

public class S_DbManager {
    private static int count = 0;
    private static S_DbManager instance;
    //uso di un ArrayList per simulare una tabella di utenti in un database
    private ArrayList<Utente> utenti;

    private S_DbManager() {
        // Costruttore privato per impedire l'instanziazione diretta
        this.utenti = new ArrayList<>();
    }

    public static S_DbManager getInstance() {
        if (instance == null) {
            instance = new S_DbManager();
        }
        return instance;
    }

    public void connect() {
        System.out.println("Connessione al database stabilita. Connessioni attive: " + count);
        count++;
    }

    public void getConnectionCount() {
        System.out.println("Numero di connessioni effettuate: " + count);
    }

    // Metodi per gestire l'aggiunta utenti
    public void addUtente(Utente utente) {
        utenti.add(utente);
    }

    //metodo per ottenere la lista degli utenti
    public ArrayList<Utente> getUtenti() {
        return utenti;
    }

}
