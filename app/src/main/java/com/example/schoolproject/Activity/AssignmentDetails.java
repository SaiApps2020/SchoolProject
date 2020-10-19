package com.example.schoolproject.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.ImageView;
import android.widget.TableRow;

import com.example.schoolproject.R;

public class AssignmentDetails extends AppCompatActivity {
   private ImageView video;
    private ImageView back,home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment_details);
        initViews();

        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginScreen=new Intent(AssignmentDetails.this, video_Image.class);
                startActivity(loginScreen);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginScreen=new Intent(AssignmentDetails.this, Assignment.class);
                startActivity(loginScreen);
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginScreen=new Intent(AssignmentDetails.this, Homepage.class);
                startActivity(loginScreen);
            }
        });

    }

    private void initViews() {
        video=(ImageView) findViewById(R.id.video);
        back=(ImageView) findViewById(R.id.backButton);
        home=(ImageView) findViewById(R.id.homeButton);

    }
}