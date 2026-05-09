package Es_Ticket.models;

import java.util.ArrayList;
import java.util.List;

import Es_Ticket.observer.Observer;
import Es_Ticket.observer.Subject;

public class TicketNotifier implements Subject{
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registrObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver(String msg) {
        for (Observer o : observers) {
            o.update(msg);
        }
    }


}
