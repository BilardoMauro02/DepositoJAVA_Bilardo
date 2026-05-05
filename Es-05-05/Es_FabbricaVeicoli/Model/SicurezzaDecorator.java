package Model;

public class SicurezzaDecorator extends VeicoloDecorator {
    
    public SicurezzaDecorator(Veicolo veicolo) {
        super(veicolo);
    }

    @Override
    public String toString() {
        return veicolo.toString() + " con sistema di sicurezza avanzato";
    }
    
}
