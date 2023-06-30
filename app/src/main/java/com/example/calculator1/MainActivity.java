package com.example.calculator1;

import java.util.*;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText etn1;
    private EditText etn2;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etn1 = (EditText) findViewById(R.id.etn1);
        etn2 = (EditText) findViewById(R.id.etn2);
        tvResult = (TextView) findViewById(R.id.tvResult);
    }

    public void btnsum(View view) {
        double n1 = Double.parseDouble(etn1.getText().toString());
        double n2 = Double.parseDouble(etn2.getText().toString());
        double sum = n1+n2;
        tvResult.setText(String.valueOf(sum));
    }


    public void btnsub(View view) {
        double n1 = Double.parseDouble(etn1.getText().toString());
        double n2 = Double.parseDouble(etn2.getText().toString());
        double sub = n1-n2;
        tvResult.setText(String.valueOf(sub));
    }

    public void btnmul(View view) {

        double n1 = Double.parseDouble(etn1.getText().toString());
        double n2 = Double.parseDouble(etn2.getText().toString());
        double mul = n1*n2;
        tvResult.setText(String.valueOf(mul));
    }

    public void btndiv(View view) {
        double n1 = Double.parseDouble(etn1.getText().toString());
        double n2 = Double.parseDouble(etn2.getText().toString());
        double div = n1/n2;
        tvResult.setText(String.valueOf(div));
    }
}