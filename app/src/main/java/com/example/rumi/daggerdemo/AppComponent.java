package com.example.rumi.daggerdemo;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by rumi on 2/14/18.
 */
@Component(modules = {UserModule.class,UserModule2.class})
@Singleton
public interface AppComponent {
    void inject(MainActivity mainActivity);
    void inject(SubActivity subActivity);

}
