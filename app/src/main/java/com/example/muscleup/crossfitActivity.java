package com.example.muscleup;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class crossfitActivity extends AppCompatActivity {
    TextView tv3,textView5,textView3;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crossfit);

        tv3 = (TextView) findViewById(R.id.tv3);
        textView5 = (TextView) findViewById(R.id.textView5);
        textView3 = (TextView) findViewById(R.id.textView3);

    }

}



