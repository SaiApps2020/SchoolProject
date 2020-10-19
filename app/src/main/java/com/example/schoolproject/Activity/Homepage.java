package com.example.schoolproject.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.schoolproject.Fragment.BottomSheet;
import com.example.schoolproject.R;

public class Homepage extends AppCompatActivity {
    private LinearLayout assignIntractor;
    private LinearLayout scoreIntractor;
    private LinearLayout examIntractor;
    private Button search;
    private LinearLayout myClass,mySubject,myQuestions;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        initViews();

       /* BottomSheet bottomSheet = new BottomSheet();
        bottomSheet.show(getSupportFragmentManager(),
                "ModalBottomSheet");*/
        assignIntractor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginScreen=new Intent(Homepage.this, Assignment.class);
                startActivity(loginScreen);
            }
        });

        examIntractor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginScreen=new Intent(Homepage.this, Exam.class);
                startActivity(loginScreen);
            }
        });


        scoreIntractor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginScreen=new Intent(Homepage.this, Score.class);
                startActivity(loginScreen);
            }
        });

        myClass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginScreen=new Intent(Homepage.this, Class.class);
                startActivity(loginScreen);
            }
        });

        mySubject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginScreen=new Intent(Homepage.this, subject.class);
                startActivity(loginScreen);
            }
        });

        myQuestions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginScreen=new Intent(Homepage.this, ChatActivity.class);
                startActivity(loginScreen);
            }
        });
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginScreen=new Intent(Homepage.this, Search.class);
                startActivity(loginScreen);
            }
        });
    }

    private void initViews() {

        assignIntractor=(LinearLayout)findViewById(R.id.assignLayout);
        examIntractor=(LinearLayout)findViewById(R.id.examLayout);
        scoreIntractor=(LinearLayout)findViewById(R.id.scoreLayout);
        myClass=(LinearLayout) findViewById(R.id.classSec_Layout);
        mySubject=(LinearLayout)findViewById(R.id.subject_layout);
        myQuestions=(LinearLayout)findViewById(R.id.question_layout);
        search=(Button)findViewById(R.id.search);
    }
}