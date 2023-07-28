package com.example.TuneMixer.Project.entity;

import java.util.List;

public class Playlist {

    private Long id;
    private String nome;
    private List<Brano> listaBrani;

    public Playlist(Long id, String nome, List<Brano> listaBrani) {
        this.id = id;
        this.nome = nome;
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

    public List<Brano> getListaBrani() {
        return listaBrani;
    }

    public void setListaBrani(List<Brano> listaBrani) {
        this.listaBrani = listaBrani;
    }
}
