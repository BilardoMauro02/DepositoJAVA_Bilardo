package Model;

import java.util.ArrayList;
import java.util.List;

public class Fabbrica implements Subject {

    private static Fabbrica instance;
    private List<Veicolo> veicoli;
    private List<Observer> observers;

    private Fabbrica() {
        veicoli = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public static Fabbrica getInstance() {
        if (instance == null) {
            instance = new Fabbrica();
        }
        return instance;
    }

    public void addVeicolo(Veicolo v) {
        veicoli.add(v);
        notifyObservers();
    }

    public List<Veicolo> getVeicoli() {
        return veicoli;
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(); // la View aggiorna la stampa
        }
    }
}
