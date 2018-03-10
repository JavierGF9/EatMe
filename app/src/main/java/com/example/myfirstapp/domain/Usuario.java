package com.example.myfirstapp.domain;

public class Usuario {
    private String email;
    private String password;
    private String nombre;
    private String foto;

    public Usuario(String email, String password, String nombre, String foto) {
        this.email = email;
        this.password = password;
        this.nombre = nombre;
        this.foto = foto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
}
