package com.example.testtechnique;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class SpaceChoseActivity extends AppCompatActivity {
    private RelativeLayout parents,childs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_space_chose);

        parents = findViewById(R.id.parent);
        childs = findViewById(R.id.child);

        parents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SpaceChoseActivity.this,WelcomeActivity.class);
                startActivity(i);
            }
        });

        childs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SpaceChoseActivity.this,WelcomeActivity.class);
                startActivity(i);
            }
        });
    }
}