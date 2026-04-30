package Es_Observer;

public class DisplayStatistiche implements Display {
    
    private float temperaturaMinima = Float.MAX_VALUE;
    private float temperaturaMassima = Float.MIN_VALUE;
    private float sommaTemperatura = 0;
    private int numeroLetture = 0;
    
    @Override
    public void aggiorna(float temperatura) {
        if (temperatura < temperaturaMinima) {
            temperaturaMinima = temperatura;
        }
        if (temperatura > temperaturaMassima) {
            temperaturaMassima = temperatura;
        }
        sommaTemperatura += temperatura;
        numeroLetture++;
        
        System.out.println("Statistiche aggiornate:");
        System.out.println("Temperatura minima: " + temperaturaMinima);
        System.out.println("Temperatura massima: " + temperaturaMassima);
        System.out.println("Temperatura media: " + (sommaTemperatura / numeroLetture));
    }
    
}
