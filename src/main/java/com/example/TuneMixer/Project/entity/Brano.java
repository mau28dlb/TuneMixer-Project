package com.example.TuneMixer.Project.entity;

import com.example.TuneMixer.Project.entity.Enum.Genere;
import com.example.TuneMixer.Project.entity.Enum.Premio;
import com.example.TuneMixer.Project.entity.Enum.Rating;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Brano {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String titolo;
    @Column
    private Genere genere;
    @Column
    private Integer annoDiUscita;
    @Column
    private Double durataInMinutiSecondi;
    @Column
    private Rating rating;
    @ManyToOne
    private Album album;
    @ManyToOne
    private Playlist playlist;
    @ManyToMany
    @JoinTable(name = "brano_artista",
            joinColumns = @JoinColumn(name = "brano_id"),
            inverseJoinColumns = @JoinColumn(name = "artista_id"))
    private List<Artista> artisti;

    public Brano(Long id, String titolo, List<Artista> artisti, Genere genere, Integer annoDiUscita, Double durataInMinutiSecondi, Rating rating, Album album) {
        this.id = id;
        this.titolo = titolo;
        this.artisti = artisti;
        this.genere = genere;
        this.annoDiUscita = annoDiUscita;
        this.durataInMinutiSecondi = durataInMinutiSecondi;
        this.album = album;
        this.rating = rating;
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

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
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

    public Rating getRating() {
        return rating;
    }

    public void setRating(Premio premio) {
        this.rating = rating;
    }
}


