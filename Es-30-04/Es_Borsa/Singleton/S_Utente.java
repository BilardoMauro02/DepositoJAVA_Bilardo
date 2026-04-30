package Es_Borsa.Singleton;

import Es_Borsa.Observer.Investitore;

public class S_Utente implements Investitore {
    private static S_Utente instance;

    private S_Utente() {}

    public static S_Utente getInstance() {
        if (instance == null) {
            instance = new S_Utente();
        }
        return instance;
    }

    @Override
    public void notifica(String azione, double valore) {
        System.out.println("Utente ha ricevuto notifica: " + azione + " a " + valore);
    }

}
