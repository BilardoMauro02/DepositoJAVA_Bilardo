package Es_Borsa;

import java.util.ArrayList;
import java.util.List;

import Es_Borsa.Observer.Investitore;

public class AgenziaBorsa{
    
    private List<Investitore> investitori = new ArrayList<>();

    public void aggiungiInvestitore(Investitore investitore) {
        investitori.add(investitore);
    }
    public void rimuoviInvestitore(Investitore investitore) {
        investitori.remove(investitore);
    }

    public void notificaInvestitori(String azione, double valore) {
        for (Investitore investitore : investitori) {
            investitore.notifica(azione, valore);
        }
    }

    public void aggiornaValoreAzione(String azione, double valore) {
        System.out.println("Agenzia aggiorna: " + azione + " a " + valore);
        notificaInvestitori(azione, valore);
    }
    
}
