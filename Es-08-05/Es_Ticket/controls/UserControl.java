package Es_Ticket.controls;

import java.util.List;
import java.util.Scanner;

import Es_Ticket.models.User;
import Es_Ticket.views.UserView;

public class UserControl {
    private List<User> utenti;
    private UserView view;
    private Scanner myIntSc = new Scanner(System.in);
    private Scanner myStrSc = new Scanner(System.in);

    public UserControl(List<User> utenti){
        this.utenti = utenti;
        this.view = new UserView();
    }

    public void registraUtente(){
        int scelta;

        do{
            view.mostraMenu();
            scelta = myIntSc.nextInt();
            switch (scelta) {
                case 1:
                    System.out.print("inserisci nome: ");
                    String nome = myStrSc.nextLine();
                    System.out.println("inserisci password: ");
                    String password = myStrSc.nextLine();
                    utenti.add(new User(nome, password, User.Ruolo.USER));
                    System.out.println("Utente Registrato");
                    break;
                case 2: 
                    System.out.print("Inserisci username: ");
                    String nomeAdmin = myStrSc.nextLine();
                    System.out.print("Inserisci password: ");
                    String passwordAdmin = myStrSc.nextLine();
                    utenti.add(new User(nomeAdmin, passwordAdmin, User.Ruolo.ADMIN));
                    System.out.println("Admin registrato.");
                    break;
                case 3:
                    System.out.println("Ritorno al menu principale");
                    break;
                default:
                    System.out.println("Scelta non valida");
                    break;
            }
        }while (scelta != 3);
    }

    public User login(){
        view.mostraLogin();

        System.out.println("Nome: ");
        String nome = myStrSc.nextLine();
        System.out.println("Password: ");
        String password = myStrSc.nextLine();

        return utenti.stream()
        .filter(u -> u.getNome().equals(nome) && u.getPassword().equals(password))
        .findFirst()
        .orElse(null);
    }
}
