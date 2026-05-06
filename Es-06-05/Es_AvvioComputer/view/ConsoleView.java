package Es_AvvioComputer.view;

public class ConsoleView {
    public void mostraMenu(){
        System.out.println("---SELEZIONA TIPO DI AVVIO--- \n1)Avvio Normale \n2)Avvio Sicuro");
        System.out.print("Scelta: ");
    }

    //METODO DI STAMPA IN CASO DI ERRORI
    public void stampaMessaggio(String msg){
        System.out.println(msg);
    }
}
