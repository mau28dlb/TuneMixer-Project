package com.example.TuneMixer.Project.entity.Enum;

public enum Rating {
    STELLA1("✩"),
    STELLA2("✩✩"),
    STELLA3("✩✩✩"),
    STELLA4("✩✩✩✩"),
    STELLA5("✩✩✩✩✩");
    private String descrizione;

    public String getDescrizione() {
        return descrizione;
    }

    Rating (String descrizione) {
        this.descrizione = descrizione;
    }
}
