package com.example.TuneMixer.Project.services;

import com.example.TuneMixer.Project.DTO.ArtistaDTO;
import com.example.TuneMixer.Project.DTO.BranoDTO;
import com.example.TuneMixer.Project.entities.Artista;
import com.example.TuneMixer.Project.entities.Brano;
import com.example.TuneMixer.Project.entities.Enums.GenereEnum;
import com.example.TuneMixer.Project.repositories.BranoRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
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
    public BranoDTO insertBrano(BranoDTO branoDTO){
        Brano brano = new Brano();
        BeanUtils.copyProperties(branoDTO, brano);
        brano = branoRepo.save(brano);
        BeanUtils.copyProperties(brano, branoDTO);
        return branoDTO;
    }


    //Read
    public BranoDTO findBranoById(Long id){
        Brano brano = branoRepo.findById(id).get();
        BranoDTO branoDTO = new BranoDTO();
        branoDTO.setId(brano.getId());
        branoDTO.setTitolo(brano.getTitolo());
        branoDTO.setGenere(brano.getGenere());
        branoDTO.setAnnoDiUscita(brano.getAnnoDiUscita());
       return branoDTO;
    }

    public List<BranoDTO> findAllBrano(){
        List<Brano> branoList = branoRepo.findAll();
        List<BranoDTO> branoDTOList = new ArrayList<>();
        for (Brano b : branoList) {
            BranoDTO branoDTO = new BranoDTO();
            branoDTO.setId(b.getId());
            branoDTO.setTitolo(b.getTitolo());
            branoDTO.setGenere(b.getGenere());
            branoDTO.setAnnoDiUscita(b.getAnnoDiUscita());
            branoDTOList.add(branoDTO);
        } return branoDTOList;
    }

    /*
    public List<Brano> findByTitolo(String titolo){
        return branoRepo.findByTitolo(titolo);
    }

    public List<Brano> findByAnnoDiUscita(Integer anno){
        return branoRepo.findByAnnoDiUscita(anno);
    }

    public Collection<Brano> findByFiltro(String genere, Integer anno) {
        return branoRepo.findByFiltro(genere, anno);
    }*/

    //Update
    public Optional<Brano> updateBrano(Long id, BranoDTO branoDTO){
        Optional<Brano> branoDaAggiornare = branoRepo.findById(id);
        if (branoDaAggiornare.isPresent()){
            branoDaAggiornare.get().setTitolo(branoDTO.getTitolo());
            branoDaAggiornare.get().setGenere(branoDTO.getGenere());
            branoDaAggiornare.get().setAnnoDiUscita(branoDTO.getAnnoDiUscita());
            branoRepo.save(branoDaAggiornare.get());
        } else { return Optional.empty();}
        return branoDaAggiornare;
    }

    //Delete
    public void deleteBrano(Long id){
        branoRepo.deleteById(id);
    }




}
