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
        branoDTO.setDurataInMinutiSecondi(brano.getDurataInMinutiSecondi());
        branoDTO.setRating(brano.getRating());
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
            branoDTO.setDurataInMinutiSecondi(b.getDurataInMinutiSecondi());
            branoDTO.setRating(b.getRating());
            branoDTOList.add(branoDTO);
        } return branoDTOList;
    }


    public List<BranoDTO> findByTitolo(String titolo){
        List<Brano> branoList = branoRepo.findByTitolo(titolo);
        List<BranoDTO> branoDTOList = new ArrayList<>();
        for (Brano b : branoList) {
            BranoDTO branoDTO = new BranoDTO();
            branoDTO.setId(b.getId());
            branoDTO.setTitolo(b.getTitolo());
            branoDTO.setGenere(b.getGenere());
            branoDTO.setAnnoDiUscita(b.getAnnoDiUscita());
            branoDTO.setDurataInMinutiSecondi(b.getDurataInMinutiSecondi());
            branoDTO.setRating(b.getRating());
            branoDTOList.add(branoDTO);
        } return branoDTOList;
    }



    public List<BranoDTO> findByAnnoDiUscita(Integer anno){
        List<Brano> branoList = branoRepo.findByAnnoDiUscita(anno);
        List<BranoDTO> branoDTOList = new ArrayList<>();
        for (Brano b : branoList) {
            BranoDTO branoDTO = new BranoDTO();
            branoDTO.setId(b.getId());
            branoDTO.setTitolo(b.getTitolo());
            branoDTO.setGenere(b.getGenere());
            branoDTO.setAnnoDiUscita(b.getAnnoDiUscita());
            branoDTO.setDurataInMinutiSecondi(b.getDurataInMinutiSecondi());
            branoDTO.setRating(b.getRating());
            branoDTOList.add(branoDTO);
        } return branoDTOList;
    }

    public Collection<BranoDTO> findByFiltro(String genere, Integer anno) {
        Collection<Brano> branoList = branoRepo.findByFiltro(genere, anno);
        List<BranoDTO> branoDTOList = new ArrayList<>();
        for (Brano b : branoList) {
            BranoDTO branoDTO = new BranoDTO();
            branoDTO.setId(b.getId());
            branoDTO.setTitolo(b.getTitolo());
            branoDTO.setGenere(b.getGenere());
            branoDTO.setAnnoDiUscita(b.getAnnoDiUscita());
            branoDTO.setDurataInMinutiSecondi(b.getDurataInMinutiSecondi());
            branoDTO.setRating(b.getRating());
            branoDTOList.add(branoDTO);
        } return branoDTOList;
    }

    //Update
    public Optional<Brano> updateBrano(Long id, BranoDTO branoDTO){
        Optional<Brano> branoDaAggiornare = branoRepo.findById(id);
        if (branoDaAggiornare.isPresent()){
            branoDaAggiornare.get().setTitolo(branoDTO.getTitolo());
            branoDaAggiornare.get().setGenere(branoDTO.getGenere());
            branoDaAggiornare.get().setAnnoDiUscita(branoDTO.getAnnoDiUscita());
            branoDaAggiornare.get().setDurataInMinutiSecondi(branoDTO.getDurataInMinutiSecondi());
            branoDaAggiornare.get().setRating(branoDTO.getRating());
            branoRepo.save(branoDaAggiornare.get());
        } else { return Optional.empty();}
        return branoDaAggiornare;
    }

    //Delete
    public void deleteBrano(Long id){
        branoRepo.deleteById(id);
    }




}
