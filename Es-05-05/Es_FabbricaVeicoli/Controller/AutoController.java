package Controller;

import Model.Auto;
import View.AutoView;

public class AutoController {
    private Auto auto;
    private AutoView view;

    public AutoController(Auto auto, AutoView view) {
        this.auto = auto;
        this.view = view;
    }

    public void setMarca(String marca) {
        auto.setMarca(marca);
    }

    public void setModello(String modello) {
        auto.setModello(modello);
    }

    public void setMotore(String motore) {
        auto.setMotore(motore);
    }

    public void setRuote(int ruote) {
        auto.setRuote(ruote);
    }

    public void aggiornaVista() {
        view.stampaDettagli(auto);
    }
}
