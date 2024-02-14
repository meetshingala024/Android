package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultSecond extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_second);

        int totalMarks = getIntent().getIntExtra("totalMarks", 0);
        double percentage = getIntent().getDoubleExtra("percentage", 0);
        String result = getIntent().getStringExtra("result");



        TextView totalMarksTextView = findViewById(R.id.totalMarksTextView);
        totalMarksTextView.setText("Total Marks: " + totalMarks);

        TextView percentageTextView = findViewById(R.id.percentageTextView);
        percentageTextView.setText("Percentage: " + String.format("%.2f", percentage) + "%");;

        TextView resultTextView = findViewById(R.id.resultTextView);
        resultTextView.setText("Result: " + result);
    }
}