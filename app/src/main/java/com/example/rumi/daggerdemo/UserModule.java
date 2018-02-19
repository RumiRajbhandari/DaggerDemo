package com.example.rumi.daggerdemo;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by rumi on 2/14/18.
 */
@Module
public class UserModule {
    @Singleton
    @Provides
    public User getUser1(){
        return new User("gerrard","anfield");
    }
//    @Provides
//    public User2 getUser2(){
//        return new User2("1","maharajgunj");
//    }
}
