import java.util.Scanner;

public class EsFor {
    public static void main(String[] args) {

        Scanner scInt = new Scanner(System.in);
        int nVoti = 0;
        int voto = 0;

        System.out.println("quanti voti vuoi inserire? ");

        while (nVoti <= 0) {
            nVoti = scInt.nextInt();
            if (nVoti <= 0) {
                System.out.println("il numero deve essere maggiore di 0");
            }
        }

        for (int i = 1; i <= nVoti;) {
            System.out.print("inserisci voto: ");
            voto = scInt.nextInt();
                //incremento dentro le condizioni per gestire i voti non validi
                if (voto >= 18 && voto <= 24) {
                    System.out.println("sufficente");
                    i++;
                } else if (voto > 24 && voto <= 30) {
                    System.out.println("Ottimo");
                    i++;
                } else if(voto > 0 && voto <18){
                    System.out.println("insufficente");
                    i++;
                }else{
                    System.out.println("Voto non valido");
                }
        }

    }
}