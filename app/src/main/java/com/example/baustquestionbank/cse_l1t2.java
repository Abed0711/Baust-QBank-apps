package com.example.baustquestionbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class cse_l1t2 extends AppCompatActivity {

    ImageView cse_1201;
    ImageView cse_1203;
    ImageView eee_1269;
    ImageView math_1243;
    ImageView chem_1201;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse_l1t2);

        cse_1201 = findViewById(R.id.cse_1101);
        cse_1203 = findViewById(R.id.eee_1163);
        eee_1269 = findViewById(R.id.me_1181);
        math_1243 = findViewById(R.id.math_1141);
        chem_1201 = findViewById(R.id.phy_1103);


        cse_1201.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cse_l1t2.this, com.example.baustquestionbank.cse1201.class);
                startActivity(intent);
            }
        });

        cse_1203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cse_l1t2.this, com.example.baustquestionbank.cse1203.class);
                startActivity(intent);
            }
        });

        eee_1269.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cse_l1t2.this, com.example.baustquestionbank.eee1269.class);
                startActivity(intent);
            }
        });
        math_1243.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cse_l1t2.this, com.example.baustquestionbank.math1243.class);
                startActivity(intent);
            }
        });
        chem_1201.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cse_l1t2.this, com.example.baustquestionbank.chem1201.class);
                startActivity(intent);
            }
        });


    }
}