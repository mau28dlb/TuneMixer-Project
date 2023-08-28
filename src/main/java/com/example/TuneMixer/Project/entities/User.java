package com.example.TuneMixer.Project.entities;

import jakarta.persistence.*;

import java.util.*;
@Entity
@Table
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String nickname;
    @Column
    private String password;
    @Column
    private String email;
    @OneToMany(mappedBy = "user")
    private List<Playlist> listaPlaylist;



    public User(Long id, String nickname, String password, String email) {
        this.id = id;
        this.nickname = nickname;
        this.password = password;
        this.email = email;
        this.listaPlaylist = new ArrayList<>();
    }

    public User(Long id, String nickname, String password, String email, List<Playlist> listaPlaylist) {
        this.id = id;
        this.nickname = nickname;
        this.password = password;
        this.email = email;
        this.listaPlaylist = listaPlaylist;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
