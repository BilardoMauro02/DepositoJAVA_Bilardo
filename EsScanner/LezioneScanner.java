package EsScanner;

import java.util.Scanner;

public class LezioneScanner {

public static void main(String[] args) {
    
        // Creazione di due oggetti Scanner per leggere input da console
        Scanner sStringa = new Scanner(System.in); // crea un oggetto Scanner per leggere l'input da console
        Scanner sNumero = new Scanner(System.in); // crea un secondo oggetto Scanner
        
        /* 
        System.out.println("Inserisci un username: ");
        String inputUsername = sStringa.nextLine(); // legge una riga di testo 
        System.out.println("Hai inserito: " + inputUsername);

        System.out.println("Inserisci un numero: ");
        int inputNumero = sNumero.nextInt(); // legge un numero intero
        System.out.println("Hai inserito: " + inputNumero);
        */

        // STRUTTURE CONDIZIONALI (if/else e switch)

        /*gli operatori di confronto sono: >, <, >=, <=, ==, !=*/

        /* 
        System.out.println("Inserisci un numero: ");
        int numero = sNumero.nextInt(); // legge un numero intero
        System.out.println("inserisci un altro numero: ");
        int numero2 = sNumero.nextInt(); // legge un secondo numero intero

        // Confronto tra i due numeri inseriti e stampa del risultato (if = condizione da verificare, prende questa strada)
        if(numero > numero2) {
            System.out.println("Il primo numero è maggiore del secondo");
            
        }
        // Seconda condizione (else if = se la prima condizione è falsa, verifica questa seconda condizione, se è vera prende questa strada)
        else if (numero < numero2) {
            System.out.println("Il secondo numero è maggiore del primo");
        } 
        // Se nessuna delle condizioni precedenti viene soddisfatta, allora i due numeri sono uguali (else = se tutte le condizioni precedenti sono false, prende questa strada)
        else {
            System.out.println("I due numeri sono uguali");
        }
        */
        
        System.out.println("Inserisci 3 numeri");
        int a = sNumero.nextInt();
        int b = sNumero.nextInt();
        int c = sNumero.nextInt();

        // per effettuare più confronti usiamo gli operatori logici (&& = AND, || = OR, ! = NOT (il NOT ha bisogno delle parentesi per essere usato))
        if(a > b && a > c) {
            System.out.println("Il numero più grande è: " + a);
        } else if (b > a && b > c) {
            System.out.println("Il numero più grande è: " + b);
        } else if (c > a && c > b) {
            System.out.println("Il numero più grande è: " + c);
        } else {
            System.out.println("almeno 2 numeri uguali");
        }
    }
}
