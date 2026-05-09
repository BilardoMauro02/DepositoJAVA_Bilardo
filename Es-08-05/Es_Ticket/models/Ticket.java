package Es_Ticket.models;

public class Ticket {
    private int id;
    private String descrizione;
    private String stato;
    private String autore;

    public Ticket(int id, String descrizione, String stato, String autore) {
        this.id = id;
        this.descrizione = descrizione;
        this.stato = stato;
        this.autore = autore;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescrizione() {
        return this.descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getStato() {
        return this.stato;
    }

    public void setStato(String stato) {
        this.stato = stato;
    }

    public String getAutore() {
        return this.autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

}
