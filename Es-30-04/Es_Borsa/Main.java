package Es_Borsa;

import Es_Borsa.Observer.Investitore;
import Es_Borsa.Singleton.S_Utente;
import Es_Borsa.Subject.InvestitoreBancario;
import Es_Borsa.Subject.InvestitorePrivato;

public class Main {
    
    public static void main(String[] args) {

        AgenziaBorsa agenzia = new AgenziaBorsa();
        
        Investitore utente = S_Utente.getInstance();
        
        Investitore privato= new InvestitorePrivato("Mario", "Rossi");
        Investitore bancario = new InvestitoreBancario("Banca");

        agenzia.aggiungiInvestitore(utente);
        agenzia.aggiungiInvestitore(privato);
        agenzia.aggiungiInvestitore(bancario);

        agenzia.aggiornaValoreAzione("Azione Bancaria", 150.0);

    }
}
