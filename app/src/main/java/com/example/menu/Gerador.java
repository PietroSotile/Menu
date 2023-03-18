package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class Gerador extends AppCompatActivity {
    Button btnMenu6;
    Button btnGerarNum;
    TextView tvNumDistinct;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gerador);
        btnMenu6 = findViewById(R.id.btnMenu6);
        btnGerarNum = findViewById(R.id.btnGerarNum);
        tvNumDistinct = findViewById(R.id.tvNumDistinct);

        btnMenu6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in9 = new Intent(Gerador.this, MainActivity.class);
                startActivity(in9);
            }
        });
        btnGerarNum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                //Depois de várias tentativas que n deram certo, pesquisei uma classe que só armazena elementos únicos. A
                Set<Integer> num_distintos = new LinkedHashSet<Integer>();
                while (num_distintos.size() < 10) {
                    num_distintos.add(random.nextInt(100));
                }
                tvNumDistinct.setText(num_distintos.toString());

            //N consegui descobrir o que tem de errado nesse código.
                /*Random random = new Random();
                int numnovo = 0;
                String num_distintos = "";
                while (num_distintos.length() < 10) {
                    int i = 0;
                    while (i < num_distintos.length()) {
                        numnovo = random.nextInt(10);
                        try {
                            if (numnovo == num_distintos.charAt(i)) {

                            } else {
                                num_distintos = num_distintos + numnovo;
                            }
                        } catch (Exception e) {

                        }
                        i++;
                    }
                }
                tvNumDistinct.setText(num_distintos);
*/
            }
        });
    }
}
