package com.example.myfirstapp.domain;

/**
 * Created by javier on 9/03/18.
 */

public class Alergia {
    private String nombre;
    private String descripcion;

    public Alergia(String n, String d) {
        this.nombre = n;
        this.descripcion = d;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
