package com.example.TuneMixer.Project.services;

import com.example.TuneMixer.Project.entities.Brano;
import com.example.TuneMixer.Project.repositories.BranoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BranoService {

    @Autowired
    private BranoRepo branoRepo;

    public Brano insertBrano(Brano brano){
        return branoRepo.save(brano);
    }

    public Brano findBranoById(Long id){
        return branoRepo.findById(id).get();
    }

    public List<Brano> findAllBrano(){
        List<Brano> listaBrani = new ArrayList<>();
        branoRepo.findAll().forEach(brano -> listaBrani.add(brano));
        return listaBrani;
    }

    public void updateBrano(Long id){

    }

    public void deleteBrano(Long id){
        branoRepo.deleteById(id);
    }




}
