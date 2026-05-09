package Es_Ticket.facade;

import java.util.List;

import Es_Ticket.models.Ticket;
import Es_Ticket.models.TicketNotifier;
import Es_Ticket.models.TicketSingleton;
import Es_Ticket.models.User;
import Es_Ticket.observer.Observer;

public class TicketFacade {

    private TicketNotifier notifier = new TicketNotifier();
    private int contatore = 1;

    public void addObserver(Observer o) {
        notifier.registrObserver(o);
    }

    public void creaTicket(String descrizione, User u){
    Ticket t = new Ticket(contatore++, descrizione, "APERTO", u.getNome());
    TicketSingleton.getInstance().add(t);
    notifier.notifyObserver("Creato ticket #" + t.getId());
}

    public List<Ticket> getAll() {
        return TicketSingleton.getInstance().getAll();
    }

    public void modificaTicket(int id, String nuovaDescrizione, User u) {
        if (u.getRuolo() != User.Ruolo.ADMIN) {
            System.out.println("Non autorizzato.");
            return;
        }

        Ticket t = TicketSingleton.getInstance().getById(id);

        if (t == null) {
            System.out.println("Ticket non trovato.");
            return;
        }

        t.setDescrizione(nuovaDescrizione);

        notifier.notifyObserver("Ticket #" + id + " modificato da " + u.getNome());
    }

    public void eliminaTicket(int id, User u) {
        if (u.getRuolo() != User.Ruolo.ADMIN)
            return;
        TicketSingleton.getInstance().delete(id);
        notifier.notifyObserver("Ticket #" + id + " eliminato");
    }

}
