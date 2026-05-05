package View;


import Model.Auto;
import Model.Fabbrica;
import Model.Moto;
import Model.Observer;
import Model.Veicolo;

public class ConsoleView implements Observer {
    @Override
    public void update() {
        System.out.println("\n--- Aggiornamento lista veicoli ---");
        for (var v : Fabbrica.getInstance().getVeicoli()) {
            System.out.println(v);
        }
    }

    public void mostraLista() {
        System.out.println("\n--- VEICOLI IN PRODUZIONE ---");
        for (Veicolo v : Fabbrica.getInstance().getVeicoli()) {
            System.out.println(v);
        }
    }

    public void mostraSoloAuto() {
        System.out.println("\n--- AUTO IN PRODUZIONE ---");
        for (Veicolo v : Fabbrica.getInstance().getVeicoli()) {
            if (v instanceof Auto) {
                System.out.println(v);
            }
        }
    }

    public void mostraSoloMoto() {
        System.out.println("\n--- MOTO IN PRODUZIONE ---");
        for (Veicolo v : Fabbrica.getInstance().getVeicoli()) {
            if (v instanceof Moto) {
                System.out.println(v);
            }
        }
    }

}
