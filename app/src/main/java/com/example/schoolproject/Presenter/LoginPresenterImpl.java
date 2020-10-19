package com.example.schoolproject.Presenter;

import android.content.Context;
import android.util.Log;

import androidx.annotation.Nullable;

import com.example.schoolproject.Activity.LoginActivity;
import com.example.schoolproject.Intractor.LoginIntractor;
import com.example.schoolproject.Model.LoginModel;

public class LoginPresenterImpl implements LoginIntractor.presenter,LoginIntractor.model.onFinishedListener {
    private String TAG = getClass().getName();
    @Nullable
    private LoginIntractor.loginView view;
    private LoginIntractor.model model;
    private LoginModel modelLogin;

    public LoginPresenterImpl(LoginIntractor.loginView view,LoginIntractor.model model) {
        this.model = model;
        this.view=view;
    }



    @Override
    public void createUser(LoginActivity loginActivity) {
        Log.e(TAG, "CreateUser");
       /* model.getLoginDetails(loginActivity);
        modelLogin=new LoginModel();
        String status=modelLogin.getStatus();
        Log.e(TAG, status);*/

       model.getLoginDetails(loginActivity,this);
    }


    @Override
    public void onFinish(String status) {

        view.OnComplete(status);
    }

    @Override
    public void onFailure(String message) {

    }

    @Override
    public void onComplete() {

    }
}
