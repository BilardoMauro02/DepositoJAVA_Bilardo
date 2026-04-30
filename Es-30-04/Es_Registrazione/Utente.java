package Es_Registrazione;

import Es_Registrazione.Observer.Observer;

public class Utente implements Observer {
    private String nome;

    public Utente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public void aggiorna(String messaggio) {
        System.out.println("Notifica per Utente " + nome + ": " + messaggio);
    }
    
}
