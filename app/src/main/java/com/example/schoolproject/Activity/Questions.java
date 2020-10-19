package com.example.schoolproject.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.schoolproject.R;

public class Questions extends AppCompatActivity {
    private ImageView back,home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
        back=(ImageView) findViewById(R.id.backButton);
        home=(ImageView) findViewById(R.id.homeButton);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginScreen=new Intent(Questions.this, Homepage.class);
                startActivity(loginScreen);
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginScreen=new Intent(Questions.this, Homepage.class);
                startActivity(loginScreen);
            }
        });
    }
}