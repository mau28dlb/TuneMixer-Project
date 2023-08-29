package com.example.TuneMixer.Project.controllers;

import com.example.TuneMixer.Project.entities.Album;
import com.example.TuneMixer.Project.services.AlbumService;
import com.example.TuneMixer.Project.services.BranoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public class AlbumController {

    @Autowired
    public AlbumService albumService;

    @PostMapping("/create")
    public ResponseEntity<Album> insertNewAlbum(@RequestBody Album album){
        Album newAlbum = albumService.insert(album);
        return ResponseEntity.ok().body(newAlbum);
    }

    @GetMapping("/retrieve")
    public ResponseEntity<Album> retrieveAlbumById(@RequestParam Long id){
        Album album = albumService.findAlbumById(id);
        return ResponseEntity.ok().body(album);
    }

    //@PutMapping("/update")

    @DeleteMapping("/delete")
    public String deleteAlbum(@RequestParam Long id){
        albumService.deleteAlbum(id);
        return "Album cancellato!";
    }

}
