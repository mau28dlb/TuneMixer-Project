package com.example.TuneMixer.Project.entity;

import java.util.List;

public class Classifica {

    private long id;
    private Brano brano;
    private enum Rating{};
    private enum Premio{
        ARGENTO("Disco di Argento"),
        ORO("Disco d' Oro"),
        PLATINO("Disco di Platino"),
        DIAMANTE("Disco di Diamante");
        private String descrizione;

        public String getDescrizione() {
            return descrizione;
        }

        Premio(String descrizione) {
            this.descrizione = descrizione;
        }
    }
    public Classifica(long id, Brano brano) {
        this.id = id;
        this.brano = brano;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Brano getBrano() {
        return brano;
    }

    public void setBrano(Brano brano) {
        this.brano = brano;
    }

}
