package com.example.android.apma_work1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView financeImgText;
    LinearLayout financeLayout,cropLayout,animalLayout,productLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        financeLayout = findViewById(R.id.layoutFinance);
        //cropLayout = findViewById(R.id.layoutCrop);
        animalLayout = findViewById(R.id.layoutAnimal);
        //productLayout = findViewById(R.id.layoutProducts);

        financeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Loading.class);
                startActivity(intent);
                finish();
            }
        });

       cropLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Loading.class);
                startActivity(intent);
                finish();
            }
        });

       animalLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Loading.class);
                startActivity(intent);
                finish();
            }
        });

        productLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Loading.class);
                startActivity(intent);
                finish();
            }
        });

    }



}