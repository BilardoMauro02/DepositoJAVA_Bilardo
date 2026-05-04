package Es_DecoratorDifficile.Model;

import Es_DecoratorDifficile.Observer.Observer;

public class Utente implements Observer{
    private String nome;
    private String cognome;

    public Utente(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    @Override
    public void update(String message) {
        System.out.println("Notifica per " + nome + " " + cognome + ": " + message);
    }
    
    @Override
    public String toString() {
        return nome + " " + cognome;
    }
}
