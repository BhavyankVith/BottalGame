package com.example.my.bottalgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    ImageView iv;

    Button b_go;
    Button b_restart;

    Random r;




    int angle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r=new Random();






        iv=(ImageView)findViewById(R.id.imageView);
        b_go=(Button)findViewById(R.id.button);

        b_restart =(Button)findViewById(R.id.button2);

        b_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                angle=r.nextInt() + 360;
                RotateAnimation rotate = new RotateAnimation(0,angle

                        ,RotateAnimation.RELATIVE_TO_SELF,0.5f,RotateAnimation.RELATIVE_TO_SELF,0.5f);
                rotate.setFillAfter(true);
                rotate.setDuration(1000);
                rotate.setInterpolator(new AccelerateDecelerateInterpolator());

                iv.startAnimation(rotate);
            }
        });

        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                angle=r.nextInt() + 360;
                RotateAnimation rotate = new RotateAnimation(0,angle

                        ,RotateAnimation.RELATIVE_TO_SELF,0.5f,RotateAnimation.RELATIVE_TO_SELF,0.5f);
                rotate.setFillAfter(true);
                rotate.setDuration(1000);
                rotate.setInterpolator(new AccelerateDecelerateInterpolator());

                iv.startAnimation(rotate);
            }
        });

        b_restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int temp = angle % 360;
                RotateAnimation rotate = new RotateAnimation(temp,360

                        ,RotateAnimation.RELATIVE_TO_SELF,0.5f,RotateAnimation.RELATIVE_TO_SELF,0.5f);
                rotate.setFillAfter(true);
                rotate.setDuration(1000);
                rotate.setInterpolator(new AccelerateDecelerateInterpolator());

                iv.startAnimation(rotate);

            }
        });






    }
}
