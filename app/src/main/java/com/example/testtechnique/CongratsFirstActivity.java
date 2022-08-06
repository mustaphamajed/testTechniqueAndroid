package com.example.testtechnique;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CongratsFirstActivity extends AppCompatActivity {
    private Button nextScreen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_congrats_first);


        nextScreen = findViewById(R.id.continu);

        nextScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CongratsFirstActivity.this,CongratsSecondActivity.class);
                startActivity(i);
            }
        });
    }
}