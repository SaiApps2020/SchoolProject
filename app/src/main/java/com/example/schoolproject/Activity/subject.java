package com.example.schoolproject.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TableRow;

import com.example.schoolproject.R;

public class subject extends AppCompatActivity {
    private ImageView back,home;
    private TableRow row1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject);
        back=(ImageView) findViewById(R.id.backButton);
        row1=(TableRow)findViewById(R.id.row1);
        home=(ImageView) findViewById(R.id.homeButton);
        row1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginScreen=new Intent(subject.this, ChatActivity.class);
                startActivity(loginScreen);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginScreen=new Intent(subject.this, Homepage.class);
                startActivity(loginScreen);
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginScreen=new Intent(subject.this, Homepage.class);
                startActivity(loginScreen);
            }
        });

    }
}