package com.example.TuneMixer.Project.controllers;

import com.example.TuneMixer.Project.DTO.BranoDTO;
import com.example.TuneMixer.Project.entities.Artista;
import com.example.TuneMixer.Project.entities.Brano;
import com.example.TuneMixer.Project.entities.Enums.GenereEnum;
import com.example.TuneMixer.Project.repositories.BranoRepo;
import com.example.TuneMixer.Project.services.BranoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/brano")
public class BranoController {
    public BranoService branoService;

    @Autowired
    public BranoController(BranoService branoService) {
        this.branoService = branoService;
    }

    //Create
    @PostMapping("/create")
    public ResponseEntity<String> insertNewBrano(@RequestBody BranoDTO branoDTO){
        branoService.insertBrano(branoDTO);
        return ResponseEntity.ok().body("Nuovo brano inserito!");
    }

    //Read
    @GetMapping("/retrieve-by-id")
    public ResponseEntity<BranoDTO> retrieveBranoById(@RequestParam Long id){
        return ResponseEntity.ok().body(branoService.findBranoById(id));
    }

    @GetMapping("/retrieve-all")
    public List<BranoDTO> retrieveAllBrano(){
        return branoService.findAllBrano();
    }

    /*
    @GetMapping("/retrieve-by-titolo")

    public List<Brano> retrieveByTitolo(@RequestParam String titolo){
        return branoService.findByTitolo(titolo);
    }

    @GetMapping("/retrieve-by-anno")
    public List<Brano> retrieveByAnnoDiUscita(@RequestParam Integer anno){
        return branoService.findByAnnoDiUscita(anno);
    }

    @GetMapping("/retrieve-by-filtro")
    public Collection<Brano> retrieveByFiltro(@RequestParam String genere, @RequestParam Integer anno){
        return branoService.findByFiltro(genere, anno);
    }

     */


    //Update
    @PutMapping("/update")
    public ResponseEntity<BranoDTO> updateBranoById(@RequestParam Long id, @RequestBody BranoDTO branoDTO){
        branoService.updateBrano(id, branoDTO);
        return ResponseEntity.ok().body(branoDTO);
    }


    //Delete
    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteBrano(@RequestParam Long id){
        branoService.deleteBrano(id);
        return ResponseEntity.ok().body("Brano cancellato!");
    }

}
