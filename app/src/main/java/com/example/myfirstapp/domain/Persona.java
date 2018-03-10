package com.example.myfirstapp.domain;

/**
 * Created by javier on 9/03/18.
 */

public class Persona extends Usuario {
    private Alergia[] alergias;
    private int edad;
    private Producto[] productos_anadidos;
    private Producto[] productos_consumidos;

    public Persona(String email, String password, String nombre, String foto, Alergia[] alergias, int edad, Producto[] productos_anadidos, Producto[] productos_consumidos) {
        super(email, password, nombre, foto);
        this.alergias = alergias;
        this.edad = edad;
        this.productos_anadidos = productos_anadidos;
        this.productos_consumidos = productos_consumidos;
    }

    public Alergia[] getAlergias() {
        return alergias;
    }

    public void setAlergias(Alergia[] alergias) {
        this.alergias = alergias;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Producto[] getProductos_anadidos() {
        return productos_anadidos;
    }

    public void setProductos_anadidos(Producto[] productos_anadidos) {
        this.productos_anadidos = productos_anadidos;
    }

    public Producto[] getProductos_consumidos() {
        return productos_consumidos;
    }

    public void setProductos_consumidos(Producto[] productos_consumidos) {
        this.productos_consumidos = productos_consumidos;
    }
}
