package EsercizioDatiUtente;

import java.util.Scanner;

public class Utente {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci la tua eta: ");
        int eta = scanner.nextInt();
        System.out.println("possiedi un biglietto? (true/false): ");
        boolean biglietto = scanner.nextBoolean();

        if (eta >= 18 && biglietto) {
            System.out.println("Puoi entrare.");
            
            System.out.println("puoi saltare la fila? (true/false): ");
            boolean saltaFila = scanner.nextBoolean();
            
            if (saltaFila) System.out.println("Puoi saltare la fila.");
        
        } else if (eta < 18) {
            
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