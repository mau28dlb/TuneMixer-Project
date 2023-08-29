package com.example.TuneMixer.Project.controllers;

import com.example.TuneMixer.Project.entities.Brano;
import com.example.TuneMixer.Project.services.BranoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class BranoController {

    @Autowired
    public BranoService branoService;

    @PostMapping("/create")
    public ResponseEntity<Brano> insertNewBrano(@RequestBody Brano brano){
        Brano newBrano = branoService.insertBrano(brano);
        return ResponseEntity.ok().body(newBrano);
    }

    @GetMapping("/retrieve")
    public ResponseEntity<Brano> retrieveBranoById(@RequestParam Long id){
        Brano brano = branoService.findBranoById(id);
        return ResponseEntity.ok().body(brano);
    }

    //@PutMapping("/update")

    @DeleteMapping("/delete")
    public String deleteBrano(@RequestParam Long id){
        branoService.deleteBrano(id);
        return "Brano cancellato!";
    }

}
