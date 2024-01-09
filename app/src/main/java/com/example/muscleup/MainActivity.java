package com.example.muscleup;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {
    Button bu1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bu1 = (Button) findViewById(R.id.bu1);

        bu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bu1 = new Intent(MainActivity.this, sports.class);
                startActivity(bu1);
            }
        });
    }
}



