package com.example.TuneMixer.Project.entity;

import com.example.TuneMixer.Project.entity.Enum.Genere;
import com.example.TuneMixer.Project.entity.Enum.Premio;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Brano {

    @Id
    private Long id;
    private String titolo;
    private Genere genere;
    private Integer annoDiUscita;
    private Double durataInMinutiSecondi;
    private Premio premio;

    @ManyToMany
    @JoinTable(name = "appartenenza",
            joinColumns = @JoinColumn(name = "brano_id"),
            inverseJoinColumns = @JoinColumn(name = "artista_id"))
    private List<Artista> artisti;

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


