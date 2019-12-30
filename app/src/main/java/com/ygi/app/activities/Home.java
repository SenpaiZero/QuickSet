package com.ygi.app.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.ygi.app.R;


public class Home extends AppCompatActivity implements View.OnClickListener {

    private Toolbar toolbar;
    private CardView Note, Schedule, About, Feedback, Tool, Qoutes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        Schedule = (CardView) findViewById(R.id.schedule);
        Note = (CardView) findViewById(R.id.note);
        About = (CardView) findViewById(R.id.about);
        Feedback = (CardView) findViewById(R.id.feedback);
        Tool = (CardView) findViewById(R.id.tools);
        Qoutes = (CardView) findViewById(R.id.qoutes);

        Schedule.setOnClickListener(this);
        Note.setOnClickListener(this);
        About.setOnClickListener(this);
        Feedback.setOnClickListener(this);
        Tool.setOnClickListener(this);
        Qoutes.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.schedule:
                startActivity(new Intent(Home.this, MainActivity.class));
                break;
            case R.id.note:
                startActivity(new Intent(Home.this, NotesActivity.class));
                break;
            case R.id.about:
                startActivity(new Intent(Home.this, About.class));
                break;
            case R.id.feedback:
                startActivity(new Intent(Home.this, Feedback.class));
                break;
            case R.id.tools:
                startActivity(new Intent(Home.this, Tools.class));
                break;
            case R.id.qoutes:
                startActivity(new Intent(Home.this, Quotes.class));
                break;
        }
    }

}