package com.example.TuneMixer.Project.controllers;

import com.example.TuneMixer.Project.entities.Artista;
import com.example.TuneMixer.Project.entities.Brano;
import com.example.TuneMixer.Project.services.BranoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/brano")
public class BranoController {
    public BranoService branoService;

    @Autowired
    public BranoController(BranoService branoService) {
        this.branoService = branoService;
    }

    //Create
    @PostMapping("/create")
    public ResponseEntity<String> insertNewBrano(@RequestBody Brano brano){
        this.branoService.insertBrano(brano);
        return ResponseEntity.ok().body("Nuovo brano inserito!");
    }

    //Read
    @GetMapping("/retrieve")
    public ResponseEntity<Optional<Brano>> retrieveBranoById(@RequestParam Long id){
        Optional<Brano> brano = this.branoService.findBranoById(id);
        return ResponseEntity.ok().body(brano);
    }

    @GetMapping("/retrieveall")
    public List<Brano> retrieveAllBrano(){
        return this.branoService.findAllBrano();
    }

    //Update
    @PutMapping("/update")
    public ResponseEntity<Brano> updateBrano(@RequestParam Long id, @RequestBody Brano brano){
        this.branoService.updateBrano(id, brano);
        return ResponseEntity.ok().body(brano);
    }


    //Delete
    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteBrano(@RequestParam Long id){
        this.branoService.deleteBrano(id);
        return ResponseEntity.ok().body("Brano cancellato!");
    }

}
