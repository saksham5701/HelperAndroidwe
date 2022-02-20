package com.example.helper;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class DecToBinary extends AppCompatActivity {


    EditText input, output;
    Button submit, reset;
    private Button h4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        input = (EditText) findViewById(R.id.editText);
        output = (EditText) findViewById(R.id.output);

        final Context context =this;
        h4=findViewById(R.id.h4);
        h4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent(context,MainActivity.class);
                startActivity(intent);


            }
        });

        submit = (Button) findViewById(R.id.submit);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String string = input.getText().toString();


                int i = Integer.parseInt(string);


                String binary = Integer.toBinaryString(i);


                output.setText(binary);
            }
        });


        reset = (Button) findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText("");
                output.setText("");
            }
        });

    }
}
