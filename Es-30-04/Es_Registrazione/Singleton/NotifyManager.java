package Es_Registrazione.Singleton;

import java.util.ArrayList;
import java.util.List;

import Es_Registrazione.Utente;
import Es_Registrazione.Observer.Observer;
import Es_Registrazione.Observer.Subject;

public class NotifyManager implements Subject {
    
    private static NotifyManager instance;
    private List<Observer> observers;
    private Utente utenteLoggato;

    private NotifyManager() {
        observers = new ArrayList<>();
    }

    public boolean login(Utente u){
        if(utenteLoggato != null) {
            System.out.println("Utente " + u.getNome() + "è già loggato" );
            return false;
        }
        utenteLoggato = u;
        System.out.println("Utente " + u.getNome() + " ha effettuato il login");
        return true;
    }
    
    public static NotifyManager getInstance() {
        if (instance == null) {
            instance = new NotifyManager();
        }
        return instance;
    }



    @Override
    public void registraObserver(Es_Registrazione.Observer.Observer o) {
        observers.add(o);
    }

    @Override
    public void rimuoviObserver(Es_Registrazione.Observer.Observer o) {
        observers.remove(o);
    }

    @Override
    public void notificaObserver(String m) {
        for (Observer o : observers) {
            o.aggiorna(m);
        }
    }

    public void notifica(String m) {
        System.out.println("nuovo avviso: " + m);
        notificaObserver(m);
    }
    
}
