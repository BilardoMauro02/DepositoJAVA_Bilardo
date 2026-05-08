package Es_Ticket.views;

import java.util.List;

import Es_Ticket.models.Ticket;
import Es_Ticket.observer.Observer;

public class TicketView implements Observer{

    @Override
    public void update(String msg) {
        System.out.println("Notifica: " + msg);
    }

    public void mostra(List<Ticket> tickets){
        for (Ticket t : tickets) {
            System.out.println(t.getId() + " - " + t.getDescrizione() + " (" + t.getStato() + ")");
        }
    }
    
}
