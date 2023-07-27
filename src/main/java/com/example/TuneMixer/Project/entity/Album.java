package com.example.TuneMixer.Project.entity;
import java.util.*;
public class Album {

    private long id;
    private String nome;
    private Genere genere;
    private int anno;
    private int durata_album;
    private List<Brano> listaBrani;

    public Album(long id, String nome, Genere genere, int anno, int durata_album) {
        this.id = id;
        this.nome = nome;
        this.genere = genere;
        this.anno = anno;
        this.durata_album = durata_album;
        this.listaBrani = new ArrayList<>();
    }

    public Album(long id, String nome, Genere genere, int anno, int durata_album, List<Brano> listaBrani) {
        this.id = id;
        this.nome = nome;
        this.genere = genere;
        this.anno = anno;
        this.durata_album = durata_album;
        this.listaBrani = listaBrani;
    }

    public long getId_album() {
        return id;
    }

    public void setId_album(long id_album) {
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

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public int getDurata_album() {
        return durata_album;
    }

    public void setDurata_album(int durata_album) {
        this.durata_album = durata_album;
    }
}
