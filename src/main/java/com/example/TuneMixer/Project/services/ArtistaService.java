package com.example.TuneMixer.Project.services;

import com.example.TuneMixer.Project.DTO.ArtistaDTO;
import com.example.TuneMixer.Project.entities.Artista;
import com.example.TuneMixer.Project.entities.Brano;
import com.example.TuneMixer.Project.entities.Enums.GenereEnum;
import com.example.TuneMixer.Project.repositories.ArtistaRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ArtistaService {

    private ArtistaRepo artistaRepo;

    @Autowired
    public ArtistaService(ArtistaRepo artistaRepo){
        this.artistaRepo = artistaRepo;
    }

    public ArtistaDTO insertArtista(ArtistaDTO artistaDTO){
        Artista artista = new Artista();
        BeanUtils.copyProperties(artistaDTO, artista);
        artista = artistaRepo.save(artista);
        BeanUtils.copyProperties(artista, artistaDTO);
        return artistaDTO;}

    public ArtistaDTO findArtistaById(Long id){
        Artista artista = artistaRepo.findById(id).get();
        ArtistaDTO artistaDTO = new ArtistaDTO();
        artistaDTO.setId(artista.getId());
        artistaDTO.setNome(artista.getNome());
        artistaDTO.setGenere(artista.getGenere());
        return artistaDTO;
    }

    public List<ArtistaDTO> findAllArtista(){
        List<Artista> artistaList = artistaRepo.findAll();
        List<ArtistaDTO> artistaDTOList = new ArrayList<>();
        for (Artista a : artistaList) {
            ArtistaDTO artistaDTO = new ArtistaDTO();
            artistaDTO.setId(a.getId());
            artistaDTO.setNome(a.getNome());
            artistaDTO.setGenere(a.getGenere());
            artistaDTOList.add(artistaDTO);
        } return artistaDTOList;
    }

    public ArtistaDTO findArtistaByNome(String nome){
        Artista artista = artistaRepo.findByNome(nome);
        ArtistaDTO artistaDTO = new ArtistaDTO();
        artistaDTO.setId(artista.getId());
        artistaDTO.setNome(artista.getNome());
        artistaDTO.setGenere(artista.getGenere());
        return artistaDTO;
    }
//
//    public List<Artista> findAllArtistiByGenere(GenereEnum genere){
//        return artistaRepo.findAllArtistiByGenere(genere);
//    }


    public Optional<Artista> updateArtista(Long id, ArtistaDTO artistaDTO){
            Optional<Artista> artistaDaAggiornare = artistaRepo.findById(id);
            if (artistaDaAggiornare.isPresent()){
                artistaDaAggiornare.get().setNome(artistaDTO.getNome());
                artistaDaAggiornare.get().setGenere(artistaDTO.getGenere());
                artistaRepo.save(artistaDaAggiornare.get());
            } else { return Optional.empty();}
            return artistaDaAggiornare;
    }


    public void deleteArtista(Long id){
        artistaRepo.deleteById(id);
    }
}
