package com.example.TuneMixer.Project.services;

import com.example.TuneMixer.Project.repositories.PlaylistRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlaylistService {
    private static PlaylistRepo playlistDao;
    @Autowired
    public PlaylistService (PlaylistRepo playlistDao){
    this.playlistDao = playlistDao;
    }
}
