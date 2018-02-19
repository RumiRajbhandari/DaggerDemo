package com.example.rumi.daggerdemo;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by aakash on 2/19/18.
 */
@Module
public class UserModule2 {
    @Provides
    @Singleton
    public User2 getUser2(){
        return new User2("5","Iceland");
    }
}
