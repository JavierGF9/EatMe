package com.example.myfirstapp.domain;

/**
 * Created by javier on 9/03/18.
 */

public class Carta {
    private String descripcion;

    public Carta(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
