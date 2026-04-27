package Scuola;

public abstract class Persona{
    private String nome;
    private int eta;

    Persona(String nome, int eta){
        this.nome = nome;
        this.eta = eta;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEta() {
        return this.eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public abstract void descriviRuolo();
}