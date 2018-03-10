package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.myfirstapp.domain.Alergia;
import com.example.myfirstapp.domain.Producto;

public class PersonaActivity extends AppCompatActivity implements DEMO_DATA {
    TextView txtNombre;
    TextView txtEdad;
    TextView txtEmail;
    ListView listAlergias;
    ArrayAdapter<String> adaptadorAlergias;
    ArrayAdapter<String> adaptadorProductos;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.personal_profile:
                return true;
            case R.id.products:
                showProducts();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void showProducts() {
        Intent intent = new Intent(this, ProductsListActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interfaz_usuario);

        txtEdad = findViewById(R.id.txtEdad);
        txtNombre = findViewById(R.id.txtNombre);
        txtEmail = findViewById(R.id.txtEmail);

        txtEdad.setText(String.valueOf(PERSONA[0].getEdad()) + " años");
        txtNombre.setText(PERSONA[0].getNombre());
        txtEmail.setText(PERSONA[0].getEmail());

        listAlergias = findViewById(R.id.listAlergias);
        adaptadorAlergias = new ArrayAdapter<String>(this, R.layout.activity_list_view);
        for (Alergia alergia: PERSONA[0].getAlergias()) {
            adaptadorAlergias.add(alergia.getNombre());
        }
        listAlergias.setAdapter(adaptadorAlergias);

        ListView listProductos = findViewById(R.id.listProductos);
        adaptadorProductos = new ArrayAdapter<String>(this, R.layout.activity_list_view);
        for (Producto producto: PERSONA[0].getProductos_consumidos()) {
            adaptadorProductos.add(producto.getNombre());
        }
        listProductos.setAdapter(adaptadorProductos);
    }
}
