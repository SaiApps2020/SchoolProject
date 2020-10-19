package com.example.schoolproject.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.schoolproject.DaggApp;
import com.example.schoolproject.Intractor.LoginIntractor;
import com.example.schoolproject.R;
import com.google.android.material.button.MaterialButtonToggleGroup;

import javax.inject.Inject;

public class LoginActivity extends AppCompatActivity implements LoginIntractor.loginView {
    private MaterialButtonToggleGroup toggleGroup;
    private Button login;
    private String TAG = getClass().getName();
    @Inject
    LoginIntractor.presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginscreen);
        initViews();
      //  ((DaggApp) getApplication()).getComponent().inject(this);
        login.setOnClickListener(clickListener);

    }

    private void initViews() {
        login = (Button) findViewById(R.id.login);

    }

    public View.OnClickListener clickListener = new View.OnClickListener() {


        @Override
        public void onClick(View v) {
            int id = v.getId();
            switch (id) {

                case R.id.login:
                    Intent loginScreen = new Intent(LoginActivity.this, Homepage.class);
                    startActivity(loginScreen);
                    Log.i(TAG, "click");
//                    presenter.createUser(LoginActivity.this);
                    break;
            }
        }
    };

    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void OnComplete(String success) {
     Log.e(TAG,success);
    }

    @Override
    public void errorResponse(String error) {

    }
}