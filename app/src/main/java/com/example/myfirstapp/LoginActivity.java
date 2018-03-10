package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity implements DEMO_DATA {
    TextView txtEmail;
    TextView txtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txtEmail = findViewById(R.id.edEmail);
        txtPassword = findViewById(R.id.edPassword);
    }

    public void onClick(View v) {
        if (txtEmail.getText().toString().equals(PERSONA[0].getEmail()) && txtPassword.getText().toString().equals(PERSONA[0].getPassword())) {
            Intent intent = new Intent(this, PersonaActivity.class);
            startActivity(intent);
        } else {
            txtEmail.setText("");
            txtPassword.setText("");
        }
    }
}
