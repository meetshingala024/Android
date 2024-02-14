package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ToggleButton;
import android.widget.ImageView;
import android.widget.CompoundButton;
public class ImageToggle extends AppCompatActivity {

    private ToggleButton toggleButton;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_toggle);
        toggleButton = findViewById(R.id.toggleButton);
        imageView = findViewById(R.id.imageView);
        toggleImage();

        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                toggleImage();
            }
        });
    }
    private void toggleImage() {
        if (toggleButton.isChecked()) {
            imageView.setImageResource(R.drawable.img2);
        } else {
            imageView.setImageResource(R.drawable.img1);
        }
    }
}