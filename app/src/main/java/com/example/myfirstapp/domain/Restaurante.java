package com.example.myfirstapp.domain;

/**
 * Created by javier on 9/03/18.
 */

public class Restaurante extends Usuario {
    private Carta[] cartas;
    private String descripcion;
    private String web;
    private String telefono;
    private String direccion;

    public Restaurante(String email, String password, String nombre, String foto, Carta[] cartas, String descripcion, String web, String telefono, String direccion) {
        super(email, password, nombre, foto);
        this.cartas = cartas;
        this.descripcion = descripcion;
        this.web = web;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public Carta[] getCartas() {
        return cartas;
    }

    public void setCartas(Carta[] cartas) {
        this.cartas = cartas;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
