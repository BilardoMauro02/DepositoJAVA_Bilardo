package Es_Registrazione;

import java.util.ArrayList;
import java.util.Scanner;

import Es_Registrazione.Singleton.NotifyManager;

public class Main {
    public static void main(String[] args) {
        Scanner myIntScanner = new Scanner(System.in);
        Scanner myStringScanner = new Scanner(System.in);

        NotifyManager manager = NotifyManager.getInstance();
        ArrayList<Utente> utenti = new ArrayList<>();
        Utente utenteLoggato = null;
        boolean loop = true;

        do{
            System.out.println("\n--- MENU ---\n1) Aggiungi utente\n2) Login\n3) Registrati alle notifiche\n4) Cancella registrazione dalle notifiche\n5) Esci");
            System.out.print("Scelta: ");
            int scelta = myIntScanner.nextInt();
            myIntScanner.nextLine(); // Consuma il ritorno a capo

            switch (scelta) {
                case 1:
                    System.out.println("Inserisci nome utente:");
                    String nomeUtente = myStringScanner.nextLine();
                    Utente nuovoUtente = new Utente(nomeUtente);
                    utenti.add(nuovoUtente);
                    break;
                case 2:
                    System.out.println("Inserisci nome utente per il login:");
                    String nomeUtenteLogin = myStringScanner.nextLine();
                    for (Utente utente : utenti) {
                        if (utente.getNome().equals(nomeUtenteLogin)) {
                            manager.login(utente);
                            break;
                        }
                    }
                    if (utenteLoggato == null) {
                        System.out.println("Utente non trovato.");
                    }
                    break;
                case 3:
                    if (utenteLoggato != null) {
                        manager.registraObserver(utenteLoggato);
                        System.out.println("Registrazione alle notifiche avvenuta con successo.");
                    } else {
                        System.out.println("Effettua il login per registrarti alle notifiche.");
                    }
                    break;
                case 4:
                    if (utenteLoggato != null) {
                        manager.rimuoviObserver(utenteLoggato);
                        System.out.println("Cancellazione registrazione dalle notifiche avvenuta con successo.");
                    } else {
                        System.out.println("Effettua il login per cancellare la registrazione dalle notifiche.");
                    }
                    break;
                case 5:
                    loop = false;
                    break;
                default:
                    System.out.println("Scelta non valida.");
            }
        }while(loop);
    }
}
