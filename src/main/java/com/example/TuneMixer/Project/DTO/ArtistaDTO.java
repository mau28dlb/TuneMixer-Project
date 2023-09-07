package com.example.TuneMixer.Project.DTO;

import com.example.TuneMixer.Project.entities.Enums.GenereEnum;

public class ArtistaDTO {

    private Long id;
    private String nome;
    private GenereEnum genere;

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

    public GenereEnum getGenere() {
        return genere;
    }

    public void setGenere(GenereEnum genere) {
        this.genere = genere;
    }
}
