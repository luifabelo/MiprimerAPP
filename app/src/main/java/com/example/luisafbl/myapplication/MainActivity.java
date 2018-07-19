package com.example.luisafbl.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView totalText;
    EditText percentageTxt;
    EditText numberTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        totalText = findViewById(R.id.totalText);
        percentageTxt = findViewById(R.id.percentageTxt);
        numberTxt = findViewById(R.id.numberText);


        Button calculateBtn = findViewById(R.id.calculateBtn);
        calculateBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                float percentage = Float.parseFloat(percentageTxt.getText().toString());
                float dec = percentage/100;
                float total = dec * Float.parseFloat(numberTxt.getText().toString());

                totalText.setText(Float.toString(total));


            }
        });

    }
}
