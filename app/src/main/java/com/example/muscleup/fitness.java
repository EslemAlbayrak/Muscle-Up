package com.example.muscleup;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class fitness extends AppCompatActivity {
    TextView tv4,textView,tv9;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fitness);

        tv4 = (TextView) findViewById(R.id.tv4);
        textView = (TextView) findViewById(R.id.textView);
        tv9 = (TextView) findViewById(R.id.tv9);

    }

}



