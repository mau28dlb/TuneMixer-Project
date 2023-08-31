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
        this.branoRepo.save(brano);
    }

    //Read
    public Optional<Brano> findBranoById(Long id){
       return this.branoRepo.findById(id);
    }

    public List<Brano> findAllBrano(){
        return this.branoRepo.findAll();
    }

    //Update
    public void updateBrano(Long id, Brano brano){

    }

    //Delete
    public void deleteBrano(Long id){
        this.branoRepo.deleteById(id);
    }




}
