package Controller;

import Model.Moto;
import View.MotoView;

public class MotoController {
    
    private Moto moto;
    private MotoView view;

    public MotoController(Moto moto, MotoView view) {
        this.moto = moto;
        this.view = view;
    }

    public void setMarca(String marca) {
        moto.setMarca(marca);
    }

    public void setModello(String modello) {
        moto.setModello(modello);
    }

    public void setMotore(String motore) {
        moto.setMotore(motore);
    }

    public void setRuote(int ruote) {
        moto.setRuote(ruote);
    }

    public void aggiornaVista() {
        view.stampaDettagli(moto);
    }
}
