package Es_Ticket.observer;

public interface Subject {
    void registrObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver(String msg);
}
