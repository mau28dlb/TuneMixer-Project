package com.example.TuneMixer.Project.entities;
import com.example.TuneMixer.Project.entities.Enums.GenereEnum;
import com.example.TuneMixer.Project.entities.Enums.PremioEnum;
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
    private GenereEnum genere;
    @Column
    private Integer anno;
    @Column
    private Double durata_album;
    @Column
    @Enumerated(EnumType.STRING)
    private PremioEnum premio;
    @OneToMany(mappedBy = "album")
    private List<Brano> listaBrani;

    public Album(String nome, GenereEnum genere, Integer anno, Double durata_album) {
        this.nome = nome;
        this.genere = genere;
        this.anno = anno;
        this.durata_album = durata_album;
        this.listaBrani = new ArrayList<>();
    }

//    public Album(Long id, String nome, GenereEnum genere, Integer anno, Double durata_album, List<Brano> listaBrani) {
//        this.id = id;
//        this.nome = nome;
//        this.genere = genere;
//        this.anno = anno;
//        this.durata_album = durata_album;
//        this.listaBrani = listaBrani;
//    }

    public Album(){};

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public GenereEnum getGenere() {
        return genere;
    }

    public void setGenere(GenereEnum genere) {
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

    public PremioEnum getPremio() {
        return premio;
    }

    public void setPremio(PremioEnum premio) {
        this.premio = premio;
    }

    public List<Brano> getListaBrani() {
        return listaBrani;
    }

    public void setListaBrani(List<Brano> listaBrani) {
        this.listaBrani = listaBrani;
    }


}
