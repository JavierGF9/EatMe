package com.example.myfirstapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.myfirstapp.domain.Producto;

import static com.example.myfirstapp.DEMO_DATA.PRODUCTOS;

public class ProductsListActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products_list);

        ListView lista = findViewById(R.id.listProducts);

        ArrayAdapter<String> productos = new ArrayAdapter<String>(this, R.layout.activity_list_view);
        for (Producto prod: PRODUCTOS) {
            productos.add(prod.getNombre());
        }

        lista.setAdapter(productos);
    }
}
