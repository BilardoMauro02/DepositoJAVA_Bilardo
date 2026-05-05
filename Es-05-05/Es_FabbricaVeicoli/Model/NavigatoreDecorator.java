package Model;

public class NavigatoreDecorator extends VeicoloDecorator {
    
    public NavigatoreDecorator(Veicolo veicolo) {
        super(veicolo);
    }

    @Override
    public String toString() {
        return veicolo.toString() + " con navigatore";
    }
    
}
