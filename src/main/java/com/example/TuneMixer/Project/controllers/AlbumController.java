package com.example.TuneMixer.Project.controllers;

import com.example.TuneMixer.Project.DTO.BranoDTO;
import com.example.TuneMixer.Project.entities.Album;
import com.example.TuneMixer.Project.entities.Artista;
import com.example.TuneMixer.Project.entities.Enums.GenereEnum;
import com.example.TuneMixer.Project.services.AlbumService;
import com.example.TuneMixer.Project.DTO.AlbumDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/album")
public class AlbumController {
    public AlbumService albumService;
    @Autowired
    public AlbumController(AlbumService albumService) {
        this.albumService = albumService;
    }

    //Create
    @PostMapping("/create")
    public ResponseEntity<String> insertNewAlbum(@RequestBody AlbumDTO albumDTO){
        this.albumService.insertAlbum(albumDTO);
        return ResponseEntity.ok().body("Nuovo album inserito!");
    }

    //Read
    @GetMapping("/retrieve")
    public ResponseEntity<AlbumDTO> retrieveAlbumById(@RequestParam Long id){
        AlbumDTO albumDTO = albumService.findAlbumById(id);
        return ResponseEntity.ok().body(albumDTO);
    }

    @GetMapping("/retrieve-all")
    public List<AlbumDTO> retrieveAllAlbum(){
        return albumService.findAllAlbum();
    }

    @GetMapping("/retrieve-by-anno")
    public List<AlbumDTO> retrieveByAnno(@RequestParam Integer anno){
        return albumService.findByAnno(anno);
    }

    @GetMapping("/retrieve-by-genere")
    public List<AlbumDTO> retrieveByGenere (@RequestParam GenereEnum genere){
        return albumService.findByGenere(genere);
    }

    @GetMapping("/retrieve-by-titolo")
    public List<AlbumDTO> retrieveByNome(@RequestParam String nome){
        return albumService.findByNome(nome);
    }

    /*@GetMapping("/retrieve-by-Artista")
    public List<AlbumDTO> retrieveByArtista(@RequestParam String nomeArtista){
        return albumService.findByArtista(nomeArtista);
    }*/

    //Update
    @PutMapping("/update")
    public ResponseEntity<AlbumDTO> updateAlbumById(@RequestParam Long id, @RequestBody AlbumDTO albumDTO){
        albumService.updateAlbum(id, albumDTO);
        return ResponseEntity.ok().body(albumDTO);
    }
    //Delete
    @DeleteMapping("/delete")
    public void deleteAlbum(@RequestParam Long id){
       albumService.deleteAlbum(id);
        System.out.println("Album rimosso");
    }

}
