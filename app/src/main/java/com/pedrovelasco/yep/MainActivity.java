package com.pedrovelasco.yep;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tx;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        tx = (TextView) findViewById(R.id.loginTitle);

        Typeface amatic = Typeface.createFromAsset(getAssets(), "fonts/AmaticSC-Regular.ttf");

        tx.setTypeface(amatic);


        btn = (Button) findViewById(R.id.loginButton);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), FinalActivity.class);
                startActivity(i);
                overridePendingTransition(R.anim.face_in,R.anim.face_out);
            }
        });





    }
}
