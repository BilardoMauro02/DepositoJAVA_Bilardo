package Es_DecoratorMedio.Concrete;

import Es_DecoratorMedio.Interface.Hamburger;

public class BaseHamburger implements Hamburger {
    
    @Override
    public String getDescrizione() {
        return "Hamburger classico";
    }

    @Override
    public double getPrezzo() {
        return 5.0;
    }
    
}
