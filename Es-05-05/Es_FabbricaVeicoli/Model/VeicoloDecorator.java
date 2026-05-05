package Model;

public abstract class VeicoloDecorator extends Veicolo {
    
    protected Veicolo veicolo;

    public VeicoloDecorator(Veicolo veicolo) {
        super(veicolo.getMotore(), veicolo.getMarca(), veicolo.getModello(), veicolo.getRuote());
        this.veicolo = veicolo;
    }
    
    @Override
    public abstract String toString();
}
