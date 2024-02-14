package com.example.assignmanet3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.TimePicker;

public class TimePickerpro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_pickerpro);
        TextView tv = findViewById(R.id.tv);
        TimePicker tp = findViewById(R.id.tp);

        tp.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hour, int minute) {
                tv.setText(hour + " : "+minute);
            }
        });

    }
}