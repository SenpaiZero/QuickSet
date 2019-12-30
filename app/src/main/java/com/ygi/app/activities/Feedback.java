package com.ygi.app.activities;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import com.ygi.app.R;

public class Feedback extends AppCompatActivity implements View.OnClickListener {

    private ImageView Gmail, Fb, Phone;
    public static String FACEBOOK_URL = "https://facebook.com/Quick-set-107705287403632/";
    public static String FACEBOOK_PAGE_ID ="107705287403632";
    private String Name, Email, Subject, Comment;
    private EditText Nname, Eemail, Ssubject, Ccomment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feedback);
        getSupportActionBar().setBackgroundDrawable(
                new ColorDrawable(getResources().getColor(R.color.feedback)));

        Window window = getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(getResources().getColor(R.color.feedback));

        Spinner dropdown = findViewById(R.id.spinner2);
        String[] items = new String[]{"Report a problem", "Send a feedback"};
        ArrayAdapter<String> Adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(Adapter);

        Button btn1 = (Button) findViewById(R.id.send);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    if (Nname.getText().toString().trim().equalsIgnoreCase("")) {
                        Nname.setError("Name field can not be empty!");
                    }
                    if (Eemail.getText().toString().trim().equalsIgnoreCase("")) {
                        Eemail.setError("Email field can not be empty!");
                    }
                    if (Ssubject.getText().toString().trim().equalsIgnoreCase("")) {
                        Ssubject.setError("Subject field can not be empty!");
                    }
                    if (Ccomment.getText().toString().trim().equalsIgnoreCase("")) {
                        Ccomment.setError("Comment field can not be empty!");
                    } else {
                        Toast.makeText(getBaseContext(), "Your message has been sent!", Toast.LENGTH_SHORT).show();
                    }

            }
        });

        Button btn2 = (Button) findViewById(R.id.cancel);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        Gmail = (ImageView) findViewById(R.id.gmail);
        Fb = (ImageView) findViewById(R.id.fb);
        Phone = (ImageView) findViewById(R.id.phone);

        Nname = (EditText) findViewById(R.id.names);
        Eemail = (EditText) findViewById(R.id.es);
        Ssubject = (EditText) findViewById(R.id.namdes);
        Ccomment = (EditText) findViewById(R.id.problems);

        Gmail.setOnClickListener(this);
        Fb.setOnClickListener(this);
        Phone.setOnClickListener(this);

        Name = Nname.getText().toString();
        Email = Eemail.getText().toString();
        Subject = Ssubject.getText().toString();
        Comment = Ccomment.getText().toString();


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.gmail:
                Intent intent = new Intent(Intent.ACTION_SEND);
                String[] recipients={"quickset@gmail.com"};
                intent.putExtra(Intent.EXTRA_EMAIL, recipients);
                intent.putExtra(Intent.EXTRA_CC, "quickset@gmail.com");
                intent.setType("text/html");
                intent.setPackage("com.google.android.gm");
                startActivity(Intent.createChooser(intent, "send mail"));
                break;
            case R.id.phone:
                Intent phone = new Intent(Intent.ACTION_DIAL);
                phone.setData(Uri.parse("tel: 87000"));
                startActivity(phone);
                break;
            case R.id.fb:
                Intent facebookIntent = new Intent(Intent.ACTION_VIEW);
                String facebookUrl = getFacebookPageURL(this);
                facebookIntent.setData(Uri.parse(facebookUrl));
                startActivity(facebookIntent);
                break;
        }
    }

    public String getFacebookPageURL(Context context) {
        PackageManager packageManager = context.getPackageManager();
        try {
            int versionCode = packageManager.getPackageInfo("com.facebook.katana", 0).versionCode;
            if (versionCode >= 3002850) {
                return "fb://facewebmodal/f?href=" + FACEBOOK_URL;
            } else {
                return "fb://page/" + FACEBOOK_PAGE_ID;
            }
        } catch (PackageManager.NameNotFoundException e) {
            return FACEBOOK_URL;
        }
    }

}
