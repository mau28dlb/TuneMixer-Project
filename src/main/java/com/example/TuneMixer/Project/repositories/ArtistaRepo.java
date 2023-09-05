package com.example.TuneMixer.Project.repositories;

import com.example.TuneMixer.Project.entities.Artista;
import com.example.TuneMixer.Project.entities.Enums.GenereEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ArtistaRepo extends JpaRepository<Artista, Long> {

    Artista findByNome(String nome);

//    @Query(value = "select * from artista a where a.genere = :nomeGenere")
//    List<Artista> findAllArtistiByGenere(@Param("nomeGenere") GenereEnum genere);
}
