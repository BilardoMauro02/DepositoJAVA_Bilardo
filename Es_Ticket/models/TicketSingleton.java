package Es_Ticket.models;

import java.util.ArrayList;
import java.util.List;

public class TicketSingleton {

    private static TicketSingleton instance;
    private List<Ticket> tickets = new ArrayList<>();

    private TicketSingleton(){}

    public static TicketSingleton getInstance(){
        if(instance == null){
            instance = new TicketSingleton();
        }
        return instance;
    }

    public void add(Ticket t){
        tickets.add(t);
    }

    public List<Ticket> getAll(){
        return tickets;
    }

    public Ticket getById(int id){
        return tickets.stream()
        .filter(t -> t.getId() == id)
        .findFirst()
        .orElse(null);
    }

    public void delete(int id){
        tickets.removeIf(t -> t.getId() == id);
    }
}
