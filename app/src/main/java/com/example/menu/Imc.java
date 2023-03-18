package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Imc extends AppCompatActivity {
    Button btnMenu4;
    Button btnImc;
    EditText etAltura;
    EditText etPeso;
    TextView tvImc;
    TextView tvClassificacaoImc;

    private static String Arredondar(double media){
        DecimalFormat df = new DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.HALF_UP);
        return df.format(media);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imc);
        btnMenu4 = findViewById(R.id.btnMenu4);
        btnImc = findViewById(R.id.btnImc);
        etAltura = findViewById(R.id.etAltura);
        etPeso = findViewById(R.id.etPeso);
        tvImc = findViewById(R.id.tvImc);
        tvClassificacaoImc = findViewById(R.id.tvClassificacaoImc);

        btnMenu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i8 = new Intent(Imc.this, MainActivity.class);
                startActivity(i8);
            }
        });
        btnImc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!etAltura.getText().toString().isEmpty() && !etPeso.getText().toString().isEmpty()){
                    Double altura = Double.parseDouble(etAltura.getText().toString())/100;
                    Double peso = Double.parseDouble(etPeso.getText().toString());
                    Double imc = peso/(altura*altura);
                    if (imc < 18.4){
                        tvImc.setText("Seu IMC: "+imc);
                        tvClassificacaoImc.setText("Você está abaixo do peso.");
                    } else if (imc > 18.5 && imc < 24.9) {
                        tvImc.setText("Seu IMC: " +Arredondar(imc));
                        tvClassificacaoImc.setText("Seu peso está adequado.");
                    }else {
                        tvImc.setText("Seu IMC: "+Arredondar(imc));
                        tvClassificacaoImc.setText("Você está acima do peso.");
                    }
                }
            }
        });
    }
}