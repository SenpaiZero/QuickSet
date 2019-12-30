package com.ygi.app.Tools;

import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Chronometer;
import android.widget.TextView;
import android.widget.Toast;

import com.ygi.app.R;

public class Stopwatch extends AppCompatActivity {

    private Chronometer chronometer;
    private boolean running;
    private long pauseOffset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stopwatch);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        chronometer = (findViewById(R.id.chronometer));
        final TextView textView = (TextView) (findViewById(R.id.info));
    }

    public void start(View v) {
        if (!running) {
            chronometer.start();
            chronometer.setBase(SystemClock.elapsedRealtime() - pauseOffset);
            running = true;
            Toast.makeText(getBaseContext(), "Started", Toast.LENGTH_SHORT).show();
        }

    }
    public void pause(View v) {
        if (running) {
            chronometer.stop();
            pauseOffset = SystemClock.elapsedRealtime() - chronometer.getBase();
            running = false;
            Toast.makeText(getBaseContext(), "Paused", Toast.LENGTH_SHORT).show();

        }
    }
    public void reset(View v) {
        chronometer.setBase(SystemClock.elapsedRealtime());
        pauseOffset = 0;
        Toast.makeText(getBaseContext(), "Reset", Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }


}

