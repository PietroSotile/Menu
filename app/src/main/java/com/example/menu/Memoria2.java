package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Memoria2 extends AppCompatActivity {
    Button btnVerificar;
    EditText etSequencia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memoria2);
        Bundle extras = getIntent().getExtras();
        String memoria = extras.getString("Memoria");
        btnVerificar = findViewById(R.id.btnVerificar);
        etSequencia = findViewById(R.id.etSequencia);

        btnVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String memoriauser = String.valueOf(etSequencia.getText());
                memoriauser = memoriauser.toLowerCase();
                if (!memoriauser.isEmpty()) {
                    Intent i7 = new Intent(Memoria2.this, Memoria3.class);
                    i7.putExtra("Memoria", memoria);
                    i7.putExtra("MemoriaUser", memoriauser);
                    startActivity(i7);
                }
            }
        });
    }
}