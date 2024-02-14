package com.example.assignmanet3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class CheckBoxpro extends AppCompatActivity {
private CheckBox cb1,cb2,cb3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_boxpro);
        cb1 = findViewById(R.id.cb1);
        cb2 = findViewById(R.id.cb2);
        cb3 = findViewById(R.id.cb3);
    }
    public void onCheck(View v) {
        if (v.getId() == R.id.cb1 && cb1.isChecked()) {
            Toast.makeText(this, "Writing", Toast.LENGTH_SHORT).show();

        } else if (v.getId() == R.id.cb2 && cb2.isChecked()) {
            Toast.makeText(this, "Reading", Toast.LENGTH_SHORT).show();

        } else if (v.getId() == R.id.cb3 && cb3.isChecked()) {
          Toast.makeText(this, "Playing", Toast.LENGTH_SHORT).show();

        }
    }
}