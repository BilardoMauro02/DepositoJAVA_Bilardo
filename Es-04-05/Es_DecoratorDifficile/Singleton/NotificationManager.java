package Es_DecoratorDifficile.Singleton;

import java.util.ArrayList;
import java.util.List;

import Es_DecoratorDifficile.Observer.Observer;

public class NotificationManager {
    private static NotificationManager instance;
    private List<Observer> observers;
    private Observer utenteLoggato;

    private NotificationManager() {
        observers = new ArrayList<Observer>();
        utenteLoggato = null;
    }

    public static NotificationManager getInstance() {
        if (instance == null) {
            instance = new NotificationManager();
        }
        return instance;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public boolean login(Observer user) {
        if (utenteLoggato == null) {
            utenteLoggato = user;
            return true;
        }
        return false;
    }

    public void logout() {
        utenteLoggato = null;
    }

    public Observer getUtenteLoggato() {
        return utenteLoggato;
    }

    public void inviaNotifica(String message) {
        notifyObservers(message);
    }
}
