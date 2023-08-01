package com.example.TuneMixer.Project.entity;
import com.example.TuneMixer.Project.entity.Enum.Genere;
import com.example.TuneMixer.Project.entity.Enum.Premio;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.*;
@Entity
public class Album {
    @Id
    private Long id;
    private String nome;
    private Genere genere;
    private Integer anno;
    private Double durata_album;
    @OneToMany(mappedBy = "album")
    private List<Brano> listaBrani;
    private Premio premio;

    public Album(Long id, String nome, Genere genere, Integer anno, Double durata_album) {
        this.id = id;
        this.nome = nome;
        this.genere = genere;
        this.anno = anno;
        this.durata_album = durata_album;
        this.listaBrani = new ArrayList<>();
    }

    public Album(Long id, String nome, Genere genere, Integer anno, Double durata_album, List<Brano> listaBrani) {
        this.id = id;
        this.nome = nome;
        this.genere = genere;
        this.anno = anno;
        this.durata_album = durata_album;
        this.listaBrani = listaBrani;
    }

    public Long getId_album() {
        return id;
    }

    public void setId_album(Long id_album) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Genere getGenere() {
        return genere;
    }

    public void setGenere(Genere genere) {
        this.genere = genere;
    }

    public Integer getAnno() {
        return anno;
    }

    public void setAnno(Integer anno) {
        this.anno = anno;
    }

    public Double getDurata_album() {
        return durata_album;
    }

    public void setDurata_album(Double durata_album) {
        this.durata_album = durata_album;
    }
}
