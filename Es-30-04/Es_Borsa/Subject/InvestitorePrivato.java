package Es_Borsa.Subject;

import Es_Borsa.Observer.Investitore;

public class InvestitorePrivato implements Investitore {
    private String nome;
    private String cognome;

    public InvestitorePrivato(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    @Override
    public void notifica(String azione, double valore) {
        System.out.println("Investitore Privato " + nome + " " + cognome + " ha ricevuto notifica: " + azione + " a " + valore);
    }
    
}
