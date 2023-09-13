package com.example.TuneMixer.Project.repositories;

import com.example.TuneMixer.Project.entities.Brano;
import com.example.TuneMixer.Project.entities.Enums.GenereEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Repository
public interface BranoRepo extends JpaRepository<Brano, Long> {

    List<Brano> findByTitolo(String titolo);

    List<Brano> findByAnnoDiUscita(Integer anno);

    List<Brano> findByGenere(GenereEnum genere);

    @Query(value = "select * from brano b where b.genere = :genere and b.anno_di_uscita = :anno", nativeQuery = true)
    Collection<Brano> findByFiltro(@Param("genere") String genere, @Param("anno") Integer anno);
}

