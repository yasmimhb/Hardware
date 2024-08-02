package com.example.hardware.domain.Enum;

public enum TipoHardware {

    DESKTOP("Desktop"),
    LAPTOP("Laptop"),
    TABLET("Tablet"),
    SERVER("Server");

    private String descricao;

    private TipoHardware(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }
}
