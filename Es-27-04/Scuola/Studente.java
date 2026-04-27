package Scuola;

import java.util.ArrayList;

public class Studente extends Persona implements Registrabile{
        private String corso;
        private int anno;
        private ArrayList<Integer> listaVoti;

    Studente(String nome, int eta, String corso, int anno){
        super(nome, eta);
        this.corso = corso;
        this.anno = anno;
        this.listaVoti = new ArrayList<>();
    }

    public String getCorso() {
        return this.corso;
    }

    public void setCorso(String corso) {
        this.corso = corso;
    }

    public int getAnno() {
        return this.anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public ArrayList<Integer> getVoti(){
        return this.listaVoti;
    }

    public void addVoto(int voto){
        listaVoti.add(voto);
        System.out.println("Voto Aggiunto al registro: " + voto);
    }
    
    @Override
    public void descriviRuolo() {
        System.out.println("sono uno studente della classe: " + anno + corso);
    }
    @Override
    public void registrazione() {
        System.out.println("registrazione tramite modulo online");
    }

    public void stampaVoti(){};
    
}
