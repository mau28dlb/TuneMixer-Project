package com.example.TuneMixer.Project.entities;

import com.example.TuneMixer.Project.entities.Enums.GenereEnum;
import com.example.TuneMixer.Project.entities.Enums.PremioEnum;
import com.example.TuneMixer.Project.entities.Enums.RatingEnum;
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
    @Enumerated(EnumType.STRING)
    private GenereEnum genere;
    @Column
    private Integer annoDiUscita;
    @Column
    private Double durataInMinutiSecondi;
    @Column
    @Enumerated(EnumType.STRING)
    private RatingEnum rating;
    @ManyToOne
    private Album album;
    @ManyToMany
    @JoinTable(name = "brano_playlist",
            joinColumns = @JoinColumn(name = "brano_id"),
            inverseJoinColumns = @JoinColumn(name = "playlist_id"))
    private List<Playlist> listaPlaylist;
    @ManyToMany
    @JoinTable(name = "brano_artista",
            joinColumns = @JoinColumn(name = "brano_id"),
            inverseJoinColumns = @JoinColumn(name = "artista_id"))
    private List<Artista> artisti;

    public Brano(String titolo, List<Artista> artisti, GenereEnum genere, Integer annoDiUscita, Double durataInMinutiSecondi, RatingEnum rating, Album album) {
        this.titolo = titolo;
        this.artisti = artisti;
        this.genere = genere;
        this.annoDiUscita = annoDiUscita;
        this.durataInMinutiSecondi = durataInMinutiSecondi;
        this.album = album;
        this.rating = rating;
    }

    public Brano() {
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

    public GenereEnum getGenere() {
        return genere;
    }

    public void setGenere(GenereEnum genere) {
        this.genere = genere;
    }

    public RatingEnum getRating() {
        return rating;
    }

    public void setRating(RatingEnum rating) {
        this.rating = rating;
    }


}


