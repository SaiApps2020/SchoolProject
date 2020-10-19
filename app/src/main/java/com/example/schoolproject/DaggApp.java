package com.example.schoolproject;

import android.app.Application;

import com.example.schoolproject.DiComponent.AppComponent;
import com.example.schoolproject.DiComponent.DaggerAppComponent;
import com.example.schoolproject.Module.AppModule;
import com.example.schoolproject.Module.LoginModule;

public class DaggApp extends Application {
    private AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
      /*  component = Dagger.builder()
                .appModule(new AppModule(this))
                .loginModule(new LoginModule())
                .build();*/

   component= DaggerAppComponent.builder()
              .appModule(new AppModule(this))
              .loginModule(new LoginModule())
              .build();

    }


    public AppComponent getComponent() {
        return component;
    }
}
