package Es_DecoratorFacile.Decorator;

import Es_DecoratorFacile.Interface.Messaggio;

public abstract class Decorator implements Messaggio {
    protected Messaggio componente;

    public Decorator(Messaggio componente) {
        this.componente = componente;
    }

    @Override
    public String getContenuto() {
        return componente.getContenuto();
    }
}