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

    @ManyToOne
    @JoinColumn(name = "album_id")
    private Album album;
    @ManyToOne
    @JoinColumn(name = "playlist_id")
    private Playlist playlist;
    @ManyToMany
    @JoinTable(name = "appartenenza",
            joinColumns = @JoinColumn(name = "brano_id"),
            inverseJoinColumns = @JoinColumn(name = "artista_id"))
    private List<Artista> artisti;

    public Brano(Long id, String titolo, List<Artista> artisti, Genere genere, Integer annoDiUscita, Double durataInMinutiSecondi, Premio premio, Playlist playlist, Album album) {
        this.id = id;
        this.titolo = titolo;
        this.artisti = artisti;
        this.genere = genere;
        this.annoDiUscita = annoDiUscita;
        this.durataInMinutiSecondi = durataInMinutiSecondi;
        this.premio = premio;
        this.album = album;
        this.playlist = playlist;
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

    public Playlist getPlaylist() {
        return playlist;
    }

    public void setPlaylist(Playlist playlist) {
        this.playlist = playlist;
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


