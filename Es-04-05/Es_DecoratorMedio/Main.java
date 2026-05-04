package Es_DecoratorMedio;

import java.util.Scanner;

import Es_DecoratorMedio.Concrete.BaconDecorator;
import Es_DecoratorMedio.Concrete.BaseHamburger;
import Es_DecoratorMedio.Concrete.FormaggioDecorator;
import Es_DecoratorMedio.Interface.Hamburger;

public class Main {

    public static void main(String[] args) {

        Scanner myIntSc = new Scanner(System.in);

        Hamburger burger = new BaseHamburger();

        boolean loop = true;

        do {

            System.out.println("Scegli cosa vuoi aggiungere tipo di hamburger: \n1) Bacon \n2) Hamburger con formaggio \n3) Hamburger normale \n4) Completa ordine");
            int scelta = myIntSc.nextInt();
            switch (scelta) {
                case 1:
                    burger = new BaconDecorator(burger);
                    System.out.println("Bacon aggiunto! Descrizione: " + burger.getDescrizione() + " Prezzo: " + burger.getPrezzo());
                    break;

                case 2:
                    burger = new FormaggioDecorator(burger);
                    System.out.println("Formaggio aggiunto! Descrizione: " + burger.getDescrizione() + " Prezzo: " + burger.getPrezzo());
                    break;

                case 3:
                    System.out.println("Hamburger normale! Descrizione: " + burger.getDescrizione() + " Prezzo: " + burger.getPrezzo());
                    break;

                case 4:
                    loop = false;
                    System.out.println("Grazie per aver usato il nostro servizio!");
                    break;
                default:
                    System.out.println("Scelta non valida");
                    break;
            }
        } while (loop);

        System.out.println("Riepilogo ordine:" + burger.getDescrizione());
        System.out.println("Prezzo totale: " + burger.getPrezzo());

        myIntSc.close();
    }
}
