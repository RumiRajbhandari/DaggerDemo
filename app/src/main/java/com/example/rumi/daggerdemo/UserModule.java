package com.example.rumi.daggerdemo;

import dagger.Module;
import dagger.Provides;

/**
 * Created by rumi on 2/14/18.
 */
@Module
public class UserModule {
    @Provides
    public User getUser(){
        return new User("rumi","ktm");
    }
}
