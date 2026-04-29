package Es_DbSingleton;

public class Utente {
    private String nome;
    private String cognome;
    private String eta;

    public Utente(String nome, String cognome, String eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
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

    public String getEta() {
        return eta;
    }

    public void setEta(String eta) {
        this.eta = eta;
    }

    public Utente GetUtente(String nome) {
        if (nome.equalsIgnoreCase(this.nome)) {
            return this;
        } else {
            return null;
        }
        
    }

    @Override
    public String toString() {
        return "Utente{nome:" + nome + ", cognome:" + cognome + ", eta:" + eta + "}";
    }


}
