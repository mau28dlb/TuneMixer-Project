package com.example.TuneMixer.Project.entities.Enums;

public enum RatingEnum {
    STELLA1("✩"),
    STELLA2("✩✩"),
    STELLA3("✩✩✩"),
    STELLA4("✩✩✩✩"),
    STELLA5("✩✩✩✩✩");
    private String descrizione;

    public String getDescrizione() {
        return descrizione;
    }

    RatingEnum(String descrizione) {
        this.descrizione = descrizione;
    }
}
