package com.example.resumemakerapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;

public class spleshActivity extends AppCompatActivity {
    LottieAnimationView splesh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splesh);

        splesh = findViewById(R.id.splesh);

        new Handler().postDelayed(new Runnable() {

            @Override

            public void run() {

                Intent i = new Intent(spleshActivity.this, MainActivity.class);

                startActivity(i);


                finish();

            }

        }, 1000);

    }
}