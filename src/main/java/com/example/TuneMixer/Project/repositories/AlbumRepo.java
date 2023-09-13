package com.example.TuneMixer.Project.repositories;
import com.example.TuneMixer.Project.entities.Album;
import com.example.TuneMixer.Project.entities.Brano;
import com.example.TuneMixer.Project.entities.Enums.GenereEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public interface AlbumRepo extends JpaRepository<Album, Long> {
    List<Album> findByAnnoDiUscita(Integer anno);

    List<Album> findByTitolo(String nome);
    List<Album> findByGenere(GenereEnum genere);
    List<Album> findByArtista(String nomeArtista);


}


