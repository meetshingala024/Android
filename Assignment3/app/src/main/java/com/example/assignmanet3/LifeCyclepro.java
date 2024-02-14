package com.example.assignmanet3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class LifeCyclepro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cyclepro);
        Log.d("lifeCycle", "Created!!");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("lifeCycle", "Started!!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("lifeCycle", "Resume!!");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("lifeCycle", "Paused!!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("lifeCycle", "Stopped!!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("lifeCycle", "Destroyed!!");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("lifeCycle", "Restarted!!");
    }
}