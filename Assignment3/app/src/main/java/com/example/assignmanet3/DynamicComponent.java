package com.example.assignmanet3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DynamicComponent extends AppCompatActivity {

    private LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic_component);
        linearLayout = findViewById(R.id.linearLayout);

        Button addButton = findViewById(R.id.addButton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addNewTextView();
            }
        });
    }

    private void addNewTextView() {
        // Create a new TextView
        TextView newTextView = new TextView(this);
        newTextView.setText("Dynamic TextView");

        // Set layout parameters
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        layoutParams.setMargins(0, 16, 0, 0); // Set margins if needed

        // Add the new TextView to the LinearLayout
        linearLayout.addView(newTextView, layoutParams);
    }
}