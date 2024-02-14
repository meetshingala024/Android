package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultFirst extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_first);
        TextView nm = findViewById(R.id.name);
        TextView en = findViewById(R.id.enrollnum);
        TextView py = findViewById(R.id.py);
        TextView mern = findViewById(R.id.mern);
        TextView ad = findViewById(R.id.adroid);
        TextView asp = findViewById(R.id.asp);
        TextView lvl = findViewById(R.id.laravel);
        TextView cs = findViewById(R.id.cs);
        Button btn = findViewById(R.id.btnsubmit);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), ResultSecond.class);
                String nam = nm.getText().toString();
                String enoo = en.getText().toString();
                int pyy = Integer.parseInt(py.getText().toString());
                int mernn = Integer.parseInt(mern.getText().toString());
                int add = Integer.parseInt(ad.getText().toString());
                int aspp = Integer.parseInt(asp.getText().toString());
                int lvll = Integer.parseInt(lvl.getText().toString());
                int css = Integer.parseInt(cs.getText().toString());

                int total = pyy+mernn+add+aspp+lvll+css;
                double per = total/6;

                String result;
                if(per>=40)
                {
                    result = "pass";
                }
                else
                {
                    result = "fail";
                }

                i.putExtra("Name is", nam);
                i.putExtra("En. No is", enoo);
                i.putExtra("Python Marks", pyy);
                i.putExtra("Java", mernn);
                i.putExtra("adroid", add);
                i.putExtra("asp", aspp);
                i.putExtra("laravel", lvll);
                i.putExtra("cs", css);
                i.putExtra("totalMarks", total);
                i.putExtra("percentage", per);
                i.putExtra("result", result);

                startActivity(i);
            }
        });
    }
}