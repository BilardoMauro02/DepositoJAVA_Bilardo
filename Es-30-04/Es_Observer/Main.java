package Es_Observer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myFloatScanner = new Scanner(System.in);
        
        StazioneMeteo stazione = new StazioneMeteo();

        Display Console = new DisplayConsole();
        Display Mobile = new DisplayMobile();
        Display Statistiche = new DisplayStatistiche();

        stazione.aggiungiDisplay(Console);
        stazione.aggiungiDisplay(Mobile);
        stazione.aggiungiDisplay(Statistiche);

        stazione.setTemperatura(30.0f);

        System.out.println("seleziona la temperatura:");
        float temp = myFloatScanner.nextFloat();


        System.out.println("---------------------------- \nTemperatura inserita: " + temp);
        stazione.setTemperatura(temp);
        stazione.rimuoviDisplay(Console);
        stazione.setTemperatura(28.0f);

        myFloatScanner.close();
    }
}
