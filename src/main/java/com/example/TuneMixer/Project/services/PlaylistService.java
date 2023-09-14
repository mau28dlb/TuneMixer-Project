package com.example.TuneMixer.Project.services;

import com.example.TuneMixer.Project.DTO.PlaylistDTO;
import com.example.TuneMixer.Project.entities.Artista;
import com.example.TuneMixer.Project.entities.Playlist;
import com.example.TuneMixer.Project.repositories.AlbumRepo;
import com.example.TuneMixer.Project.repositories.PlaylistRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PlaylistService {
    private PlaylistRepo playlistRepo;


    @Autowired
    public PlaylistService(PlaylistRepo playlistRepo){
        this.playlistRepo = playlistRepo;
    }

    public PlaylistDTO insertPlaylist(PlaylistDTO playlistDTO){
        Playlist playlist = new Playlist();
        BeanUtils.copyProperties(playlistDTO, playlist);
        playlist = playlistRepo.save(playlist);
        BeanUtils.copyProperties(playlist, playlistDTO);
        return playlistDTO;
    }

    public List<PlaylistDTO> findAllPlaylist(){
        List<Playlist> playlistList = playlistRepo.findAll();
        List<PlaylistDTO> playlistDTOList = new ArrayList<>();
        for ( Playlist p : playlistList) {
            PlaylistDTO playlistDTO = new PlaylistDTO();
            playlistDTO.setId(p.getId());
            playlistDTO.setNome(p.getNome());
            playlistDTO.setUser(p.getUser());
            playlistDTOList.add(playlistDTO);
        } return playlistDTOList;
    }

    public PlaylistDTO findPlaylistById(Long id){
        Playlist p = playlistRepo.findById(id).get();
        PlaylistDTO playlistDTO = new PlaylistDTO();
        playlistDTO.setId(p.getId());
        playlistDTO.setNome(p.getNome());
        playlistDTO.setUser(p.getUser());
        return playlistDTO;
    }

    public Playlist findPlaylistByNome(String nome){
        return playlistRepo.findByNome(nome);
    }


    public Optional<Playlist> updatePlaylist(Long id, PlaylistDTO playlistDTO){
        Optional<Playlist> playlistDaAggiornare = playlistRepo.findById(id);
        if (playlistDaAggiornare.isPresent()){
            playlistDaAggiornare.get().setNome(playlistDTO.getNome());
            playlistDaAggiornare.get().setUser(playlistDTO.getUser());
            playlistDaAggiornare.get().setListaBrani(playlistDTO.getListaBrani());
            playlistRepo.save(playlistDaAggiornare.get());
        } else { return Optional.empty();}
        return playlistDaAggiornare;
    }

    public void deletePlaylist(Long id){
        this.playlistRepo.deleteById(id);
    }
}
