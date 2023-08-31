package com.example.TuneMixer.Project.controllers;

import com.example.TuneMixer.Project.entities.Album;
import com.example.TuneMixer.Project.entities.Playlist;
import com.example.TuneMixer.Project.services.AlbumService;
import com.example.TuneMixer.Project.services.PlaylistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public class PlaylistController {

    public PlaylistService playlistService;
    @Autowired
    public PlaylistController(PlaylistService playlistService) {
        this.playlistService = playlistService;
    }

    //Create
    @PostMapping("/create")
    public ResponseEntity<String> insertNewPlaylist(@RequestBody Playlist playlist){
        this.playlistService.insertPlaylist(playlist);
        return ResponseEntity.ok().body("Nuova Playlist creata!");
    }

    //Read
    @GetMapping("/retrieve")
    public ResponseEntity<Playlist> retrievePlaylistById(@RequestParam Long id){
        Playlist playlist = playlistService.findPlaylistById(id);
        return ResponseEntity.ok().body(playlist);
    }

    //Update
    @PutMapping("/update")
    public ResponseEntity<Playlist> updatePlaylist(@RequestParam Long id, @RequestBody Playlist playlist){
        this.playlistService.updatePlaylist(playlist, id);
        return ResponseEntity.ok().body(playlist);
    }

    //Delete
    @DeleteMapping("/delete")
    public void deletePlaylist(@RequestParam Long id){
        playlistService.deletePlaylist(id);
        System.out.println("Album rimosso");
    }

}
