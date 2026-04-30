package Es_Observer;

import java.util.ArrayList;
import java.util.List;

public class StazioneMeteo {
    private float temperatura;
    private List<Display> displays = new ArrayList<>();

    public void aggiungiDisplay(Display display) {
        displays.add(display);
    }

    public void rimuoviDisplay(Display display) {
        displays.remove(display);
    }
    
    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Display display : displays) {
            display.aggiorna(temperatura);
        }
    }
}
