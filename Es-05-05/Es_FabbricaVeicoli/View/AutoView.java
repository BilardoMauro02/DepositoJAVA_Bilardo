package View;

import Model.Auto;

public class AutoView {
    public void stampaDettagli(Auto auto) {
        System.out.println("Dettagli Auto:");
        System.out.println("Motore: " + auto.getMotore());
        System.out.println("Marca: " + auto.getMarca());
        System.out.println("Modello: " + auto.getModello());
        System.out.println("Ruote: " + auto.getRuote());
    }
}
