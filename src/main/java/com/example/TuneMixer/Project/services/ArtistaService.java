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
        return artistaRepo.findById(id).get();
    }

    public List<Artista> findAllArtista(){
        return artistaRepo.findAll();
    }

    public Optional<Artista> updateArtista(Long id, Artista artista){
            Optional<Artista> artistaDaAggiornare = artistaRepo.findById(id);
            if (artistaDaAggiornare.isPresent()){
                artistaDaAggiornare.get().setNome(artista.getNome());
                artistaDaAggiornare.get().setGenere(artista.getGenere());
                artistaDaAggiornare.get().setListaBrani(artista.getListaBrani());
                artistaRepo.save(artistaDaAggiornare.get());
            } else { return Optional.empty();}
            return artistaDaAggiornare;
    }


    public void deleteArtista(Long id){
        artistaRepo.deleteById(id);
    }
}
