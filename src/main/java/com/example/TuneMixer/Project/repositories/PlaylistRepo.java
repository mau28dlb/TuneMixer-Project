package com.example.TuneMixer.Project.repositories;

import com.example.TuneMixer.Project.entities.Playlist;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PlaylistRepo {
    List<Playlist> PlaylistList = new ArrayList<>();

    public void addPlaylist (Playlist p){
        this.PlaylistList.add(p);
    }
    public void deletePlaylist(Playlist p){
        this.PlaylistList.removeIf(i -> (i.getId()).equals(p.getId()));
    }

    public void updatePlaylist(Playlist p){
        this.PlaylistList.removeIf(in -> in.getId().equals(p.getId()));
        this.PlaylistList.add(p);
    }

    public List<Playlist> getPlaylistList(){
        return this.PlaylistList;
    }
}
