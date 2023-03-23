package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Substituir extends AppCompatActivity {
    Button btnMenu5;
    Button btnReplace;
    EditText etSubsChar;
    EditText etNovoChar;
    TextView tvPassagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_substituir);

        btnMenu5 = findViewById(R.id.btnMenu5);
        btnReplace = findViewById(R.id.btnReplace);
        etSubsChar = findViewById(R.id.etSubsChar);
        etNovoChar = findViewById(R.id.etNovoChar);
        tvPassagem = findViewById(R.id.tvPassagem);

        btnMenu5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inMenu5 = new Intent(Substituir.this, MainActivity.class);
                startActivity(inMenu5);
            }
        });
        btnReplace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //if (!etSubsChar.getText().toString().isEmpty() && !etNovoChar.getText().toString().isEmpty()){
                    String passagem = tvPassagem.getText().toString();
                    char char_velho =etSubsChar.getText().toString().charAt(0);
                    char char_novo = etNovoChar.getText().toString().charAt(0);
                    tvPassagem.setText(passagem.replace(char_velho, char_novo));
                //}
            }
        });
    }
}