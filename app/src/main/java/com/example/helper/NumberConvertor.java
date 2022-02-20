package com.example.helper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NumberConvertor extends AppCompatActivity {
    private Button B2D;
    private Button D2B;
    private Button D2H;
    private Button h2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_convertor);



        B2D=findViewById(R.id.B2D);
        D2B=findViewById(R.id.D2B);
        D2H=findViewById(R.id.D2H);
        final Context context =this;
        h2=findViewById(R.id.h2);
        h2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent(context,MainActivity.class);
                startActivity(intent);


            }
        });
        B2D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent(context,BinaryToDec.class);
                startActivity(intent);


            }
        });
        D2B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent(context,DecToBinary.class);
                startActivity(intent);


            }
        });
        D2H.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent(context,DecToHex.class);
                startActivity(intent);


            }
        });
    }
}