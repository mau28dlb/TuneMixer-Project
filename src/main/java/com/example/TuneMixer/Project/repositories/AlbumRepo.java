package com.example.TuneMixer.Project.repositories;
import com.example.TuneMixer.Project.entities.Album;
import com.example.TuneMixer.Project.entities.Brano;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public interface AlbumRepo extends JpaRepository<Album, Long> {
    void delete(Optional<Album> albumDeleted);
}


