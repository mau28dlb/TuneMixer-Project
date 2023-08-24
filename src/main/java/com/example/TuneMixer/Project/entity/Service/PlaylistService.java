package com.example.TuneMixer.Project.entity.Service;

import com.example.TuneMixer.Project.entity.Dao.PlaylistDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlaylistService {
    private static PlaylistDao playlistDao;
    @Autowired
    public PlaylistService (PlaylistDao playlistDao){
    this.playlistDao = playlistDao;
    }
}
