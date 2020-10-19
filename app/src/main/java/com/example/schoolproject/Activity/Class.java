package com.example.schoolproject.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.schoolproject.R;

public class Class extends AppCompatActivity {
    private ImageView back,home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class);
        back=(ImageView) findViewById(R.id.backButton);
        home=(ImageView) findViewById(R.id.homeButton);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginScreen=new Intent(Class.this, Homepage.class);
                startActivity(loginScreen);
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginScreen=new Intent(Class.this, Homepage.class);
                startActivity(loginScreen);
            }
        });
    }
}