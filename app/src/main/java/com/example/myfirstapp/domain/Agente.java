package com.example.myfirstapp.domain;

public class Agente {
    private static final Agente INSTANCIA = new Agente();

    private Agente() {
        // TODO: código de la base de datos
    }

    public static Agente getInstancia() {
        return INSTANCIA;
    }
}
