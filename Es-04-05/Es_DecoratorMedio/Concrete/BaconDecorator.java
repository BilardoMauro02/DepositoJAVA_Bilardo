package Es_DecoratorMedio.Concrete;

import Es_DecoratorMedio.Decorator.Decorator;
import Es_DecoratorMedio.Interface.Hamburger;

public class BaconDecorator extends Decorator {

    public BaconDecorator(Hamburger componente) {
        super(componente);
    }

    @Override
    public String getDescrizione() {
        return componente.getDescrizione();
    }

    @Override
    public double getPrezzo() {
        return componente.getPrezzo() + 0.80;
    }
    
}
