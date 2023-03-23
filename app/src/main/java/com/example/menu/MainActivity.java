package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnCalculadora1;
    Button btnMemoria1;
    Button btnConversao;
    Button btnCalcularImc;
    Button btnSubstituir;
    Button btnNumAleatorios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCalculadora1 = findViewById(R.id.btnCalculadora1);
        btnMemoria1 = findViewById(R.id.btnMemoria1);
        btnConversao = findViewById(R.id.btnConversao);
        btnCalcularImc = findViewById(R.id.btnCalcularImc);
        btnSubstituir = findViewById(R.id.btnSubstituir);
        btnNumAleatorios = findViewById(R.id.btnNumAleatorios);

        btnCalculadora1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this, Calculadora1.class);
                startActivity(in);
            }
        });

        btnMemoria1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inMemo = new Intent(MainActivity.this, Memoria1.class);
                startActivity(inMemo);
            }
        });

        btnConversao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inConversao = new Intent(MainActivity.this, RealDolar.class);
                startActivity(inConversao);
            }
        });

        btnCalcularImc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inImc = new Intent(MainActivity.this, Imc.class);
                startActivity(inImc);
            }
        });

        btnSubstituir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inSubs = new Intent(MainActivity.this, Substituir.class);
                startActivity(inSubs);
            }
        });

        btnNumAleatorios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inAle = new Intent(MainActivity.this, Gerador.class);
                startActivity(inAle);
            }
        });
    }
}