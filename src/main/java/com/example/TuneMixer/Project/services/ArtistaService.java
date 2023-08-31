package com.example.TuneMixer.Project.services;

import com.example.TuneMixer.Project.entities.Artista;
import com.example.TuneMixer.Project.entities.Brano;
import com.example.TuneMixer.Project.repositories.ArtistaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArtistaService {

    private ArtistaRepo artistaRepo;

    @Autowired
    public ArtistaService(ArtistaRepo artistaRepo){
        this.artistaRepo = artistaRepo;
    }

    public Artista insertArtista(Artista artista){return artistaRepo.save(artista);}

    public Artista findArtistaById(Long id){
        return this.artistaRepo.findById(id).get();
    }

    public List<Artista> findAllArtista(){
        return this.artistaRepo.findAll();
    }

    public void updateArtista(Long id, Artista artista){
            Optional<Artista> branoDaAggiornare = this.artistaRepo.findById(id);
            this.artistaRepo.deleteById(id);
            this.artistaRepo.save(artista);
        }


    public void deleteArtista(Long id){
        this.artistaRepo.deleteById(id);
    }
}
