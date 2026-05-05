package Model;

public class VerniciaturaDecorator extends VeicoloDecorator {
    
    public VerniciaturaDecorator(Veicolo veicolo) {
        super(veicolo);
    }

    @Override
    public String toString() {
        return veicolo.toString() + " con verniciatura sportiva";
    }
    
}
