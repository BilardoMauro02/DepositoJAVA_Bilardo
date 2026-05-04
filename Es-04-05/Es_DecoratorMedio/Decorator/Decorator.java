package Es_DecoratorMedio.Decorator;

import Es_DecoratorMedio.Interface.Hamburger;

public abstract class Decorator implements Hamburger{
    protected Hamburger componente;

    public Decorator(Hamburger componente) {
        this.componente = componente;
    }
    
    @Override
    public String getDescrizione() {
        return componente.getDescrizione();
    }

    @Override
    public double getPrezzo() {
        return componente.getPrezzo();
    }
    
}
