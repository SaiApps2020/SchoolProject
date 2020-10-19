package com.example.schoolproject.Model;

public class Video_Image_model {

    public static final int TEXT_TYPE=0;
    public static final int IMAGE_TYPE=1;
    public static final int VIDEO_TYPE=2;
    public static final int TEACHER_TYPE=3;

    public int type;
    public int data;
    public String text;



    public Video_Image_model(int type, String text, int data)
    {
        this.type=type;
        this.data=data;
        this.text=text;

    }
}
