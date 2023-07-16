package com.example.tictactoe2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Splash extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        ImageView mew = findViewById(R.id.imageViewme);

        Animation aa = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade);
        mew.startAnimation(aa);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent inext = new Intent(Splash.this,MainActivity.class);
                startActivity(inext);
                finish();

            }
        },4100);






    }
}