package com.example.assignmanet3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;

public class Sharedprefrence extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sharedprefrence);
        SharedPreferences sp = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("Name","Meet Shingala");
        editor.putInt("Enrollment",210801321);
        editor.putString("Class","C4");
        editor.putString("Course","BCA");
        editor.commit();
    }
}