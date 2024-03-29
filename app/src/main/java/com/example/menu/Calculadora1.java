package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Calculadora1 extends AppCompatActivity {

    Button btnMenu1;
    Button btnCalcular1;
    Button btnResultado1;
    EditText etCalc1Num1;
    EditText etCalc1Num2;
    RadioGroup rgOperacoes1;
    int sinal = 0;
    Double num1 = 0.0;
    Double num2 = 0.0;
    TextView tvResultado1;
    Double resultado = 0.0;

    public void Calcular() {
        String texto1 = etCalc1Num1.getText().toString();
        if (!texto1.isEmpty()) {
            try {
                num1 = Double.parseDouble(texto1);
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
        String texto2 = etCalc1Num2.getText().toString();
        if (!texto2.isEmpty()) {
            try {
                num2 = Double.parseDouble(texto2);
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
        switch (sinal) {
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                resultado = num1 * num2;
                break;
            case 4:
                try {
                    resultado = num1 / num2;
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                break;
        }
        tvResultado1.setText("Resultado: " + resultado);
        etCalc1Num1.setText(resultado.toString());
        etCalc1Num2.setText("");
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora1);
        etCalc1Num1 = findViewById(R.id.etCalc1Num1);
        etCalc1Num2 = findViewById(R.id.etCalc1Num2);
        rgOperacoes1 = findViewById(R.id.rgOperacoes1);
        btnCalcular1 = findViewById(R.id.btnCalcular1);
        btnResultado1 = findViewById(R.id.btnResultado1);
        tvResultado1 = findViewById(R.id.tvResultado1);
        btnMenu1 = findViewById(R.id.btnMenu1);
        try {
            Bundle extras = getIntent().getExtras();
            Double num01 = extras.getDouble("Num01");
            Double num02 = extras.getDouble("Num02");
            int sinal1 = extras.getInt("Sinal");
            etCalc1Num1.setText(num01.toString());
            etCalc1Num2.setText(num02.toString());
            switch (sinal1) {
                case 1:
                    rgOperacoes1.check(R.id.rbAdicao1);
                    break;
                case 2:
                    rgOperacoes1.check(R.id.rbSubtracao1);
                    break;
                case 3:
                    rgOperacoes1.check(R.id.rbMultiplicacao1);
                    break;
                case 4:
                    rgOperacoes1.check(R.id.rbDivisao1);
                    break;
            }
        }catch (Exception e)
        {
        }

        btnMenu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in2 = new Intent(Calculadora1.this, MainActivity.class);
                startActivity((in2));
            }
        });
        rgOperacoes1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i) {
                    case R.id.rbAdicao1:
                        sinal = 1;
                        break;
                    case R.id.rbSubtracao1:
                        sinal = 2;
                        break;
                    case R.id.rbMultiplicacao1:
                        sinal = 3;
                        break;
                    case R.id.rbDivisao1:
                        sinal = 4;
                        break;
                }
            }
        });

        btnCalcular1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calcular();
            }
        });
        btnResultado1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calcular();
                Intent i = new Intent(Calculadora1.this, Resultado.class);;
                i.putExtra("Resultado", resultado);
                i.putExtra("Num1", num1);
                i.putExtra("Num2", num2);
                i.putExtra("Sinal", sinal);
                startActivity(i);
            }
        });
    }
}