package com.example.TuneMixer.Project.entity.Enum;

public enum Premio{
    ARGENTO("Disco di Argento"),
    ORO("Disco d' Oro"),
    PLATINO("Disco di Platino"),
    DIAMANTE("Disco di Diamante");

    private String descrizione;

    public String getDescrizione() {
        return descrizione;
    }

    Premio (String descrizione) {
        this.descrizione = descrizione;
    }
}