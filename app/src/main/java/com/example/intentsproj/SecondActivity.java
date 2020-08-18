package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText et_3, et_4;
    TextView textView;
    String n1 , n2;
    Button b1,b2,b3,b4;

    public int addBtn(int a, int b){
        return a + b;
    }

    public int subsBtn(int a, int b){
        return a - b;
    }

    public int multiplyBtn(int a, int b){
        return a * b;
    }

    public int divideBtn(int a, int b) {
        return a / b;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        et_3 = findViewById(R.id.et3);
        et_4 = findViewById(R.id.et4);
        textView = findViewById(R.id.textView);
        b1 = findViewById(R.id.addBtn);
        b2 = findViewById(R.id.subsBtn);
        b3 = findViewById(R.id.multiplyBtn);
        b4 = findViewById(R.id.divideBtn);

        Intent intent = getIntent();
        n1 = intent.getStringExtra("num1");
        n2 = intent.getStringExtra("num2");

        et_3.setText(n1);
        et_4.setText(n2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int ans = addBtn(Integer.parseInt(n1), Integer.parseInt(n2));
                textView.setText(n1 + " + " + n2 + " = " + ans);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int ans = subsBtn(Integer.parseInt(n1), Integer.parseInt(n2));
                textView.setText(n1 + " - " + n2 + " = " + ans);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int ans = multiplyBtn(Integer.parseInt(n1), Integer.parseInt(n2));
                textView.setText(n1 + " * " + n2 + " = " + ans);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int ans = divideBtn(Integer.parseInt(n1), Integer.parseInt(n2));
                textView.setText(n1 + " / " + n2 + " = " + ans);
            }
        });
    }

    }
