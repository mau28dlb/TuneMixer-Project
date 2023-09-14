package com.example.TuneMixer.Project.DTO;

import com.example.TuneMixer.Project.entities.Brano;
import com.example.TuneMixer.Project.entities.User;

import java.util.List;

public class PlaylistDTO {

    private Long id;
    private String nome;
    private User user;
    private List<Brano> listaBrani;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Brano> getListaBrani() {
        return listaBrani;
    }

    public void setListaBrani(List<Brano> listaBrani) {
        this.listaBrani = listaBrani;
    }
}
