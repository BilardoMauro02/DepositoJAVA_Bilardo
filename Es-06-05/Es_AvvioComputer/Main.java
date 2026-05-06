package Es_AvvioComputer;

import Es_AvvioComputer.controller.ComputerController;

public class Main {
    public static void main(String[] args) {
    
        //USANDO SOLO IL CONTROLELR GESTISCO LA CREAZIONE DEL COMPUTER
        //ALL'INTERNO DEL CONTROLLER SONO PRESENTI LA VIEW E IL FACADE
        ComputerController computer = new ComputerController();
        computer.avvia();
    }
}
