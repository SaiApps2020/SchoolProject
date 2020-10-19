package com.example.schoolproject.Activity;

import android.os.Bundle;

import com.example.schoolproject.Adapter.Chat_recycle_adapter;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;

import com.example.schoolproject.R;

import java.util.ArrayList;

public class Chat extends AppCompatActivity {
    private ArrayList<String> chatList;
    private RecyclerView chat_listView;
    private Chat_recycle_adapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        CollapsingToolbarLayout toolBarLayout = (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);
        toolBarLayout.setTitle(getTitle());
        init();
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


        /*mAdapter=new Chat_recycle_adapter(chatList,Chat.this);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        chat_listView.setLayoutManager(mLayoutManager);
        chat_listView.setItemAnimator(new DefaultItemAnimator());
        chat_listView.setAdapter(mAdapter);*/

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    private void init() {
        chatList=new ArrayList<>();
        chat_listView=(RecyclerView) findViewById(R.id.recycler);
    }
}