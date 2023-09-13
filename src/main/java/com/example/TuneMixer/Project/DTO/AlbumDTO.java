package com.example.TuneMixer.Project.DTO;

import com.example.TuneMixer.Project.entities.Enums.GenereEnum;
import com.example.TuneMixer.Project.entities.Enums.PremioEnum;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class AlbumDTO {

    private Long id;
    private String nome;
    private GenereEnum genere;
    private Integer anno;
    private Double durataAlbum;
    private PremioEnum premio;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public GenereEnum getGenere() {
        return genere;
    }

    public void setGenere(GenereEnum genere) {
        this.genere = genere;
    }

    public Integer getAnno() {
        return anno;
    }

    public void setAnno(Integer anno) {
        this.anno = anno;
    }

    public Double getDurataAlbum() {
        return durataAlbum;
    }

    public void setDurataAlbum(Double durataAlbum) {
        this.durataAlbum = durataAlbum;
    }

    public PremioEnum getPremio() {
        return premio;
    }

    public void setPremio(PremioEnum premio) {
        this.premio = premio;
    }
}
