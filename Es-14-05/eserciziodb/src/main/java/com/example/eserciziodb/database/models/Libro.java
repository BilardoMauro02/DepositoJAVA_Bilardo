package com.example.eserciziodb.database.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "libri")
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "autore", nullable = false, length = 255)
    private String autore;

    @Column(name = "titolo", nullable = false, length = 255)
    private String titolo;

    @Enumerated(EnumType.STRING)
    @Column(name = "genere", nullable = false, length = 255)
    private Genere genere;
    
    @Column(name = "pagine", nullable = false, length = 255)
    private int pagine;

    
    public Libro(){}


    public Libro(Integer id, String autore, String titolo, Genere genere, int pagine) {
        this.id = id;
        this.autore = autore;
        this.titolo = titolo;
        this.genere = genere;
        this.pagine = pagine;
    }
    

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAutore() {
        return this.autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getTitolo() {
        return this.titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public Genere getGenere() {
        return this.genere;
    }

    public void setGenere(Genere genere) {
        this.genere = genere;
    }

    public int getPagine() {
        return this.pagine;
    }

    public void setPagine(int pagine) {
        this.pagine = pagine;
    }

}