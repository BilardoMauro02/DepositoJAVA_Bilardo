package Es_Singleton;

public class Utente {
    
    private String nome;

    public Utente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        Logger.getInstance().scriviMessaggio("toString chiamato da utente: " + nome);
        return "Utente{" +"nome='" + nome + '\'' +'}';
    }
}
