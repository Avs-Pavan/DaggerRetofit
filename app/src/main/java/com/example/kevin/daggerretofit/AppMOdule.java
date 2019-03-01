package com.example.kevin.daggerretofit;


import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppMOdule {


    private Application myApplication;

    AppMOdule(Application application){
        this.myApplication=application;
    }

    @Provides
    @Singleton
    Application provideApplication(){
        return this.myApplication;
    }


}
