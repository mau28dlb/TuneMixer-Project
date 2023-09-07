package com.example.TuneMixer.Project.DTO;

import com.example.TuneMixer.Project.entities.Enums.GenereEnum;
import com.example.TuneMixer.Project.entities.Enums.RatingEnum;
import org.springframework.boot.autoconfigure.amqp.RabbitTemplateConfigurer;

public class BranoDTO {

    private Long id;
    private String titolo;
    private GenereEnum genere;
    private Integer annoDiUscita;
    private Double durataInMinutiSecondi;

    private RatingEnum rating;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public GenereEnum getGenere() {
        return genere;
    }

    public void setGenere(GenereEnum genere) {
        this.genere = genere;
    }

    public Integer getAnnoDiUscita() {
        return annoDiUscita;
    }

    public void setAnnoDiUscita(Integer annoDiUscita) {
        this.annoDiUscita = annoDiUscita;
    }

    public Double getDurataInMinutiSecondi() {
        return durataInMinutiSecondi;
    }

    public void setDurataInMinutiSecondi(Double durataInMinutiSecondi) {
        this.durataInMinutiSecondi = durataInMinutiSecondi;
    }

    public RatingEnum getRating() {
        return rating;
    }

    public void setRating(RatingEnum rating) {
        this.rating = rating;
    }
}
