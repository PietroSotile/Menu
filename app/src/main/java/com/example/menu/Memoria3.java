package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Memoria3 extends AppCompatActivity {
    Button btnMenu7;
    TextView tvVeredito;
    TextView tvCorreta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memoria3);
        Bundle extras = getIntent().getExtras();
        String memoria = extras.getString("Memoria");
        String memoriauser = extras.getString("MemoriaUser");
        btnMenu7 = findViewById(R.id.btnMenu7);
        tvVeredito = findViewById(R.id.tvVeredito);
        tvCorreta = findViewById(R.id.tvCorreta);
        if (memoria.equals(memoriauser)){
            tvVeredito.setText("CORRETA");
        }else {
            tvVeredito.setText("ERRADA");
            tvCorreta.setText("A sequência correta era: "+memoria);
        }

        btnMenu7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i8 = new Intent(Memoria3.this, MainActivity.class);
                startActivity(i8);
            }
        });
    }
}