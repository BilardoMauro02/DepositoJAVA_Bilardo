package Es_DbSingleton;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner myIntScanner = new Scanner(System.in);
        Scanner myStringScanner = new Scanner(System.in);

        boolean loop = true;

        System.out.println("Creazioene di un nuovo S_DbManager...");
        S_DbManager dbManager = S_DbManager.getInstance();
        dbManager.connect();
        System.out.println("Creazioene di un nuovo S_DbManager...");
        S_DbManager dbManager2 = S_DbManager.getInstance();
        dbManager2.connect();
        dbManager.getConnectionCount();

        do{
            System.out.println("--------MENU-------- \n1. Aggiungi Utente \n2. Modifica Utente \n3. Elimina Utente \n4. Visualizza Utenti \n5. Esci");
            System.out.print("Scegli un'opzione: ");
            int scelta = myIntScanner.nextInt();
            switch (scelta) {
                //AGGIUNTA DI UN UTENTE E SALVATAGGIO IN ARRAYLIST PRESENTE IN dbManager
                case 1:
                    System.out.print("Inserisci nome: ");
                    String nome = myStringScanner.nextLine();
                    System.out.print("Inserisci cognome: ");
                    String cognome = myStringScanner.nextLine();
                    System.out.print("Inserisci età: ");
                    String eta = myStringScanner.nextLine();
                    Utente utente = new Utente(nome, cognome, eta);
                    dbManager.addUtente(utente);
                    System.out.println("Utente aggiunto: " + utente);
                    break;
                case 2:
                    //RECUPERO DELLA LISTA DI UTENTI PER POI SCEGLIERE QUALE MODIFICARE
                    System.out.println("Quale utente vuoi modificare?");
                    for (Utente u : dbManager.getUtenti()) {
                        System.out.println(u);
                    }
                    String utenteDaModificare = myStringScanner.nextLine();
                    Utente utenteDaModificareObj = null;
                    for (Utente u : dbManager.getUtenti()) {
                        if (u.getNome().equalsIgnoreCase(utenteDaModificare)) {
                            utenteDaModificareObj = u;
                            break;
                        }
                    }
                    if (utenteDaModificareObj != null) {
                        System.out.print("Inserisci nuovo nome: ");
                        String nuovoNome = myStringScanner.nextLine();
                        System.out.print("Inserisci nuovo cognome: ");
                        String nuovoCognome = myStringScanner.nextLine();
                        System.out.print("Inserisci nuova età: ");
                        String nuovaEta = myStringScanner.nextLine();
                        utenteDaModificareObj.setNome(nuovoNome);
                        utenteDaModificareObj.setCognome(nuovoCognome);
                        utenteDaModificareObj.setEta(nuovaEta);
                        System.out.println("Utente modificato: " + utenteDaModificareObj);
                    } else {
                        System.out.println("Utente non trovato.");
                    }
                    break;
                case 3:
                    //SELEZIONE DI UN UTENTE DA ELIMINARE PRESENTE NEL DB
                    System.out.println("Quale utente vuoi eliminare?");
                    for (Utente u : dbManager.getUtenti()) {
                        System.out.println(u);
                    }
                    String utenteDaEliminare = myStringScanner.nextLine();
                    Utente utenteDaEliminareObj = null;
                    for (Utente u : dbManager.getUtenti()) {
                        if (u.getNome().equalsIgnoreCase(utenteDaEliminare)) {
                            utenteDaEliminareObj = u;
                            break;
                        }
                    }
                    if (utenteDaEliminareObj != null) {
                        dbManager.getUtenti().remove(utenteDaEliminareObj);
                        System.out.println("Utente eliminato: " + utenteDaEliminareObj);
                    } else {
                        System.out.println("Utente non trovato.");
                    }
                    break;
                case 4:
                    //STAMPA DI TUTTI GLI UTENTI ATTUALMENTE REGISTRATI
                    System.out.println("Utenti registrati:");
                    for (Utente u : dbManager.getUtenti()) {
                        System.out.println(u);
                    }
                    break;
                case 5:
                    loop = false;
                    System.out.println("Uscita dal programma...");
                    break;
                default:
                    System.out.println("Opzione non valida. Riprova.");
            }
        }while(loop);

        myIntScanner.close();
        myStringScanner.close();

    }
}
