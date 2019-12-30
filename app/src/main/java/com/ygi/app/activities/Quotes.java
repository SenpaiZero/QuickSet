package com.ygi.app.activities;

import android.Manifest;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.ygi.app.R;


public class Quotes extends AppCompatActivity implements View.OnClickListener {

    private RelativeLayout a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22;
    ImageView imageview;
    Drawable drawable;
    Bitmap bitmap;
    String ImagePath;
    Uri URI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quotes);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        a1 = (RelativeLayout) findViewById(R.id.a1a);
        a2 = (RelativeLayout) findViewById(R.id.a2a);
        a3 = (RelativeLayout) findViewById(R.id.a3a);
        a4 = (RelativeLayout) findViewById(R.id.a4a);
        a5 = (RelativeLayout) findViewById(R.id.a5a);
        a6 = (RelativeLayout) findViewById(R.id.a6a);
        a7 = (RelativeLayout) findViewById(R.id.a7a);
        a8 = (RelativeLayout) findViewById(R.id.a8a);
        a9 = (RelativeLayout) findViewById(R.id.a9a);
        a10 = (RelativeLayout) findViewById(R.id.a10a);
        a11 = (RelativeLayout) findViewById(R.id.a11a);
        a12 = (RelativeLayout) findViewById(R.id.a12a);
        a13 = (RelativeLayout) findViewById(R.id.a13a);
        a14 = (RelativeLayout) findViewById(R.id.a14a);
        a15 = (RelativeLayout) findViewById(R.id.a15a);
        a16 = (RelativeLayout) findViewById(R.id.a16a);
        a17 = (RelativeLayout) findViewById(R.id.a17a);
        a18 = (RelativeLayout) findViewById(R.id.a18a);
        a19 = (RelativeLayout) findViewById(R.id.a19a);
        a20 = (RelativeLayout) findViewById(R.id.a20a);
        a21 = (RelativeLayout) findViewById(R.id.a21a);
        a22 = (RelativeLayout) findViewById(R.id.a22a);

        a1.setOnClickListener(this);
        a2.setOnClickListener(this);
        a3.setOnClickListener(this);
        a4.setOnClickListener(this);
        a5.setOnClickListener(this);
        a6.setOnClickListener(this);
        a7.setOnClickListener(this);
        a8.setOnClickListener(this);
        a9.setOnClickListener(this);
        a10.setOnClickListener(this);
        a11.setOnClickListener(this);
        a12.setOnClickListener(this);
        a13.setOnClickListener(this);
        a14.setOnClickListener(this);
        a15.setOnClickListener(this);
        a16.setOnClickListener(this);
        a17.setOnClickListener(this);
        a18.setOnClickListener(this);
        a19.setOnClickListener(this);
        a20.setOnClickListener(this);
        a21.setOnClickListener(this);
        a22.setOnClickListener(this);

        ActivityCompat.requestPermissions(Quotes.this,
                new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},1);
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

    /*
    Download Button
     */
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.a1a:
                drawable = getResources().getDrawable(R.drawable.a1);
                bitmap = ((BitmapDrawable)drawable).getBitmap();
                ImagePath = MediaStore.Images.Media.insertImage(
                        getContentResolver(),
                        bitmap,
                        "Quotes_1",
                        "Quotes_1"
                );
                URI = Uri.parse(ImagePath);
                Toast.makeText(Quotes.this, "Image Saved Successfully", Toast.LENGTH_LONG).show();
                break;
            case R.id.a2a:
                drawable = getResources().getDrawable(R.drawable.a2);
                bitmap = ((BitmapDrawable)drawable).getBitmap();
                ImagePath = MediaStore.Images.Media.insertImage(
                        getContentResolver(),
                        bitmap,
                        "Quotes_2",
                        "Quotes_2"
                );
                URI = Uri.parse(ImagePath);
                Toast.makeText(Quotes.this, "Image Saved Successfully", Toast.LENGTH_LONG).show();
                break;
            case R.id.a3a:
                drawable = getResources().getDrawable(R.drawable.a3);
                bitmap = ((BitmapDrawable)drawable).getBitmap();
                ImagePath = MediaStore.Images.Media.insertImage(
                        getContentResolver(),
                        bitmap,
                        "Quotes_3",
                        "Quotes_3"
                );
                URI = Uri.parse(ImagePath);
                Toast.makeText(Quotes.this, "Image Saved Successfully", Toast.LENGTH_LONG).show();
                break;
            case R.id.a4a:
                drawable = getResources().getDrawable(R.drawable.a4);
                bitmap = ((BitmapDrawable)drawable).getBitmap();
                ImagePath = MediaStore.Images.Media.insertImage(
                        getContentResolver(),
                        bitmap,
                        "Quotes_4",
                        "Quotes_4"
                );
                URI = Uri.parse(ImagePath);
                Toast.makeText(Quotes.this, "Image Saved Successfully", Toast.LENGTH_LONG).show();
                break;
            case R.id.a5a:
                drawable = getResources().getDrawable(R.drawable.a5);
                bitmap = ((BitmapDrawable)drawable).getBitmap();
                ImagePath = MediaStore.Images.Media.insertImage(
                        getContentResolver(),
                        bitmap,
                        "Quotes_5",
                        "Quotes_5"
                );
                URI = Uri.parse(ImagePath);
                Toast.makeText(Quotes.this, "Image Saved Successfully", Toast.LENGTH_LONG).show();
                break;
            case R.id.a6a:
                drawable = getResources().getDrawable(R.drawable.a6);
                bitmap = ((BitmapDrawable)drawable).getBitmap();
                ImagePath = MediaStore.Images.Media.insertImage(
                        getContentResolver(),
                        bitmap,
                        "Quotes_6",
                        "Quotes_6"
                );
                URI = Uri.parse(ImagePath);
                Toast.makeText(Quotes.this, "Image Saved Successfully", Toast.LENGTH_LONG).show();
                break;
            case R.id.a7a:
                drawable = getResources().getDrawable(R.drawable.a7);
                bitmap = ((BitmapDrawable)drawable).getBitmap();
                ImagePath = MediaStore.Images.Media.insertImage(
                        getContentResolver(),
                        bitmap,
                        "Quotes_7",
                        "Quotes_17"
                );
                URI = Uri.parse(ImagePath);
                Toast.makeText(Quotes.this, "Image Saved Successfully", Toast.LENGTH_LONG).show();
                break;
            case R.id.a8a:
                drawable = getResources().getDrawable(R.drawable.a8);
                bitmap = ((BitmapDrawable)drawable).getBitmap();
                ImagePath = MediaStore.Images.Media.insertImage(
                        getContentResolver(),
                        bitmap,
                        "Quotes_8",
                        "Quotes_8"
                );
                URI = Uri.parse(ImagePath);
                Toast.makeText(Quotes.this, "Image Saved Successfully", Toast.LENGTH_LONG).show();
                break;
            case R.id.a9a:
                drawable = getResources().getDrawable(R.drawable.a9);
                bitmap = ((BitmapDrawable)drawable).getBitmap();
                ImagePath = MediaStore.Images.Media.insertImage(
                        getContentResolver(),
                        bitmap,
                        "Quotes_9",
                        "Quotes_9"
                );
                URI = Uri.parse(ImagePath);
                Toast.makeText(Quotes.this, "Image Saved Successfully", Toast.LENGTH_LONG).show();
                break;
            case R.id.a10a:
                drawable = getResources().getDrawable(R.drawable.a10);
                bitmap = ((BitmapDrawable)drawable).getBitmap();
                ImagePath = MediaStore.Images.Media.insertImage(
                        getContentResolver(),
                        bitmap,
                        "Quotes_10",
                        "Quotes_10"
                );
                URI = Uri.parse(ImagePath);
                Toast.makeText(Quotes.this, "Image Saved Successfully", Toast.LENGTH_LONG).show();
                break;
            case R.id.a11a:
                drawable = getResources().getDrawable(R.drawable.a11);
                bitmap = ((BitmapDrawable)drawable).getBitmap();
                ImagePath = MediaStore.Images.Media.insertImage(
                        getContentResolver(),
                        bitmap,
                        "Quotes_11",
                        "Quotes_11"
                );
                URI = Uri.parse(ImagePath);
                Toast.makeText(Quotes.this, "Image Saved Successfully", Toast.LENGTH_LONG).show();
                break;
            case R.id.a12a:
                drawable = getResources().getDrawable(R.drawable.a12);
                bitmap = ((BitmapDrawable)drawable).getBitmap();
                ImagePath = MediaStore.Images.Media.insertImage(
                        getContentResolver(),
                        bitmap,
                        "Quotes_12",
                        "Quotes_12"
                );
                URI = Uri.parse(ImagePath);
                Toast.makeText(Quotes.this, "Image Saved Successfully", Toast.LENGTH_LONG).show();
                break;
            case R.id.a13a:
                drawable = getResources().getDrawable(R.drawable.a13);
                bitmap = ((BitmapDrawable)drawable).getBitmap();
                ImagePath = MediaStore.Images.Media.insertImage(
                        getContentResolver(),
                        bitmap,
                        "Quotes_13",
                        "Quotes_13"
                );
                URI = Uri.parse(ImagePath);
                Toast.makeText(Quotes.this, "Image Saved Successfully", Toast.LENGTH_LONG).show();
                break;
            case R.id.a14a:
                drawable = getResources().getDrawable(R.drawable.a14);
                bitmap = ((BitmapDrawable)drawable).getBitmap();
                ImagePath = MediaStore.Images.Media.insertImage(
                        getContentResolver(),
                        bitmap,
                        "Quotes_14",
                        "Quotes_14"
                );
                URI = Uri.parse(ImagePath);
                Toast.makeText(Quotes.this, "Image Saved Successfully", Toast.LENGTH_LONG).show();
                break;
            case R.id.a15a:
                drawable = getResources().getDrawable(R.drawable.a15);
                bitmap = ((BitmapDrawable)drawable).getBitmap();
                ImagePath = MediaStore.Images.Media.insertImage(
                        getContentResolver(),
                        bitmap,
                        "Quotes_15",
                        "Quotes_15"
                );
                URI = Uri.parse(ImagePath);
                Toast.makeText(Quotes.this, "Image Saved Successfully", Toast.LENGTH_LONG).show();
                break;
            case R.id.a16a:
                drawable = getResources().getDrawable(R.drawable.a16);
                bitmap = ((BitmapDrawable)drawable).getBitmap();
                ImagePath = MediaStore.Images.Media.insertImage(
                        getContentResolver(),
                        bitmap,
                        "Quotes_16",
                        "Quotes_16"
                );
                URI = Uri.parse(ImagePath);
                Toast.makeText(Quotes.this, "Image Saved Successfully", Toast.LENGTH_LONG).show();
                break;
            case R.id.a17a:
                drawable = getResources().getDrawable(R.drawable.a17);
                bitmap = ((BitmapDrawable)drawable).getBitmap();
                ImagePath = MediaStore.Images.Media.insertImage(
                        getContentResolver(),
                        bitmap,
                        "Quotes_17",
                        "Quotes_17"
                );
                URI = Uri.parse(ImagePath);
                Toast.makeText(Quotes.this, "Image Saved Successfully", Toast.LENGTH_LONG).show();
                break;
            case R.id.a18a:
                drawable = getResources().getDrawable(R.drawable.a18);
                bitmap = ((BitmapDrawable)drawable).getBitmap();
                ImagePath = MediaStore.Images.Media.insertImage(
                        getContentResolver(),
                        bitmap,
                        "Quotes_18",
                        "Quotes_18"
                );
                URI = Uri.parse(ImagePath);
                Toast.makeText(Quotes.this, "Image Saved Successfully", Toast.LENGTH_LONG).show();
                break;
            case R.id.a19a:
                drawable = getResources().getDrawable(R.drawable.a19);
                bitmap = ((BitmapDrawable)drawable).getBitmap();
                ImagePath = MediaStore.Images.Media.insertImage(
                        getContentResolver(),
                        bitmap,
                        "Quotes_19",
                        "Quotes_18"
                );
                URI = Uri.parse(ImagePath);
                Toast.makeText(Quotes.this, "Image Saved Successfully", Toast.LENGTH_LONG).show();
                break;
            case R.id.a20a:
                drawable = getResources().getDrawable(R.drawable.a20);
                bitmap = ((BitmapDrawable)drawable).getBitmap();
                ImagePath = MediaStore.Images.Media.insertImage(
                        getContentResolver(),
                        bitmap,
                        "Quotes_20",
                        "Quotes_20"
                );
                URI = Uri.parse(ImagePath);
                Toast.makeText(Quotes.this, "Image Saved Successfully", Toast.LENGTH_LONG).show();
                break;
            case R.id.a21a:
                drawable = getResources().getDrawable(R.drawable.a21);
                bitmap = ((BitmapDrawable)drawable).getBitmap();
                ImagePath = MediaStore.Images.Media.insertImage(
                        getContentResolver(),
                        bitmap,
                        "Quotes_21",
                        "Quotes_21"
                );
                URI = Uri.parse(ImagePath);
                Toast.makeText(Quotes.this, "Image Saved Successfully", Toast.LENGTH_LONG).show();
                break;
            case R.id.a22a:
                drawable = getResources().getDrawable(R.drawable.a22);
                bitmap = ((BitmapDrawable)drawable).getBitmap();
                ImagePath = MediaStore.Images.Media.insertImage(
                        getContentResolver(),
                        bitmap,
                        "Quotes_22",
                        "Quotes_22"
                );
                URI = Uri.parse(ImagePath);
                Toast.makeText(Quotes.this, "Image Saved Successfully", Toast.LENGTH_LONG).show();
                break;
        }

    }
    @Override
    public void onRequestPermissionsResult (int requestCode,
                                           String permission[], int[] grantResults) {
        switch (requestCode) {
            case 1:{
                if (grantResults.length>0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

                }else {
                    Toast.makeText(Quotes.this, "Permission denied to write to your External storage", Toast.LENGTH_SHORT).show();
                }
                return;
            }
        }
    }
}
