package Scuola;

public class Docente extends Persona implements Registrabile{
    
    private String materia;

    public Docente(String nome, int eta, String materia) {
        super(nome, eta);
        this.materia = materia;
    }

    public String getMateria() {
        return this.materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public void registrazione() {
        System.out.println("Registrazione tramite segreteria didattica");
    }

    @Override
    public void descriviRuolo() {
        System.out.println("Sono un docente di " + materia);
    }
    
}
