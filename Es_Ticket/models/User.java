package Es_Ticket.models;

public class User {
    public enum Ruolo {USER, ADMIN}

    private String nome;
    private String password;
    private Ruolo ruolo;

    public User(String nome, String password, Ruolo ruolo) {
        this.nome = nome;
        this.password = password;
        this.ruolo = ruolo;
    }

    public Ruolo getRuolo(){
        return ruolo;
    }

    public String getNome(){
        return nome;
    }

    public String getPassword(){
        return password;
    }


}

