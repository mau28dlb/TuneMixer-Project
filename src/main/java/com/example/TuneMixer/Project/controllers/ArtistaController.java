package com.example.TuneMixer.Project.controllers;

import com.example.TuneMixer.Project.DTO.ArtistaDTO;
import com.example.TuneMixer.Project.entities.Artista;
import com.example.TuneMixer.Project.entities.Enums.GenereEnum;
import com.example.TuneMixer.Project.services.ArtistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/artista")
public class ArtistaController {
    public ArtistaService artistaService;

    @Autowired
    public ArtistaController(ArtistaService artistaService){
        this.artistaService = artistaService;
    }


    //Create
    @PostMapping("/create")
    public ArtistaDTO insertNewArtista(@RequestBody ArtistaDTO artistaDTO){
        return artistaDTO = artistaService.insertArtista(artistaDTO);

    }

    //Read
    @GetMapping("/retrieve")
    public ResponseEntity<ArtistaDTO> retrieveArtistaById(@RequestParam Long id){
        return ResponseEntity.ok().body(artistaService.findArtistaById(id));
    }

    @GetMapping("/retrieve-all")
    public List<ArtistaDTO> retrieveAllArtista(){
        return artistaService.findAllArtista();
    }

    @GetMapping("/retrieve-by-nome")
    public ArtistaDTO retriebeArtistaByNome(@RequestParam String nome){
        return artistaService.findArtistaByNome(nome);
    }

    //Update
    @PutMapping("/update")
    public ResponseEntity<ArtistaDTO> updateArtistaById(@RequestBody ArtistaDTO artistaDTO, @RequestParam Long id){
        this.artistaService.updateArtista(id,artistaDTO);
        return ResponseEntity.ok().body(artistaDTO);
    }

    //Delete
    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteArtista(@RequestParam Long id){
       artistaService.deleteArtista(id);
       return ResponseEntity.ok().body("Artista rimosso");
    }
}
