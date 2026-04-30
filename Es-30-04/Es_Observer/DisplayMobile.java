package Es_Observer;

public class DisplayMobile implements Display {
    
    @Override
    public void aggiorna(float temperatura) {
        System.out.println("Temperatura aggiornata (mobile): " + temperatura);
    }
    
}
