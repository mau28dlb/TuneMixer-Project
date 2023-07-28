package com.example.TuneMixer.Project.entity;

import java.util.*;

public class User {
    private Long id;
    private String nickname;
    private String password;
    private String email;
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

    public Long getId_utente() {
        return id;
    }

    public void setId_utente(Long id_utente) {
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
