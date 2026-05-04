package Es_DecoratorFacile.Concrete;

import Es_DecoratorFacile.Decorator.Decorator;
import Es_DecoratorFacile.Interface.Messaggio;

public class ConcreteDecorator extends Decorator{

    public ConcreteDecorator(Messaggio componente) {
        super(componente);
    }

    @Override
    public String getContenuto() {
        return componente.getContenuto().toUpperCase() + " Decorato con ConcreteDecorator";
    }
    
}
