package Es_Observer;

public class DisplayConsole implements Display {
    
    @Override
    public void aggiorna(float temperatura) {
        System.out.println("Temperatura aggiornata: " + temperatura);
    }
    
}
