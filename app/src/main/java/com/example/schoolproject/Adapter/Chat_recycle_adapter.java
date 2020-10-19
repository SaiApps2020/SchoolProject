package com.example.schoolproject.Adapter;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.schoolproject.Activity.Assignment;
import com.example.schoolproject.Activity.Chat;
import com.example.schoolproject.Activity.ChatActivity;
import com.example.schoolproject.Model.Video_Image_model;
import com.example.schoolproject.R;
import com.example.schoolproject.full_video_view;

import java.util.ArrayList;

public class Chat_recycle_adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private ArrayList<String> student_msg_body;
    private Context context;
    public Chat_recycle_adapter(ArrayList<String> chatList, ChatActivity chatActivity) {
      this.context=chatActivity;
       this.student_msg_body=chatList;
    }

    public static class TextTypeViewHolder extends RecyclerView.ViewHolder {

        public TextView title;
        public ImageButton editzz, delete;

        public TextTypeViewHolder(View itemview) {
            super(itemview);
            title = (TextView) itemview.findViewById(R.id.student_msg_body);
            /*title = (TextView) itemview.findViewById(R.id.txt);
            editzz = (ImageButton) itemview.findViewById(R.id.editOpt);
            delete = (ImageButton) itemview.findViewById(R.id.deleteOpt);*/
            //genre = (TextView) view.findViewById(R.id.genre);
        }
    }

    public static class VideoTypeViewHolder extends RecyclerView.ViewHolder {

        public TextView title;
        public VideoView videoView;

        public VideoTypeViewHolder(View itemview) {
            super(itemview);
            title = (TextView) itemview.findViewById(R.id.student);
            videoView = (VideoView) itemview.findViewById(R.id.videoView);
            /*title = (TextView) itemview.findViewById(R.id.txt);
            editzz = (ImageButton) itemview.findViewById(R.id.editOpt);
            delete = (ImageButton) itemview.findViewById(R.id.deleteOpt);*/
            //genre = (TextView) view.findViewById(R.id.genre);
        }
    }

    public static class TeacherViewHolder extends RecyclerView.ViewHolder {

        public TextView title;

        public TeacherViewHolder(View itemview) {
            super(itemview);
            title = (TextView) itemview.findViewById(R.id.teacher_msg_body);
            /*title = (TextView) itemview.findViewById(R.id.txt);
            editzz = (ImageButton) itemview.findViewById(R.id.editOpt);
            delete = (ImageButton) itemview.findViewById(R.id.deleteOpt);*/
            //genre = (TextView) view.findViewById(R.id.genre);
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        switch (viewType) {
            case Video_Image_model.TEXT_TYPE:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.chat_recycler_item, parent, false);
                return new TextTypeViewHolder(view);
            case Video_Image_model.VIDEO_TYPE:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.chat_recycler_item_video, parent, false);
                return new VideoTypeViewHolder(view);
            case Video_Image_model.TEACHER_TYPE:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.chat_recycler_item_teacher, parent, false);
                return new TeacherViewHolder(view);
        }
        return null;

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {


       if (student_msg_body.get(position).contains("mp4")) {
           //((VideoTypeViewHolder) holder).title.setText(student_msg_body.get(position));
           String url = student_msg_body.get(position);
           Uri videoUri = Uri.parse(url);
           final MediaController mediacontroller = new MediaController(context);
           mediacontroller.setAnchorView( ((VideoTypeViewHolder) holder).videoView);
           ((VideoTypeViewHolder) holder).videoView.setMediaController(mediacontroller);
           ((VideoTypeViewHolder) holder).videoView.setVideoURI(videoUri);
           ((VideoTypeViewHolder) holder).videoView.requestFocus();
           ((VideoTypeViewHolder) holder).videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
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

           ((VideoTypeViewHolder) holder).videoView.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   Intent loginScreen=new Intent(context,full_video_view.class);
                   loginScreen.putExtra("URL",student_msg_body.get(position));
                   context.startActivity(loginScreen);

               }
           });

       }else  if(student_msg_body.get(position).contains("teacher")) {
           ((TeacherViewHolder) holder).title.setText(student_msg_body.get(position));
        }else {

           ((TextTypeViewHolder) holder).title.setText(student_msg_body.get(position));
       }
    }

    /*@Override
    public void onBindViewHolder(@NonNull Chat_recycle_adapter.viewHolder holder, int position) {
   holder.title.setText(student_msg_body.get(position));
    }*/

    @Override
    public int getItemCount()
    {
        return student_msg_body.size();
    }

    @Override
    public int getItemViewType(int position) {
        if (student_msg_body.get(position).contains("mp4")) {
            return Video_Image_model.VIDEO_TYPE;
        } else if (student_msg_body.get(position).contains("teacher")) {
            return Video_Image_model.TEACHER_TYPE;
        }else {
            return Video_Image_model.TEXT_TYPE;
        }
    }

    /*public class viewHolder extends RecyclerView.ViewHolder {
        public TextView title;
        public ImageButton editzz, delete;

        public viewHolder(View itemview) {
            super(itemview);
            title = (TextView) itemview.findViewById(R.id.student_msg_body);
            *//*title = (TextView) itemview.findViewById(R.id.txt);
            editzz = (ImageButton) itemview.findViewById(R.id.editOpt);
            delete = (ImageButton) itemview.findViewById(R.id.deleteOpt);*//*
            //genre = (TextView) view.findViewById(R.id.genre);
        }
    }*/
}
