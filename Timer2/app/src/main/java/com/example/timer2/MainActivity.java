package com.example.timer2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentUris;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static String EXTRA_MESSAGE = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void make_countdown_timer(View view){
        EditText time_getter = findViewById(R.id.Timer_Intro);
        String time_String = time_getter.getText().toString();

        Intent intent = new Intent(this, TimerCountdown.class);
        intent.putExtra(EXTRA_MESSAGE, time_String);
        startActivity(intent);
    }
}
