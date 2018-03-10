package com.example.myfirstapp.domain;

/**
 * Created by javier on 9/03/18.
 */

public class Producto {
    private String nombre;
    private String foto;
    private Alergia[] intolerancias;
    private String[] comentarios;

    public Producto(String nombre, String foto, Alergia[] intolerancias, String[] comentarios) {
        this.nombre = nombre;
        this.foto = foto;
        this.intolerancias = intolerancias;
        this.comentarios = comentarios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Alergia[] getIntolerancias() {
        return intolerancias;
    }

    public void setIntolerancias(Alergia[] intolerancias) {
        this.intolerancias = intolerancias;
    }

    public String[] getComentarios() {
        return comentarios;
    }

    public void setComentarios(String[] comentarios) {
        this.comentarios = comentarios;
    }
}
