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

    public Artista insertArtista(Artista artista){return artistaRepo.save(artista);
    }

    public Artista findArtistaById(Long id){
        return artistaRepo.findById(id).get();
    }

    public Artista updateArtista(Long id){
        Optional<Artista> artistaOld = artistaRepo.findById(id);
        Artista artistaNew = new Artista();
        if (artistaOld.isPresent()){
            artistaNew.setNome(artistaOld.get().getNome());
            artistaNew.setGenere(artistaOld.get().getGenere());
            artistaNew.setListaBrani(artistaOld.get().getListaBrani());
            artistaRepo.save(artistaNew);
        } return artistaNew;
    }

    public void deleteArtista(Long id){
        artistaRepo.deleteById(id);
    }
}
