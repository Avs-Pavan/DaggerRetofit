package com.example.kevin.daggerretofit;

import android.app.Application;

public class MyApplication extends Application {


  private   PushComponent pushComponent;
    @Override
    public void onCreate() {
        super.onCreate();
    this.pushComponent= DaggerPushComponent.builder().build();

    }

  public PushComponent getPushComponent() {
    return pushComponent;
  }

}
