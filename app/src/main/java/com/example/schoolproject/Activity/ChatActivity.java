package com.example.schoolproject.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.schoolproject.Adapter.Chat_recycle_adapter;
import com.example.schoolproject.Fragment.BottomSheet;
import com.example.schoolproject.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

import java.util.ArrayList;

public class ChatActivity extends AppCompatActivity {
    private ArrayList<String> chatList;
    private RecyclerView chat_listView;
    private Chat_recycle_adapter mAdapter;
    private ImageView info;
    private ImageView backButton,homeButton;
    BottomSheetBehavior behavior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        init();

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginScreen=new Intent(ChatActivity.this, Homepage.class);
                startActivity(loginScreen);
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginScreen=new Intent(ChatActivity.this, Assignment.class);
                startActivity(loginScreen);
            }
        });

        chatList.add("Photosynthesis an important process that is observed in plants and certain microscopic organisms. Furthermore, all life on earth is directly or indirectly dependent on this process. It is even teacher speculated that the evolution of life on earth was significantly influenced by photosynthesis.");
        chatList.add("https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4");
        chatList.add("Kindly explain briefly.!");
        chatList.add("which helps to make decisions and perceive the environment and associated stimuli.");
        chatList.add("Ecology is the branch of biology that deals with the relationships that exist between organisms and their surroundings?");
        chatList.add("Ecology is the process between organisms and their surroundings teacher.");
        chatList.add("Thanks mam");
        chatList.add("It is celar now mam.");
        chatList.add("Good");
        chatList.add("thank");


        mAdapter = new Chat_recycle_adapter(chatList, ChatActivity.this);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        chat_listView.setLayoutManager(mLayoutManager);
        chat_listView.setItemAnimator(new DefaultItemAnimator());
        chat_listView.setAdapter(mAdapter);




        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheet bottomSheet = new BottomSheet();
                bottomSheet.show(getSupportFragmentManager(),
                        BottomSheet.TAG);
            }
        });
    }

    private void init() {
        chatList = new ArrayList<>();
        chat_listView = (RecyclerView) findViewById(R.id.recycler);
        info = (ImageView) findViewById(R.id.info);
        backButton=(ImageView)findViewById(R.id.backButton);
        homeButton=(ImageView)findViewById(R.id.homeButton);
    }
}