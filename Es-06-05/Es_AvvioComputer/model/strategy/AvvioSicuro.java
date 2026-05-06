package Es_AvvioComputer.model.strategy;

public class AvvioSicuro implements AvvioStrategy{

    @Override
    public void eseguiAvvio() {
        System.out.println("Avvio in modalita sicura");
    }
    
}
