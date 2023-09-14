package com.example.TuneMixer.Project.controllers;

import com.example.TuneMixer.Project.DTO.PlaylistDTO;
import com.example.TuneMixer.Project.entities.Album;
import com.example.TuneMixer.Project.entities.Artista;
import com.example.TuneMixer.Project.entities.Brano;
import com.example.TuneMixer.Project.entities.Playlist;
import com.example.TuneMixer.Project.services.AlbumService;
import com.example.TuneMixer.Project.services.PlaylistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/playlist")
public class PlaylistController {

    public PlaylistService playlistService;
    @Autowired
    public PlaylistController(PlaylistService playlistService) {
        this.playlistService = playlistService;
    }

    //Create
    @PostMapping("/create")
    public ResponseEntity<String> insertNewPlaylist(@RequestBody PlaylistDTO playlistDTO){
        this.playlistService.insertPlaylist(playlistDTO);
        return ResponseEntity.ok().body("Nuova Playlist creata!");
    }

    //Read
    @GetMapping("/retrieve")
    public ResponseEntity<PlaylistDTO> retrievePlaylistById(@RequestParam Long id){
        return ResponseEntity.ok().body(playlistService.findPlaylistById(id));
    }

    @GetMapping("/retrieve-all")
    public List<PlaylistDTO> retrieveAllPlaylist(){
        return this.playlistService.findAllPlaylist();
    }

    @GetMapping("/retrieve-by-nome")
    public Playlist retrievePlaylistByNome(@RequestParam String nome){
        return playlistService.findPlaylistByNome(nome);
    }


    //Update
    @PutMapping("/update")
    public ResponseEntity<PlaylistDTO> updatePlaylist(@RequestParam Long id, @RequestBody PlaylistDTO playlistDTO){
        this.playlistService.updatePlaylist(id, playlistDTO);
        return ResponseEntity.ok().body(playlistDTO);
    }

    //Delete
    @DeleteMapping("/delete")
    public void deletePlaylist(@RequestParam Long id){
        playlistService.deletePlaylist(id);
        System.out.println("Album rimosso");
    }

}
