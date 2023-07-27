package com.example.TuneMixer.Project.entity;

import java.util.List;

public class Brano {

    private long id;
    private String titolo;
    private List<Artista> artisti;
    private Genere genere;
    private int annoDiUscita;
    private double durataInMinutiSecondi;

    public Brano(long id, String titolo, List<Artista> artisti, Genere genere, int annoDiUscita, double durataInMinutiSecondi) {
        this.id = id;
        this.titolo = titolo;
        this.artisti = artisti;
        this.genere = genere;
        this.annoDiUscita = annoDiUscita;
        this.durataInMinutiSecondi = durataInMinutiSecondi;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public List<Artista> getArtisti() {
        return artisti;
    }

    public void setArtisti(List<Artista> artisti) {
        this.artisti = artisti;
    }

    public int getAnnoDiUscita() {
        return annoDiUscita;
    }

    public void setAnnoDiUscita(int annoDiUscita) {
        this.annoDiUscita = annoDiUscita;
    }

    public double getDurataInMinutiSecondi() {
        return durataInMinutiSecondi;
    }

    public void setDurataInMinutiSecondi(double durataInMinutiSecondi) {
        this.durataInMinutiSecondi = durataInMinutiSecondi;
    }

    public Genere getGenere() {
        return genere;
    }

    public void setGenere(Genere genere) {
        this.genere = genere;
    }
}
