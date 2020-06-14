package com.example.assignment4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class Challenge1LifecycleActivity2 extends AppCompatActivity {

    private static String CLASS_NAME = "Challenge1LifecycleActivity2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.challenge1_lifecycle_activity2);
        Log.e(CLASS_NAME, "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(CLASS_NAME, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(CLASS_NAME, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(CLASS_NAME, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(CLASS_NAME, "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(CLASS_NAME, "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(CLASS_NAME, "onDestroy");
    }
}