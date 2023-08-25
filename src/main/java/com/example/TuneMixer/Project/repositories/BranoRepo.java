package com.example.TuneMixer.Project.repositories;

import com.example.TuneMixer.Project.entities.Brano;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BranoRepo extends JpaRepository<Brano, Long> {}
