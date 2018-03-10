package com.example.myfirstapp;

import com.example.myfirstapp.domain.*;

public interface DEMO_DATA {
    /* Usuario */
    Alergia[] ALERGIAS = {
            new Alergia("Lactosa", "Intolerancia a la lactosa"),
            new Alergia("Frutos secos", "Alergia a diversos frutos secos")
    };

    String[][] COMENTARIOS = {
            {"Es el mejor queso que he comido en mi vida", "Ese queso olía a pies"},
            {"Es el mejor cacahuete de mi vida", "Ese cacahuete me salvó de una buena"}
    };

    Alergia[][] ALERGIAS_ARRAY = {
            { ALERGIAS[0] },
            { ALERGIAS[1] }
    };

    Producto[] PRODUCTOS = {
            new ProductoProcesado("Queso", "@mipmap/queso", ALERGIAS_ARRAY[0], COMENTARIOS[0], "1-854-854-854-1", "Es un queso redondo."),
            new Producto("Cacahuete", "@mipmap/peanuts", ALERGIAS_ARRAY[1], COMENTARIOS[1])
    };

    Producto[][] PRODUCTOS_ARRAY = {
            { PRODUCTOS[0] },
            { PRODUCTOS[1] }
    };

    Persona[] PERSONA = {
            new Persona("yolo", "yolo", "Yolanda López", null, ALERGIAS_ARRAY[0], 18, new Producto[0], PRODUCTOS_ARRAY[1]),
            new Persona("masterstrapt@yahoo.es", "soyGsmer", "Elliot Bélier", null, ALERGIAS_ARRAY[1], 19, PRODUCTOS_ARRAY[1], PRODUCTOS_ARRAY[0])
    };

    Carta[] CARTA_ARRAY = { new Carta("Vino ecológico de Valdepeñas. Podría contener frutos secos.") };

    com.example.myfirstapp.domain.Restaurante RESTAURANTE = new com.example.myfirstapp.domain.Restaurante("hunger.gamers@hotmail.com", "ratatui", "Hunger Gamers Pub", null, CARTA_ARRAY, "Pub irlandés con consolas.", "www.pubdegamers.es", "555-444-333", "Calle Falsa 123, Springfield, USA");
}
