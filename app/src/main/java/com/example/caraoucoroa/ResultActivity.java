package com.example.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class ResultActivity extends AppCompatActivity {

    private ImageView imageResult;
    private ImageView imageViewBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        imageResult = findViewById(R.id.imageResult);
        imageViewBack = findViewById(R.id.imageViewBack);

        Bundle dados = getIntent().getExtras();
        int numero = dados.getInt("number");

        if(numero == 0) {
            imageResult.setImageResource(R.drawable.moeda_cara);
        } else {
            imageResult.setImageResource(R.drawable.moeda_coroa);
        }

        imageViewBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}