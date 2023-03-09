package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnCalculadora1;
    Button btnLogin;
    Button btnPet;
    Button btnConsulta;
    Button btnAgradecimentos;
    Button btnCreditos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCalculadora1 = findViewById(R.id.btnCalculadora1);
        btnLogin = findViewById(R.id.btnLogin);
        btnPet = findViewById(R.id.btnPet);
        btnConsulta = findViewById(R.id.btnConsulta);
        btnAgradecimentos = findViewById(R.id.btnAgradecimentos);
        btnCreditos = findViewById(R.id.btnCreditos);

        btnCalculadora1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this, Calculadora1.class);
                startActivity(in);
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inLog = new Intent(MainActivity.this, Login.class);
                startActivity(inLog);
            }
        });

        btnPet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inPet = new Intent(MainActivity.this, Pet.class);
                startActivity(inPet);
            }
        });

        btnConsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inCon = new Intent(MainActivity.this, Consulta.class);
                startActivity(inCon);
            }
        });

        btnAgradecimentos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inAgra = new Intent(MainActivity.this, Agradecimentos.class);
                startActivity(inAgra);
            }
        });

        btnCreditos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inCred = new Intent(MainActivity.this, Creditos.class);
                startActivity(inCred);
            }
        });
    }
}