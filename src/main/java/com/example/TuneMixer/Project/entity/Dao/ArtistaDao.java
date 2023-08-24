package com.example.TuneMixer.Project.entity.Dao;

import com.example.TuneMixer.Project.entity.Artista;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ArtistaDao {

    private List<Artista> artistaList = new ArrayList<>();

    public void addArtista(Artista artista){
        this.artistaList.add(artista);
    }

    public void deleteArtista(Artista nomeArtista){
        this.artistaList.removeIf(artista -> artista.getNome().equals(nomeArtista));
    }

    public void updateArtista(Artista artista){
        this.artistaList.removeIf(artista1 -> artista1.getNome().equals(artista.getNome()));
        this.artistaList.add(artista);
    }

    public List<Artista> getArtistaList(){
        return this.artistaList;
    }
}
