package Es_DecoratorFacile.Concrete;

import Es_DecoratorFacile.Interface.Messaggio;


public class ConcreteMessaggio implements Messaggio{


    @Override
    public String getContenuto() {
        return "Contenuto del Messaggio Base";  
    }
    
}
