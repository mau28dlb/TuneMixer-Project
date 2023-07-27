package com.example.TuneMixer.Project.entity;

import java.util.List;

public class Playlist {

    private long id;
    private String nome;
    private List<Brano> listaBrani;

    public Playlist(long id, String nome, List<Brano> listaBrani) {
        this.id = id;
        this.nome = nome;
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

    public List<Brano> getListaBrani() {
        return listaBrani;
    }

    public void setListaBrani(List<Brano> listaBrani) {
        this.listaBrani = listaBrani;
    }
}
