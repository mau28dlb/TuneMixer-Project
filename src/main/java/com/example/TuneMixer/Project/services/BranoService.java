package com.example.TuneMixer.Project.services;

import com.example.TuneMixer.Project.entities.Brano;
import com.example.TuneMixer.Project.repositories.BranoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BranoService {


    private BranoRepo branoRepo;

    @Autowired
    public BranoService(BranoRepo branoRepo) {
        this.branoRepo = branoRepo;
    }

    //Create
    public void insertBrano(Brano brano){
        branoRepo.save(brano);
    }

    //Read
    public Optional<Brano> findBranoById(Long id){
       return branoRepo.findById(id);
    }

    public List<Brano> findAllBrano(){
        return branoRepo.findAll();
    }

    //Update
    public Optional<Brano> updateBrano(Long id, Brano brano){
        Optional<Brano> branoDaAggiornare = branoRepo.findById(id);
        if (branoDaAggiornare.isPresent()){
            branoDaAggiornare.get().setTitolo(brano.getTitolo());
            branoDaAggiornare.get().setArtisti(brano.getArtisti());
            branoDaAggiornare.get().setAlbum(brano.getAlbum());
            branoDaAggiornare.get().setAnnoDiUscita(brano.getAnnoDiUscita());
            branoDaAggiornare.get().setDurataInMinutiSecondi(brano.getDurataInMinutiSecondi());
            branoDaAggiornare.get().setGenere(brano.getGenere());
            branoDaAggiornare.get().setRating(brano.getRating());
            branoRepo.save(branoDaAggiornare.get());
        } else { return Optional.empty();}
        return branoDaAggiornare;
    }

    //Delete
    public void deleteBrano(Long id){
        branoRepo.deleteById(id);
    }




}
