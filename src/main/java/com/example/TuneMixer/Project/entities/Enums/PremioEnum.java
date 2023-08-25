package com.example.TuneMixer.Project.entities.Enums;

public enum PremioEnum {
    ARGENTO("Disco di Argento"),
    ORO("Disco d' Oro"),
    PLATINO("Disco di Platino"),
    DIAMANTE("Disco di Diamante");

    private String descrizione;

    public String getDescrizione() {
        return descrizione;
    }

    PremioEnum(String descrizione) {
        this.descrizione = descrizione;
    }
}