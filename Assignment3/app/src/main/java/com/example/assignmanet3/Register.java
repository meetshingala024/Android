package com.example.assignmanet3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    private EditText passwordEditText, phoneEditText, dateEditText;
    private RadioButton maleRadioButton, femaleRadioButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        passwordEditText = findViewById(R.id.editTextTextPassword);
        phoneEditText = findViewById(R.id.editTextPhone);
        dateEditText = findViewById(R.id.editTextDate);

        maleRadioButton = findViewById(R.id.radioButton);
        femaleRadioButton = findViewById(R.id.radioButton2);

        Button submitButton = findViewById(R.id.button);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToastWithValues();
            }
        });
    }

    private void showToastWithValues() {
        String password = passwordEditText.getText().toString().trim();
        String phone = phoneEditText.getText().toString().trim();
        String dateOfBirth = dateEditText.getText().toString().trim();

        String gender;
        if (maleRadioButton.isChecked()) {
            gender = "Male";
        } else if (femaleRadioButton.isChecked()) {
            gender = "Female";
        } else {
            gender = "Not specified";
        }

        String toastMessage = "Password: " + password +
                "\nPhone: " + phone +
                "\nDate of Birth: " + dateOfBirth +
                "\nGender: " + gender;

        Toast.makeText(this, toastMessage, Toast.LENGTH_LONG).show();
    }
}