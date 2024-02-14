package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SimpleCalculator extends AppCompatActivity {
    private EditText num1EditText, num2EditText;
    private TextView resultTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_calculator);
        num1EditText = findViewById(R.id.num1);
        num2EditText = findViewById(R.id.num2);
        resultTextView = findViewById(R.id.txt1);

        Button addButton = findViewById(R.id.btn1);
        Button subtractButton = findViewById(R.id.btn2);
        Button multiplyButton = findViewById(R.id.btn3);
        Button divideButton = findViewById(R.id.btn4);

        int num1 = Integer.parseInt(num1EditText.getText().toString());
        int num2 = Integer.parseInt(num2EditText.getText().toString());
        int result = 0;

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculateResult('+');
            }
        });

        subtractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculateResult('-');
            }
        });

        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculateResult('*');
            }
        });

        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculateResult('/');
            }
        });
    }

    private void calculateResult(char operator) {


        int result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    resultTextView.setText("Cannot divide by zero");
                    return;
                }
                break;
        }

        resultTextView.setText( result);
    }
}