package com.example.TuneMixer.Project.services;

import com.example.TuneMixer.Project.entities.Album;
import com.example.TuneMixer.Project.entities.Brano;
import com.example.TuneMixer.Project.repositories.AlbumRepo;
import com.example.TuneMixer.Project.repositories.BranoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlbumService {

    private AlbumRepo albumRepo;

    public Album insert(Album album){
        return albumRepo.save(album);
    }

    public Album findAlbumById(Long id){
        return albumRepo.findById(id).get();
    }

    public List<Album> findAllAlbum(){
        List<Album> listaAlbum = new ArrayList<>();
        albumRepo.findAll().forEach(album -> listaAlbum.add(album));
        return listaAlbum;
    }

    public void updateAlbum(Long id){

    }

    public void deleteAlbum(Long id){
        albumRepo.deleteById(id);
    }

}
