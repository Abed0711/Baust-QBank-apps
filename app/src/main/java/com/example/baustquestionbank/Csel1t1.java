package com.example.baustquestionbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Csel1t1 extends AppCompatActivity {

    ImageView cse_1101;
    ImageView eee_1163;
    ImageView me_1181;
    ImageView math_1141;
    ImageView phy_1103;
    ImageView hum_1101;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csel1t1);

        cse_1101 = findViewById(R.id.cse_1101);
        eee_1163 = findViewById(R.id.eee_1163);
        me_1181 = findViewById(R.id.me_1181);
        math_1141 = findViewById(R.id.math_1141);
        phy_1103 = findViewById(R.id.phy_1103);
        hum_1101 = findViewById(R.id.hum_1101);

        cse_1101.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Csel1t1.this, com.example.baustquestionbank.cse_1101.class);
                startActivity(intent);
            }
        });

        eee_1163.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Csel1t1.this, com.example.baustquestionbank.Eee_1163.class);
                startActivity(intent);
            }
        });

        me_1181.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Csel1t1.this, com.example.baustquestionbank.Me_1181.class);
                startActivity(intent);
            }
        });
        math_1141.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Csel1t1.this, com.example.baustquestionbank.Math_1141.class);
                startActivity(intent);
            }
        });
        phy_1103.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Csel1t1.this, com.example.baustquestionbank.Phy_1103.class);
                startActivity(intent);
            }
        });
        hum_1101.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Csel1t1.this, com.example.baustquestionbank.Hum_1101.class);
                startActivity(intent);
            }
        });




    }
}