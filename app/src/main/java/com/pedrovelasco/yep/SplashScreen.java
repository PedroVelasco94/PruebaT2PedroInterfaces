package com.pedrovelasco.yep;

import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.TransitionDrawable;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {
    ImageView bg;
    TextView tx ,subtx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        getSupportActionBar().hide();


         bg = (ImageView) findViewById(R.id.SplashBg);
        tx = (TextView) findViewById(R.id.splashTitle);
        subtx = (TextView) findViewById(R.id.SplashSubTitle);

        Typeface amatic = Typeface.createFromAsset(getAssets(), "fonts/AmaticSC-Regular.ttf");

        tx.setTypeface(amatic);
        subtx.setTypeface(amatic);

        tx.startAnimation(AnimationUtils.loadAnimation(this,R.anim.rotate_left));


        TransitionDrawable transition = (TransitionDrawable) bg.getBackground();
        transition.startTransition(3000);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        }, 3000);




    }
}
