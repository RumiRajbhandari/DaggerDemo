package com.example.rumi.daggerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppComponent daggerAppComponent=DaggerAppComponent.builder().build();
        daggerAppComponent.inject(this);

        Log.e("TAG", "onCreate: "+user );
    }
}