package com.ygi.app.activities;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;

import com.ygi.app.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class About extends AppCompatActivity implements View.OnClickListener {

    private CircleImageView ygi, robert, justine, farnaida, albao, cherish, aubrey;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
        getSupportActionBar().setBackgroundDrawable(
        new ColorDrawable(getResources().getColor(R.color.about)));

        Window window = getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(getResources().getColor(R.color.about));


        ygi = (CircleImageView) findViewById(R.id.ygi);
        robert = (CircleImageView) findViewById(R.id.robert);
        cherish = (CircleImageView) findViewById(R.id.cherish);
        justine = (CircleImageView) findViewById(R.id.justine);
        aubrey = (CircleImageView) findViewById(R.id.aubrey);
        albao = (CircleImageView) findViewById(R.id.albao);
        farnaida = (CircleImageView) findViewById(R.id.far);

        ygi.setOnClickListener(this);
        robert.setOnClickListener(this);
        cherish.setOnClickListener(this);
        aubrey.setOnClickListener(this);
        justine.setOnClickListener(this);
        albao.setOnClickListener(this);
        farnaida.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.ygi:
                Toast.makeText(getBaseContext(), "YGI MARTIN B. SANTOS", Toast.LENGTH_SHORT).show();
                break;
            case R.id.robert:
                Toast.makeText(getBaseContext(), "ROBERT ALLEN GUEVARRA MARIANO", Toast.LENGTH_SHORT).show();
                break;
            case R.id.cherish:
                Toast.makeText(getBaseContext(), "CHERISH MARIE M. DELOS SANTOS", Toast.LENGTH_SHORT).show();
                break;
            case R.id.aubrey:
                Toast.makeText(getBaseContext(), "LOURD AUBREY JUNGCO", Toast.LENGTH_SHORT).show();
                break;
            case R.id.justine:
                Toast.makeText(getBaseContext(), "JUSTINE J. VILLANOVAR", Toast.LENGTH_SHORT).show();
                break;
            case R.id.albao:
                Toast.makeText(getBaseContext(), "JULIANA ELIZA TORRES ALBAO", Toast.LENGTH_SHORT).show();
                break;
            case R.id.far:
                Toast.makeText(getBaseContext(), "FARNAIDA BABANGGOL", Toast.LENGTH_SHORT).show();
                break;

        }
    }
    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
