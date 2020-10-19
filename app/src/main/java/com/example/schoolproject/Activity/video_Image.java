package com.example.schoolproject.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TableRow;
import android.widget.VideoView;

import com.example.schoolproject.R;

public class video_Image extends AppCompatActivity {
   private VideoView videoView;
   private CardView studentResponse;
   private ImageView back,home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video__image);
        initViews();
        String vUrl="https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4";
        //String vUrl="http://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4";
       /* final MediaController mediacontroller = new MediaController(this);
        mediacontroller.setAnchorView(videoView);
        videoView.setMediaController(mediacontroller);
        videoView.setVideoURI(Uri.parse(vUrl));
        videoView.requestFocus();

        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setOnVideoSizeChangedListener(new MediaPlayer.OnVideoSizeChangedListener() {
                    @Override
                    public void onVideoSizeChanged(MediaPlayer mp, int width, int height) {
                        videoView.setMediaController(mediacontroller);
                        mediacontroller.setAnchorView(videoView);

                    }
                });
            }
        });*/


        Uri videoUri = Uri.parse(vUrl);
        videoView.setVideoURI(videoUri);
        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
               mp.start();
               mp.setOnVideoSizeChangedListener(new MediaPlayer.OnVideoSizeChangedListener() {
                   @Override
                   public void onVideoSizeChanged(MediaPlayer mp, int width, int height) {
                       mp.start();
                   }
               });
            }
        });

        studentResponse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                        Intent loginScreen=new Intent(video_Image.this,student_response.class);
                        startActivity(loginScreen);

            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginScreen=new Intent(video_Image.this, AssignmentDetails.class);
                startActivity(loginScreen);
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginScreen=new Intent(video_Image.this, Homepage.class);
                startActivity(loginScreen);
            }
        });



    }

    private void initViews() {
        videoView = (VideoView) findViewById(R.id.videoView);
        studentResponse = (CardView) findViewById(R.id.response);
        back=(ImageView) findViewById(R.id.backButton);
        home=(ImageView) findViewById(R.id.homeButton);



    }
}