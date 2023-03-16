package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {

    Button btnEditar1;
    TextView tvResultado2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        Bundle extras = getIntent().getExtras();
        Double resultado = extras.getDouble("Resultado");
        Double num1 = extras.getDouble("Num1");
        Double num2 = extras.getDouble("Num2");
        int sinal = extras.getInt("Sinal");
        tvResultado2 = findViewById(R.id.tvResultado2);
        tvResultado2.setText("Resultado: "+resultado);

        btnEditar1 = findViewById(R.id.btnEditar1);
        btnEditar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i5 = new Intent(Resultado.this, Calculadora1.class);
                i5.putExtra("Resultado", resultado);
                i5.putExtra("Num01", num1);
                i5.putExtra("Num02", num2);
                i5.putExtra("Sinal",sinal);
                startActivity(i5);
            }
        });
    }
}