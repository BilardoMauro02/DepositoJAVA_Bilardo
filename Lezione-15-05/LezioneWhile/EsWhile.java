import java.util.Scanner;

public class EsWhile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;

        //System.out.println("Inserisci un numero (0 per uscire): ");
        //numero = sc.nextInt();

        // Esegue la condizione finché l'utente non inserisce 0
        /*
         * while (numero != 0) {
         *  System.out.println("Numero inserito: " + numero);
         *  System.out.println("Inserisci un altro numero (0 per uscire): ");
         *  numero = sc.nextInt();
         * }
         * 
         * System.out.println("Hai inserito 0, programma terminato.");
         */

        // DO-WHILE: Esegue almeno una volta, poi verifica la condizione

        /*
         * do {
         *  System.out.println("Inserisci un numero (0 per uscire): ");
         *  numero = sc.nextInt();
         *  if (numero != 0) {
         *      System.out.println("Numero inserito: " + numero);
         *  }
         * } while (numero != 0);
         */

        System.out.println("inserisci 1 numero per la sua tabellina");

        numero = sc.nextInt();
        System.out.println("tabellina del " + numero + ":");
        // il ciclo for ha bisogno di un indice, una condizione che ne indica il numero di ripetizioni, un incremento a ogni ciclo ripetuto
        for (int i = 1; i<=10; i++){
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        sc.close();

    }

}