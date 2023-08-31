package com.example.TuneMixer.Project.services;

import com.example.TuneMixer.Project.entities.Album;
import com.example.TuneMixer.Project.entities.Artista;
import com.example.TuneMixer.Project.entities.Brano;
import com.example.TuneMixer.Project.repositories.AlbumRepo;
import com.example.TuneMixer.Project.repositories.ArtistaRepo;
import com.example.TuneMixer.Project.repositories.BranoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AlbumService {

    private AlbumRepo albumRepo;


    @Autowired
    public AlbumService(AlbumRepo albumRepo){
        this.albumRepo = albumRepo;
    }

    public Album insertAlbum(Album album){return this.albumRepo.save(album);
    }

    public Album findAlbumById(Long id){
        return this.albumRepo.findById(id).get();
    }

    public void updateAlbum(Long id, Album album) {
        Optional<Album> albumDeleted = this.albumRepo.findById(id);
        this.albumRepo.delete(albumDeleted);
        this.albumRepo.save(album);
    }

    public void deleteAlbum(Long id){
        this.albumRepo.deleteById(id);
    }

}
