package Es_AvvioComputer.facade;

import Es_AvvioComputer.model.Bios;
import Es_AvvioComputer.model.Harddisk;
import Es_AvvioComputer.model.SistemaOperativo;
import Es_AvvioComputer.model.strategy.AvvioStrategy;

//CLASSE DI FACADE
public class ComputerFacade {
    // CREAZIONE DI BIOS/HARDISK/SISTEMA OPERATIVO
    private Bios bios = new Bios();
    private Harddisk hd = new Harddisk();
    private SistemaOperativo system = new SistemaOperativo();
    
    //IL METODO ACCENDI COMPUTER RICHIEDE UNO STRATEGY
    public void accendiComputer(AvvioStrategy s){
        s.eseguiAvvio();
        bios.inizializza();
        hd.carica();
        system.avvia();
    }
}
