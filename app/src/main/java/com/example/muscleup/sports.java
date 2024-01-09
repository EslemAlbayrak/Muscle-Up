package com.example.muscleup;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class sports extends AppCompatActivity {


    TextView tv2;
    ImageView imageView2,imageView3,imageView4;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports);

        tv2 = (TextView) findViewById(R.id.tv2);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        imageView4 = findViewById(R.id.imageView4);


        imageView2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent imageView2 = new Intent(sports.this, crossfitActivity.class);
                startActivity(imageView2);
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent imageView4 = new Intent(sports.this, bodybuilding.class);
                startActivity(imageView4);
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent imageView3 = new Intent(sports.this, fitness.class);
                startActivity(imageView3);
            }





        });
    }
}











