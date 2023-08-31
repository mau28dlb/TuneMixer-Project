package com.example.TuneMixer.Project.repositories;

import com.example.TuneMixer.Project.entities.Artista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ArtistaRepo extends JpaRepository<Artista, Long> {
}
