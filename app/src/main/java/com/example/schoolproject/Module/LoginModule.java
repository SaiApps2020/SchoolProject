package com.example.schoolproject.Module;

import android.util.Log;

import com.example.schoolproject.Intractor.LoginIntractor;
import com.example.schoolproject.Presenter.LoginPresenterImpl;

import dagger.Module;
import dagger.Provides;

@Module
public class LoginModule {

    private LoginIntractor.loginView view;
    private LoginIntractor.model model;

  /*  public LoginModule(LoginIntractor.loginView view) {
        this.view=view;
    }*/
    @Provides
    public LoginIntractor.loginView provideView(){
        return view;
    }

    @Provides
    public LoginIntractor.model provideModel(){
        return model;
    }

    @Provides
    public LoginIntractor.presenter providePresenter(LoginIntractor.loginView viewCallback,LoginIntractor.model model) {
        return new LoginPresenterImpl(viewCallback,model);
    }


}
