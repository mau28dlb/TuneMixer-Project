package com.example.TuneMixer.Project.entity;

import jakarta.persistence.*;

import java.util.List;
@Entity
public class Playlist {

    @Id
    private Long id;
    private String nome;


    @OneToMany
    @JoinColumn(name = "id_user")
    private User user;

    @OneToMany(mappedBy = "playlist")
    private List<Brano> listaBrani;

    public Playlist(Long id, String nome, List<Brano> listaBrani, User user) {
        this.id = id;
        this.nome = nome;
        this.listaBrani = listaBrani;
        this.user = user;
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
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
