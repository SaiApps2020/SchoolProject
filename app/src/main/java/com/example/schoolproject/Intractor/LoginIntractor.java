package com.example.schoolproject.Intractor;

import android.content.Context;

import com.example.schoolproject.Activity.LoginActivity;

public class LoginIntractor {

    public interface loginView {
        void showProgress();

        void hideProgress();

        void OnComplete(String success);

        void errorResponse(String error);
    }

    public interface presenter {

        void createUser(LoginActivity loginActivity);
    }

    public interface model {
        interface onFinishedListener{
            void onFinish(String status);
            void onFailure(String message);
            void onComplete();
        }
        void getLoginDetails(Context context,onFinishedListener listener);
    }
}
