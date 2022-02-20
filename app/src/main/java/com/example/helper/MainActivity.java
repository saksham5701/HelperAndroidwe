package com.example.helper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button calc, IntCalc, SimpCalc;
    private Button con;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calc=findViewById(R.id.simpCalc);
        con=findViewById(R.id.NumCon);
        IntCalc=findViewById(R.id.IntCalc);
        SimpCalc=findViewById(R.id.simpCalc);
        final Context context =this;

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent(context,SimpleCalculator.class);
                startActivity(intent);


            }
        });

        SimpCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent(context,SimpleCalculator.class);
                startActivity(intent);


            }
        });

        IntCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent(context,InterestCalculator.class);
                startActivity(intent);


            }
        });

        con.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent(context,NumberConvertor.class);
                startActivity(intent);


            }
        });
    }
}