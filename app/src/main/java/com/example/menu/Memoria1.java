package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Memoria1 extends AppCompatActivity {
    Button btnMenu2;
    Button btnProsseguir;
    TextView tvMemoria1;
    String memoria = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memoria1);
        btnProsseguir = findViewById(R.id.btnProsseguir);
        btnMenu2 = findViewById(R.id.btnMenu2);
        tvMemoria1 = findViewById(R.id.tvMemoria1);
        String letras = "abcdefghijklmnopqrstuvwxyz1234567890";
        int tamanho = 5;
        Random random = new Random();
        for (int i=0; i<tamanho; i++){
            int index = random.nextInt(letras.length());
            memoria = memoria + letras.charAt(index);
        }
        tvMemoria1.setText(memoria);


        btnMenu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in3 = new Intent(Memoria1.this, MainActivity.class);
                startActivity(in3);
            }
        });
        btnProsseguir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!memoria.isEmpty()) {
                    Intent i6 = new Intent(Memoria1.this, Memoria2.class);
                    i6.putExtra("Memoria", memoria);
                    startActivity(i6);
                }
            }
        });
    }
}