package com.example.TuneMixer.Project.entity;

import java.util.List;

public class Artista {

    private long id;
    private String nome;
    private Genere genere;
    private List<Brano> listaBrani;

    public Artista(long id, String nome, Genere genere, List<Brano> listaBrani) {
        this.id = id;
        this.nome = nome;
        this.genere = genere;
        this.listaBrani = listaBrani;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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
