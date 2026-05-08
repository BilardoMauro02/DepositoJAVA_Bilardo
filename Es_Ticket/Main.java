package Es_Ticket;

import java.util.ArrayList;
import java.util.List;

import Es_Ticket.controls.ConsoleController;
import Es_Ticket.controls.UserControl;
import Es_Ticket.facade.TicketFacade;
import Es_Ticket.models.User;
import Es_Ticket.views.TicketView;

public class Main{
    public static void main(String[] args) {
        List<User> utenti = new ArrayList<>();
        
        TicketFacade facade = new TicketFacade();
        TicketView view = new TicketView();
        UserControl userControl = new UserControl(utenti);

        facade.addObserver(view);

        ConsoleController controller = new ConsoleController(facade, view, userControl);

        controller.start();
    }
}