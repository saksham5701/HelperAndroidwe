package com.example.helper;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SimpleInterest extends AppCompatActivity {

    private Button h7;

    @Override    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Context context =this;
        h7=findViewById(R.id.h7);
        h7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent(context,MainActivity.class);
                startActivity(intent);


            }
        });

        OnCLick();
    }

    EditText amt,interest,time;
    Button btn;
    TextView txt1,txt2;

    public  void OnCLick()
    {
        amt=(EditText)findViewById(R.id.amt);
        interest=(EditText)findViewById(R.id.interest);
        time=(EditText)findViewById(R.id.tim);
        btn=(Button)findViewById(R.id.btn);
        txt1=(TextView)findViewById(R.id.txt1);
        txt2=(TextView)findViewById(R.id.txt2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override            public void onClick(View v) {
                int a=Integer.parseInt(amt.getText().toString());
                int b=Integer.parseInt(interest.getText().toString());
                int c=Integer.parseInt(time.getText().toString());
                int d;
                d=(a*b*c)/100;
                int e=a+d;

                txt1.setText("Total Interest Is :"+String.valueOf(d));
                txt2.setText("Total Amount is : "+String.valueOf(e));

            }
        });
    }
}