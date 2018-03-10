package com.example.myfirstapp.domain;

/**
 * Created by javier on 9/03/18.
 */

public class ProductoProcesado extends Producto {
    private String codigo_barras;
    private String descripcion;

    public ProductoProcesado(String nombre, String foto, Alergia[] intolerancias, String[] comentarios, String codigo_barras, String descripcion) {
        super(nombre, foto, intolerancias, comentarios);
        this.codigo_barras = codigo_barras;
        this.descripcion = descripcion;
    }

    public String getCodigo_barras() {
        return codigo_barras;
    }

    public void setCodigo_barras(String codigo_barras) {
        this.codigo_barras = codigo_barras;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
