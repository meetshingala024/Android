package com.example.assignmanet3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class ToggleButtonpro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_buttonpro);
        ToggleButton tb = findViewById(R.id.toggleButton);
        ImageView img = findViewById(R.id.imageView);

        tb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tb.isChecked()) {
                    tb.setText("ON");
                    Toast.makeText(ToggleButtonpro.this, "ON", Toast.LENGTH_SHORT).show();
                } else {
                    tb.setText("OFF");
                    Toast.makeText(ToggleButtonpro.this, "OFF", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}