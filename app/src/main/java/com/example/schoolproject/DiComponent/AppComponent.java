package com.example.schoolproject.DiComponent;

import com.example.schoolproject.Activity.LoginActivity;
import com.example.schoolproject.Module.AppModule;
import com.example.schoolproject.Module.LoginModule;

import dagger.Component;

@Component(modules = {AppModule.class, LoginModule.class})
public interface AppComponent {

    void inject(LoginActivity loginActivity);
}
