package Es_DecoratorMedio.Concrete;

import Es_DecoratorMedio.Decorator.Decorator;
import Es_DecoratorMedio.Interface.Hamburger;

public class FormaggioDecorator extends Decorator {

    public FormaggioDecorator(Hamburger componente) {
        super(componente);
    }

    @Override
    public String getDescrizione() {
        return super.getDescrizione() + ", Formaggio"; // Aggiunge la descrizione della decorazione
    }

    @Override
    public double getPrezzo() {
        return super.getPrezzo() + 0.50; // Aggiunge un costo fisso per la decorazione
    }
    
}
