package com.ygi.app.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import com.ygi.app.R;
import com.ygi.app.Tools.Calculator;
import com.ygi.app.Tools.Stopwatch;

public class Tools extends AppCompatActivity implements View.OnClickListener {

    private CardView Stop, Calcu, Converter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tools);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Calcu = (CardView) findViewById(R.id.calcu);
        Converter = (CardView) findViewById(R.id.converter);
        Stop = (CardView) findViewById(R.id.stopwatch);

        Calcu.setOnClickListener(this);
        Converter.setOnClickListener(this);
        Stop.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.calcu:
                startActivity(new Intent(Tools.this, Calculator.class));
                break;
            case R.id.stopwatch:
                startActivity(new Intent(Tools.this, Stopwatch.class));
        }
    }
    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
