package com.example.TuneMixer.Project.controllers;

import com.example.TuneMixer.Project.entities.Artista;
import com.example.TuneMixer.Project.services.ArtistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/artista")
public class ArtistaController {
    public ArtistaService artistaService;

    @Autowired
    public ArtistaController(ArtistaService artistaService){
        this.artistaService = artistaService;
    }


    //Create
    @PostMapping("/create")
    public ResponseEntity<String> insertNewArtista(@RequestBody Artista artista){
        this.artistaService.insertArtista(artista);
        return ResponseEntity.ok().body("Nuovo artista inserito!");
    }

    //Read
    @GetMapping("/retrieve")
    public ResponseEntity<Artista> retrieveArtistaById(@RequestParam Long id){
        Artista artista = this.artistaService.findArtistaById(id);
        return ResponseEntity.ok().body(artista);
    }

    @GetMapping("/retrieveall")
    public List<Artista> retrieveAllArtista(){
        return this.artistaService.findAllArtista();
    }

    //Update
    @PutMapping("/update")
    public ResponseEntity<Artista> updateArtistaById(@RequestBody Artista artista, @RequestParam Long id){
        this.artistaService.updateArtista(id,artista);
        return ResponseEntity.ok().body(artista);
    }

    //Delete
    @DeleteMapping("/delete")
    public void deleteArtista(@RequestParam Long id){
        this.artistaService.deleteArtista(id);
        System.out.println("Artista rimosso");
    }
}
