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

    public Optional<Album> updateAlbum(Long id, Album album){
        Optional<Album> albumDaAggiornare = albumRepo.findById(id);
        if (albumDaAggiornare.isPresent()){
            albumDaAggiornare.get().setNome(album.getNome());
            albumDaAggiornare.get().setGenere(album.getGenere());
            albumDaAggiornare.get().setListaBrani(album.getListaBrani());
            albumRepo.save(albumDaAggiornare.get());
        } else { return Optional.empty();}
        return albumDaAggiornare;
    }

    public void deleteAlbum(Long id){
        this.albumRepo.deleteById(id);
    }

}
