package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Creditos extends AppCompatActivity {
    Button btnMenu6;//teste
    Button teste;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creditos);

        btnMenu6 = findViewById(R.id.btnMenu6);

        btnMenu6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inMenu6 = new Intent(Creditos.this, MainActivity.class);
                startActivity(inMenu6);
            }
        });
    }
}