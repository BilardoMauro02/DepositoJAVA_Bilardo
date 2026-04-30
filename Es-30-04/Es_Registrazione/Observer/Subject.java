package Es_Registrazione.Observer;

public interface Subject {
    void registraObserver(Observer o);
    void rimuoviObserver(Observer o);
    void notificaObserver(String m);
}
