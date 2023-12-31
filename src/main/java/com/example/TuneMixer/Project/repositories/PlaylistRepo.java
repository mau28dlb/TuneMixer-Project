package com.example.TuneMixer.Project.repositories;

import com.example.TuneMixer.Project.entities.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlaylistRepo extends JpaRepository<Playlist, Long> {
    Playlist findByNome(String nome);
}
