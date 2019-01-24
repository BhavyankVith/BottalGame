package com.example.my.bottalgame;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.varunest.sparkbutton.SparkButton;
import com.varunest.sparkbutton.SparkButtonBuilder;

public class PlayersOption extends AppCompatActivity {

    SparkButton play;

    EditText ed1,ed2,ed3,ed4;

    RadioButton r1,r2,r3,r4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_players_option);

        ed1=(EditText)findViewById(R.id.p1);
        ed2=(EditText)findViewById(R.id.p2);
        ed3=(EditText)findViewById(R.id.p3);
        ed4=(EditText)findViewById(R.id.p4);

        r1=(RadioButton)findViewById(R.id.rd1);
        r2=(RadioButton)findViewById(R.id.rd2);
        r3=(RadioButton)findViewById(R.id.rd3);
        r4=(RadioButton)findViewById(R.id.rd4);

        play= (SparkButton) findViewById(R.id.playbtn);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(r2.isChecked()==true || r3.isChecked()==true || r4.isChecked()==true)
                {
                    Intent i = new Intent(PlayersOption.this,MainActivity.class);
                   startActivity(i);
                }
                else
                {
                    Context context = getApplicationContext();
                    LayoutInflater inflater = getLayoutInflater();

                    View customToastRoot = inflater.inflate(R.layout.toast_lay,null);
                    Toast custom = new Toast(context);

                    custom.setView(customToastRoot);
                    custom.setDuration(Toast.LENGTH_LONG);
                    custom.show();

                }


            }
        });



        r2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                ed2.setEnabled(true);
            }
        });

        r3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                ed2.setEnabled(true);
                ed3.setEnabled(true);
            }
        });

        r4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                ed2.setEnabled(true);
                ed3.setEnabled(true);
                ed4.setEnabled(true);
            }
        });

    }
}
