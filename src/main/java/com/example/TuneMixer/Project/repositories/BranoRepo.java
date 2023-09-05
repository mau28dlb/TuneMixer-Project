package com.example.TuneMixer.Project.repositories;

import com.example.TuneMixer.Project.entities.Brano;
import com.example.TuneMixer.Project.entities.Enums.GenereEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BranoRepo extends JpaRepository<Brano, Long> {

    List<Brano> findByTitolo(String titolo);

    List<Brano> findByAnnoDiUscita(Integer anno);

    List<Brano> findByGenere(GenereEnum genere);
}

//    @Query(value = "select * from brano b where b.genere = :genere", nativeQuery = true)
//    List<Brano> findBranoByGenere(@Param("genere") GenereEnum genere);
//}
