package Es_DecoratorDifficile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Es_DecoratorDifficile.Decorator.Concrete.EmojiD;
import Es_DecoratorDifficile.Decorator.Concrete.PrefixD;
import Es_DecoratorDifficile.Decorator.Concrete.TimeStampD;
import Es_DecoratorDifficile.Decorator.Concrete.UpperCaseD;
import Es_DecoratorDifficile.Model.Utente;
import Es_DecoratorDifficile.Observer.Observer;
import Es_DecoratorDifficile.Singleton.NotificationManager;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        NotificationManager manager = NotificationManager.getInstance();

        List<Observer> utenti = new ArrayList<>();

        boolean loop = true;

        do{

            System.out.println("\n--- MENU ---");
            System.out.println("1) Crea nuovo utente");
            System.out.println("2) Login");
            System.out.println("3) Logout");
            System.out.println("4) Registrati alle notifiche");
            System.out.println("5) Deregistrati dalle notifiche");
            System.out.println("6) Invia notifica");
            System.out.println("0) Esci");
            System.out.print("Scelta: ");

            int scelta = sc.nextInt();
            sc.nextLine();

            switch (scelta) {

                case 1: // CREA UTENTE
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Cognome: ");
                    String cognome = sc.nextLine();

                    Observer user = new Utente(nome, cognome);

                    // DECORATOR
                    System.out.println("Vuoi aggiungere un decorator? \n1) Timestamp \n2) UpperCase \n3) Prefix \n4) Emoji \n0) Nessuno");
                    System.out.print("Scelta: ");
                    int dec = sc.nextInt();
                    sc.nextLine();

                    switch (dec) {
                        case 1:
                            user = new TimeStampD(user);
                            break;
                        case 2:
                            user = new UpperCaseD(user);
                            break;
                        case 3:
                            System.out.print("Inserisci prefisso: ");
                            String pref = sc.nextLine();
                            user = new PrefixD(user, pref);
                            break;
                        case 4:
                            System.out.print("Inserisci emoji: ");
                            String emoji = sc.nextLine();
                            user = new EmojiD(user, emoji);
                            break;
                        default:
                            break;
                    }

                    utenti.add(user);
                    System.out.println("Utente creato.");
                    break;

                case 2: // LOGIN
                    if (manager.getUtenteLoggato() != null) {
                        System.out.println("Errore: un utente è già loggato.");
                        break;
                    }

                    System.out.println("Scegli utente da loggare:");
                    for (int i = 0; i < utenti.size(); i++) {
                        System.out.println(i + ") " + utenti.get(i));
                    }

                    int idx = sc.nextInt();
                    sc.nextLine();

                    if (manager.login(utenti.get(idx))) {
                        System.out.println("Login effettuato.");
                    } else {
                        System.out.println("Errore: impossibile loggare.");
                    }
                    break;

                case 3: // LOGOUT
                    manager.logout();
                    System.out.println("Logout effettuato.");
                    break;

                case 4: // REGISTRAZIONE ALLE NOTIFICHE
                    if (manager.getUtenteLoggato() == null) {
                        System.out.println("Devi essere loggato.");
                        break;
                    }
                    manager.addObserver(manager.getUtenteLoggato());
                    System.out.println("Registrato alle notifiche.");
                    break;

                case 5: // DEREGISTRAZIONE
                    if (manager.getUtenteLoggato() == null) {
                        System.out.println("Devi essere loggato.");
                        break;
                    }
                    manager.removeObserver(manager.getUtenteLoggato());
                    System.out.println("Deregistrato dalle notifiche.");
                    break;

                case 6: // INVIA NOTIFICA
                    System.out.print("Messaggio: ");
                    String msg = sc.nextLine();
                    manager.inviaNotifica(msg);
                    break;

                case 0:
                    loop = false;
                    break;
            }
        }while(loop);

        sc.close();
    }
}
