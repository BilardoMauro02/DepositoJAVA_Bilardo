package Model;

public abstract class Veicolo {
    private String motore;
    private String marca;
    private String modello;
    private int ruote;

    public Veicolo(String motore, String marca, String modello, int ruote) {
        this.motore = motore;
        this.marca = marca;
        this.modello = modello;
        this.ruote = ruote;
    }

    public String getMotore() {
        return motore;
    }

    public void setMotore(String motore) {
        this.motore = motore;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public int getRuote() {
        return ruote;
    }
    public void setRuote(int ruote) {
        this.ruote = ruote;
    }
}
