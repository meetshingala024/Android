package com.example.assignmanet3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class Radiobuttonpro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radiobuttonpro);

        Button btn = findViewById(R.id.btnsubmit);
        EditText nm = findViewById(R.id.lblname);
        RadioGroup radioGroup = findViewById(R.id.radioGroup);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int radio = radioGroup.getCheckedRadioButtonId();
                RadioButton rd = findViewById(radio);
                String Gender = (rd!=null)?rd.getText().toString():"Not Selected";
                Toast.makeText(Radiobuttonpro.this, "Name is "+nm.getText()+" & Gender is  "+Gender, Toast.LENGTH_SHORT).show();
            }
        });
    }
}