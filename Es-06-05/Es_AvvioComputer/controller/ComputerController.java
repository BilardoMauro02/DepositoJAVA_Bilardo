package Es_AvvioComputer.controller;

import java.util.Scanner;

import Es_AvvioComputer.facade.ComputerFacade;
import Es_AvvioComputer.model.strategy.AvvioNormale;
import Es_AvvioComputer.model.strategy.AvvioSicuro;
import Es_AvvioComputer.model.strategy.AvvioStrategy;
import Es_AvvioComputer.view.ConsoleView;

//CONTROLELR CHE GESTISCE L'INTERAZZIONE E LA VIEW
public class ComputerController {
    
    private ConsoleView view = new ConsoleView();
    private ComputerFacade facade = new ComputerFacade();

    public void avvia(){
        //RECUPERO DEL MENU DELLA CONSOLE
        view.mostraMenu();

        Scanner myIntSc = new Scanner(System.in);
        int scelta = myIntSc.nextInt();

        //CREO UNO STRATEGY DA DEFINIRE NELLO SWITCH
        AvvioStrategy strategy;

        switch (scelta) {
            case 1: 
                strategy = new AvvioNormale();
                break;
            case 2:
                strategy = new AvvioSicuro();
                break;
            default:
                view.stampaMessaggio("Scelta non Valida, riprova");
                return;                
        }

        //QUANDO LO SWITCH HA UNA SELEZIONE ESEGUE il facade.accendiComputer(strategy)
        facade.accendiComputer(strategy);
    }
}
