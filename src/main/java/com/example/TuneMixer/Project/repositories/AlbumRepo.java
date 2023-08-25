package com.example.TuneMixer.Project.repositories;
import com.example.TuneMixer.Project.entities.Album;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class AlbumRepo {
    private List<Album> listaAlbum = new ArrayList<>();

    public void addAlbum(Album album){
        this.listaAlbum.add(album);
    }

    public void deleteAlbum (String albumName){
        this.listaAlbum.removeIf(meal -> meal.getNome().equals(albumName));
    }

    public void updateAlbum(Album album){
        this.listaAlbum.removeIf(meal1 -> album.getNome().equals(album.getNome()));
        this.listaAlbum.add(album);
    }

    public List<Album> getAlbums (){
        return this.listaAlbum;
    }




}
