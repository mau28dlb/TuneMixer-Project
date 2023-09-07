package com.example.TuneMixer.Project.services;

import com.example.TuneMixer.Project.entities.Playlist;
import com.example.TuneMixer.Project.repositories.AlbumRepo;
import com.example.TuneMixer.Project.repositories.PlaylistRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlaylistService {
    private PlaylistRepo playlistRepo;


    @Autowired
    public PlaylistService(AlbumRepo albumRepo){
        this.playlistRepo = playlistRepo;
    }

    public Playlist insertPlaylist(Playlist playlist){
        return this.playlistRepo.save(playlist);
    }

    public List<Playlist> findAllPlaylist(){
        return playlistRepo.findAll();
    }

    public Playlist findPlaylistById(Long id){
        return this.playlistRepo.findById(id).get();
    }

    public Playlist findPlaylistByNome(String nome){
        return playlistRepo.findByNome(nome);
    }


    public Optional<Playlist> updatePlaylist(Long id, Playlist playlist){
        Optional<Playlist> playlistDaAggiornare = playlistRepo.findById(id);
        if (playlistDaAggiornare.isPresent()){
            playlistDaAggiornare.get().setNome(playlist.getNome());
            playlistDaAggiornare.get().setUser(playlist.getUser());
            playlistDaAggiornare.get().setListaBrani(playlist.getListaBrani());
            playlistRepo.save(playlistDaAggiornare.get());
        } else { return Optional.empty();}
        return playlistDaAggiornare;
    }

    public void deletePlaylist(Long id){
        this.playlistRepo.deleteById(id);
    }
}
