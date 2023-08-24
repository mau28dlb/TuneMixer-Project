package com.example.TuneMixer.Project.entity;
import com.example.TuneMixer.Project.entity.Enum.Genere;
import com.example.TuneMixer.Project.entity.Enum.Premio;
import jakarta.persistence.*;

import java.util.*;
@Entity
@Table
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String nome;
    @Column
    @Enumerated(EnumType.STRING)
    private Genere genere;
    @Column
    private Integer anno;
    @Column
    private Double durata_album;
    @Column
    @Enumerated(EnumType.STRING)
    private Premio premio;
    @OneToMany(mappedBy = "album")
    private List<Brano> listaBrani;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Premio getPremio() {
        return premio;
    }

    public void setPremio(Premio premio) {
        this.premio = premio;
    }

    public List<Brano> getListaBrani() {
        return listaBrani;
    }

    public void setListaBrani(List<Brano> listaBrani) {
        this.listaBrani = listaBrani;
    }


}
