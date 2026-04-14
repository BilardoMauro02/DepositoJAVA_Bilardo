package EsercizioDatiUtente;

import java.util.Scanner;

public class Utente {
    public static void main(String[] args) {

        /*  
        IN QUESTO ESEMPIO CHIEDIAMO ALL'UTENTE DI INSERIRE LA PROPRIA ETA E SE POSSIEDE UN BIGLIETTO, POI VERIFICHIAMO SE PUO ENTRARE O MENO IN BASE A QUESTE INFORMAZIONI.
        SE L'UTENTE E MINORENNE, CHIEDIAMO SE E ACCOMPAGNATO DA UN ADULTO
        (USANDO SOLO IF/ELSE e SCANNER)
        */

        // Chiedi all'utente di inserire la propria età e se possiede un biglietto
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci la tua eta: ");
        int eta = scanner.nextInt();

        // Controlla se l'utente possiede un biglietto
        System.out.println("possiedi un biglietto? (true/false): ");
        boolean biglietto = scanner.nextBoolean();

        // Verifica se l'utente può entrare
        if (eta >= 18 && biglietto) {
            System.out.println("Puoi entrare.");
            
            System.out.println("puoi saltare la fila? (true/false): ");
            boolean saltaFila = scanner.nextBoolean();
            
            // Se l'utente può saltare la fila, stampiamo un messaggio
            if (saltaFila) System.out.println("Puoi saltare la fila.");
        
        }
        // Se l'utente è minorenne, chiediamo se è accompagnato da un adulto 
        else if (eta < 18) {
            System.out.println("sei accompagnato? (true/false): ");
            boolean accompagnato = scanner.nextBoolean();
                if (accompagnato) {
                    System.out.println("Puoi entrare, sei accompagnato.");
                    
                    System.out.println("puoi saltare la fila? (true/false): ");
                    boolean saltaFila = scanner.nextBoolean();
                    if (saltaFila) {
                        System.out.println("Puoi saltare la fila.");
                    }else {
                        System.out.println("Non puoi saltare la fila.");
                    }
                }else {
                    System.out.println("Non puoi entrare, non sei maggiorenne e non sei accompagnato.");
                }
        } 
            else {
                System.out.println("Non puoi entrare, non hai un biglietto.");
            }
    }
}