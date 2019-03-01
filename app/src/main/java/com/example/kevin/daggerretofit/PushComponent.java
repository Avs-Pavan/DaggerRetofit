package com.example.kevin.daggerretofit;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {PushModule.class,AppMOdule.class})
public interface PushComponent {

    void inject(MainActivity mainActivity);
}
