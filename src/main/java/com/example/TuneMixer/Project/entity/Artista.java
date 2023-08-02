package com.example.TuneMixer.Project.entity;

import com.example.TuneMixer.Project.entity.Enum.Genere;
import jakarta.persistence.*;


import java.util.List;

@Entity
@Table
public class Artista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String nome;
    @Column
    private Genere genere;
    @ManyToMany(mappedBy = "artisti")
    private List<Brano> listaBrani;



    public Artista(Long id, String nome, Genere genere, List<Brano> listaBrani) {
        this.id = id;
        this.nome = nome;
        this.genere = genere;
        this.listaBrani = listaBrani;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public List<Brano> getListaBrani() {
        return listaBrani;
    }

    public void setListaBrani(List<Brano> listaBrani) {
        this.listaBrani = listaBrani;
    }
}
