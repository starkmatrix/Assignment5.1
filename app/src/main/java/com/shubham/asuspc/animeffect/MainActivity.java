package com.shubham.asuspc.animeffect;

import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.TextView;
import android.animation.ArgbEvaluator;

public class MainActivity extends AppCompatActivity {

    TextView txt1;
    Button btn1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1 = (TextView) findViewById(R.id.text1);
        btn1 = (Button) findViewById(R.id.Button1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                manageBlinkEffect();
            }
        });
    }

    private void manageBlinkEffect() {
        ObjectAnimator anim = ObjectAnimator.ofInt(txt1,"BackgroundColor",Color.WHITE, Color.RED,Color.WHITE);
        anim.setDuration(1500);
        anim.setEvaluator(new ArgbEvaluator());
        anim.setRepeatMode(Animation.REVERSE);
        anim.setRepeatCount(Animation.INFINITE);
        anim.start();
    }
} 