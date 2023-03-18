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

public class RealDolar extends AppCompatActivity {
    Button btnMenu3;
    Button btnReal;
    Button btnDolar;
    EditText etReal;
    EditText etDolar;
    TextView tvReal;
    TextView tvDolar;

    private static String Arredondar(double media){
        DecimalFormat df = new DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.HALF_UP);
        return df.format(media);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_real_dolar);
        btnMenu3 = findViewById(R.id.btnMenu3);
        btnReal = findViewById(R.id.btnReal);
        btnDolar = findViewById(R.id.btnDolar);
        etReal = findViewById(R.id.etReal);
        etDolar = findViewById(R.id.etDolar);
        tvReal = findViewById(R.id.tvReal);
        tvDolar = findViewById(R.id.tvDolar);

        btnMenu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i9 = new Intent(RealDolar.this, MainActivity.class);
                startActivity(i9);
            }
        });
        btnDolar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!etReal.getText().toString().isEmpty());{
                    Double real = Double.parseDouble(etReal.getText().toString());
                    String real_dolar = Arredondar(real/5.28);
                    tvDolar.setText(real_dolar);
                }
            }
        });
        btnReal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!etDolar.getText().toString().isEmpty());{
                    Double dolar = Double.parseDouble(etDolar.getText().toString());
                    String dolar_real = Arredondar(dolar*5.28);
                    tvReal.setText(dolar_real);
                }
            }
        });
    }
}