package com.example.timer2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

public class TimerCountdown extends AppCompatActivity {
    int time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer_countdown);

        final TextView secondsLeft = findViewById(R.id.TimeLeftText);

        Intent intent = getIntent();
        time = Integer.parseInt(intent.getStringExtra(MainActivity.EXTRA_MESSAGE));

        new CountDownTimer(time * 1000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                secondsLeft.setText("Seconds left: " + millisUntilFinished/1000);
            }

            @Override
            public void onFinish() {
                secondsLeft.setText("Timer Done!");
            }
        }.start();
    }
}
