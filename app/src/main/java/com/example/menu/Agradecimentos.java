package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Agradecimentos extends AppCompatActivity {
    Button btnMenu5;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agradecimentos);

        btnMenu5 = findViewById(R.id.btnMenu5);

        btnMenu5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inMenu5 = new Intent(Agradecimentos.this, MainActivity.class);
                startActivity(inMenu5);
            }
        });
    }
}