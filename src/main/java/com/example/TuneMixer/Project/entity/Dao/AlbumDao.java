package com.example.TuneMixer.Project.entity.Dao;
import com.example.TuneMixer.Project.entity.Album;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class AlbumDao {
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
