package com.example.schoolproject.Model;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.ArrayList;
import java.util.List;

public class Chat_viewModel extends AndroidViewModel {
    public String TAG=getClass().getSimpleName();
    public LiveData<ArrayList<String>> chatList;



    public Chat_viewModel(@NonNull Application application) {
        super(application);


    }
}
