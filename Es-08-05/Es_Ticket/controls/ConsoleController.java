package Es_Ticket.controls;
import java.util.Scanner;

import Es_Ticket.facade.TicketFacade;
import Es_Ticket.models.User;
import Es_Ticket.views.TicketView;

public class ConsoleController {

    private TicketFacade facade;
    private TicketView view;
    private UserControl userControl;
    private Scanner scanner;

    public ConsoleController(TicketFacade facade, TicketView view, UserControl userControl) {
        this.facade = facade;
        this.view = view;
        this.userControl = userControl;
        this.scanner = new Scanner(System.in);
    }

    // ============================================================
    // MENU INIZIALE
    // ============================================================
    public void start() {

        int scelta;

        do {
            System.out.println("\n=== MENU PRINCIPALE ===");
            System.out.println("1) Registrazione");
            System.out.println("2) Login");
            System.out.println("0) Esci");
            System.out.print("Scelta: ");

            scelta = Integer.parseInt(scanner.nextLine());

            switch (scelta) {

                case 1 -> userControl.registraUtente();

                case 2 -> {
                    User u = userControl.login();
                    if (u == null) {
                        System.out.println("Credenziali errate.");
                    } else {
                        menuUtente(u);
                    }
                }

                case 0 -> System.out.println("Uscita...");

                default -> System.out.println("Scelta non valida.");
            }

        } while (scelta != 0);
    }

    // ============================================================
    // MENU DOPO LOGIN (USER O ADMIN)
    // ============================================================
    private void menuUtente(User u) {

        if (u.getRuolo() == User.Ruolo.ADMIN) {
            menuAdmin(u);
        } else {
            menuUser(u);
        }
    }

    // ============================================================
    // MENU USER
    // ============================================================
    private void menuUser(User u) {

        int scelta;

        do {
            System.out.println("\n=== MENU USER ===");
            System.out.println("1) Crea ticket");
            System.out.println("2) Guarda ticket");
            System.out.println("0) Logout");
            System.out.print("Scelta: ");

            scelta = Integer.parseInt(scanner.nextLine());

            switch (scelta) {

                case 1 -> {
                    System.out.print("Descrizione ticket: ");
                    String desc = scanner.nextLine();
                    facade.creaTicket(desc, u);
                }

                case 2 -> view.mostra(facade.getAll());

                case 0 -> System.out.println("Logout...");

                default -> System.out.println("Scelta non valida.");
            }

        } while (scelta != 0);
    }

    // ============================================================
    // MENU ADMIN
    // ============================================================
    private void menuAdmin(User u) {

        int scelta;

        do {
            System.out.println("\n=== MENU ADMIN ===");
            System.out.println("1) Modifica ticket");
            System.out.println("2) Elimina ticket");
            System.out.println("3) Visualizza tutti i ticket");
            System.out.println("0) Logout");
            System.out.print("Scelta: ");

            scelta = Integer.parseInt(scanner.nextLine());

            switch (scelta) {

                case 1 -> {
                    System.out.print("ID ticket da modificare: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.print("Nuova descrizione: ");
                    String nuovaDesc = scanner.nextLine();
                    facade.modificaTicket(id, nuovaDesc, u);
                }

                case 2 -> {
                    System.out.print("ID ticket da eliminare: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    facade.eliminaTicket(id, u);
                }

                case 3 -> view.mostra(facade.getAll());

                case 0 -> System.out.println("Logout...");

                default -> System.out.println("Scelta non valida.");
            }

        } while (scelta != 0);
    }
}
