package com.example.TuneMixer.Project.controllers;

import com.example.TuneMixer.Project.entities.Album;
import com.example.TuneMixer.Project.services.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public ResponseEntity<String> insertNewAlbum(@RequestBody Album album){
        this.albumService.insertAlbum(album);
        return ResponseEntity.ok().body("Nuovo album inserito!");
    }

    //Read
    @GetMapping("/retrieve")
    public ResponseEntity<Album> retrieveAlbumById(@RequestParam Long id){
        Album album = albumService.findAlbumById(id);
        return ResponseEntity.ok().body(album);
    }

    //Update
//    @PutMapping("/update")
//    public ResponseEntity<Album> updateAlbum(@RequestParam Long id, @RequestBody Album album){
//        this.albumService.updateAlbum(id, album);
//        return ResponseEntity.ok().body(album);
//    }

    //Delete
    @DeleteMapping("/delete")
    public void deleteAlbum(@RequestParam Long id){
       albumService.deleteAlbum(id);
        System.out.println("Album rimosso");
    }

}
