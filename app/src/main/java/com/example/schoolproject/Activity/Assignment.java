package com.example.schoolproject.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TableRow;

import com.example.schoolproject.R;

public class Assignment extends AppCompatActivity {
   private TableRow row1;
   private ImageView back,home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment);
        initViews();
        row1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginScreen=new Intent(Assignment.this, ChatActivity.class);
                startActivity(loginScreen);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginScreen=new Intent(Assignment.this, Homepage.class);
                startActivity(loginScreen);
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginScreen=new Intent(Assignment.this, Homepage.class);
                startActivity(loginScreen);
            }
        });
    }

    private void initViews() {

        row1=(TableRow)findViewById(R.id.row1);
        back=(ImageView) findViewById(R.id.backButton);
        home=(ImageView) findViewById(R.id.homeButton);
    }
}