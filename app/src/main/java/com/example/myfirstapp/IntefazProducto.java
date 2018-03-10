package com.example.myfirstapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class IntefazProducto extends Activity implements DEMO_DATA {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intefaz_producto);

        Intent intent = getIntent();
        int pos = Integer.parseInt(intent.getStringExtra(ProductsListActivity.EXTRA_MESSAGE));

        ImageView img = findViewById(R.id.imagen);

        if (pos == 0) {
            img.setImageResource(R.mipmap.queso);
        } else {
            img.setImageResource(R.mipmap.peanuts);
        }

        TextView nombre = findViewById(R.id.nombre_producto);
        nombre.setText(PRODUCTOS[pos].getNombre());
    }
}
