package Es_Borsa.Subject;

import Es_Borsa.Observer.Investitore;

public class InvestitoreBancario implements Investitore {
    
    private String nomeBanca;

    public InvestitoreBancario(String nomeBanca) {
        this.nomeBanca = nomeBanca;
    }

    @Override
    public void notifica(String azione, double valore) {
        System.out.println("Investitore Bancario " + nomeBanca + " ha ricevuto notifica: " + azione + " a " + valore);
    }
}
