package com.example.rumi.daggerdemo;

import dagger.Component;

/**
 * Created by rumi on 2/14/18.
 */
@Component(modules = {UserModule.class})
public interface AppComponent {
    void inject(MainActivity mainActivity);

}
