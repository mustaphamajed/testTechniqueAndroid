package com.example.testtechnique;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button EmailSignIn;
    private TextView SignUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EmailSignIn = findViewById(R.id.SignInByEmail);
        SignUp = findViewById(R.id.signUp);

        EmailSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,SignInActivity.class);
                startActivity(i);
            }
        });

        SignUp.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i = new Intent(MainActivity.this,SignUpActivity.class);
        startActivity(i);
    }
}