package com.example.TuneMixer.Project.entity;

import com.example.TuneMixer.Project.entity.Enum.Genere;
import com.example.TuneMixer.Project.entity.Enum.Premio;

import java.util.List;

public class Brano {

    private Long id;
    private String titolo;
    private List<Artista> artisti;
    private Genere genere;
    private Integer annoDiUscita;
    private Double durataInMinutiSecondi;

    private Premio premio;

    public Brano(Long id, String titolo, List<Artista> artisti, Genere genere, Integer annoDiUscita, Double durataInMinutiSecondi, Premio premio) {
        this.id = id;
        this.titolo = titolo;
        this.artisti = artisti;
        this.genere = genere;
        this.annoDiUscita = annoDiUscita;
        this.durataInMinutiSecondi = durataInMinutiSecondi;
        this.premio = premio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Integer getAnnoDiUscita() {
        return annoDiUscita;
    }

    public void setAnnoDiUscita(Integer annoDiUscita) {
        this.annoDiUscita = annoDiUscita;
    }

    public Double getDurataInMinutiSecondi() {
        return durataInMinutiSecondi;
    }

    public void setDurataInMinutiSecondi(Double durataInMinutiSecondi) {
        this.durataInMinutiSecondi = durataInMinutiSecondi;
    }

    public Genere getGenere() {
        return genere;
    }

    public void setGenere(Genere genere) {
        this.genere = genere;
    }

    public Premio getPremio() {
        return premio;
    }

    public void setPremio(Premio premio) {
        this.premio = premio;
    }
}


