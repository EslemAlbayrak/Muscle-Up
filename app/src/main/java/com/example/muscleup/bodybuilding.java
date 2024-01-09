package com.example.muscleup;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class bodybuilding extends AppCompatActivity {
    TextView tv5,textView4,textView2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bodybuilding);

        tv5 = (TextView) findViewById(R.id.tv5);
        textView4 = (TextView) findViewById(R.id.textView4);
        textView2 = (TextView) findViewById(R.id.textView2);

    }

}



