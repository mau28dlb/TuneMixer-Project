package com.example.TuneMixer.Project.controllers;

import com.example.TuneMixer.Project.entities.Artista;
import com.example.TuneMixer.Project.services.ArtistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ArtistaController {

    @Autowired
    public ArtistaService artistaService;

    @PostMapping("/create")
    public ResponseEntity<Artista> insertNewArtista(@RequestBody Artista artista){
        Artista newArtista = artistaService.insertArtista(artista);
        return ResponseEntity.ok().body(newArtista);
    }

    @GetMapping("/retrieve")
    public ResponseEntity<Artista> retrieveArtistaById(@RequestParam Long id){
        Artista artista = artistaService.findArtistaById(id);
        return ResponseEntity.ok().body(artista);
    }

    @PutMapping("/update")
    public ResponseEntity<Artista> updateArtistaById(@RequestBody Artista artista, @RequestParam Long id){
        Artista updatedArtista = artistaService.updateArtista(id);
        return ResponseEntity.ok().body(updatedArtista);
    }

    @DeleteMapping("/delete")
    public void deleteArtista(@RequestParam Long id){
        artistaService.deleteArtista(id);
        System.out.println("Artista rimosso");
    }
}
