package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class RegistrationForm extends AppCompatActivity {

    private EditText etRollNo, etName, etMobile, etEmail, etCourse, etDOB;
    private AutoCompleteTextView actvCollegeName;
    private Spinner spinnerCity;
    private CheckBox cbRead, cbWrite, cbSpeak;
    private RadioGroup rgGender;
    private RadioButton rbMale, rbFemale;
    private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_form);

        etRollNo = findViewById(R.id.etRollNo);
        etName = findViewById(R.id.etName);
        etMobile = findViewById(R.id.etMobile);
        etEmail = findViewById(R.id.etEmail);
        etCourse = findViewById(R.id.etCourse);
        etDOB = findViewById(R.id.etDOB);
        actvCollegeName = findViewById(R.id.actvCollegeName);
        spinnerCity = findViewById(R.id.spinnerCity);
        cbRead = findViewById(R.id.cbRead);
        cbWrite = findViewById(R.id.cbWrite);
        cbSpeak = findViewById(R.id.cbSpeak);
        rgGender = findViewById(R.id.rgGender);
        rbMale = findViewById(R.id.rbMale);
        rbFemale = findViewById(R.id.rbFemale);
        btnSubmit = findViewById(R.id.btnSubmit);

        // Populate spinner with cities
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this, R.array.cities, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCity.setAdapter(adapter);

        // Set autocomplete for CollegeName
        String[] colleges = getResources().getStringArray(R.array.colleges);
        ArrayAdapter<String> collegeAdapter = new ArrayAdapter<>(
                this, android.R.layout.simple_dropdown_item_1line, colleges);
        actvCollegeName.setAdapter(collegeAdapter);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                submitForm();
            }
        });
    }

    private void submitForm() {
        String rollNo = etRollNo.getText().toString().trim();
        String name = etName.getText().toString().trim();
        String mobile = etMobile.getText().toString().trim();
        String email = etEmail.getText().toString().trim();
        String city = spinnerCity.getSelectedItem().toString();
        String collegeName = actvCollegeName.getText().toString().trim();
        String course = etCourse.getText().toString().trim();
        String dob = etDOB.getText().toString().trim();
        boolean read = cbRead.isChecked();
        boolean write = cbWrite.isChecked();
        boolean speak = cbSpeak.isChecked();
        String gender = (rgGender.getCheckedRadioButtonId() == R.id.rbMale) ? "Male" : "Female";

        // Validate form fields
        if (rollNo.isEmpty() || name.isEmpty() || mobile.isEmpty() || email.isEmpty() ||
                city.equals(getString(R.string.select_city)) || collegeName.isEmpty() ||
                course.isEmpty() || dob.isEmpty() || (!read && !write && !speak)) {
            showToast("Please fill in all fields (except skills).");
        } else if (!isValidMobile(mobile)) {
            showToast("Invalid Mobile Number");
        } else if (!isValidEmail(email)) {
            showToast("Invalid Email Address");
        } else {
            // Display the data in a Toast
            String skills = getSkillsString(read, write, speak);
            String toastMessage = "Roll No: " + rollNo + "\nName: " + name +
                    "\nMobile: " + mobile + "\nEmail: " + email + "\nCity: " + city +
                    "\nCollege Name: " + collegeName + "\nCourse: " + course +
                    "\nDOB: " + dob + "\nSkills: " + skills + "\nGender: " + gender;

            showToast(toastMessage);
        }
    }

    private boolean isValidMobile(String mobile) {
        // Your mobile validation logic goes here
        // For simplicity, just checking if it's not empty
        return !mobile.isEmpty();
    }

    private boolean isValidEmail(String email) {
        // Your email validation logic goes here
        // For simplicity, just checking if it's not empty
        return !email.isEmpty();
    }

    private String getSkillsString(boolean read, boolean write, boolean speak) {
        StringBuilder skillsBuilder = new StringBuilder();
        if (read) skillsBuilder.append("Read, ");
        if (write) skillsBuilder.append("Write, ");
        if (speak) skillsBuilder.append("Speak");

        String skills = skillsBuilder.toString().trim();
        if (skills.endsWith(",")) {
            // Remove trailing comma
            skills = skills.substring(0, skills.length() - 1);
        }
        return skills;
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}