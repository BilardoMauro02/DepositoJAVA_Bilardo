package View;

import Model.Moto;

public class MotoView {
    public void stampaDettagli(Moto moto) {
        System.out.println("Dettagli Moto:");
        System.out.println("Motore: " + moto.getMotore());
        System.out.println("Marca: " + moto.getMarca());
        System.out.println("Modello: " + moto.getModello());
        System.out.println("Ruote: " + moto.getRuote());
    }
}
