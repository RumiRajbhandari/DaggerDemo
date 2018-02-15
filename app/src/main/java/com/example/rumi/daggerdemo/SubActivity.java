package com.example.rumi.daggerdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import javax.inject.Inject;

/**
 * Created by aakash on 2/15/18.
 */

public class SubActivity extends AppCompatActivity{
    TextView subTextView;

    @Inject
    User user1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        subTextView=findViewById(R.id.subTextView);

        AppComponent daggerAppComponent1=DaggerAppComponent.builder().build();
        daggerAppComponent1.inject(this);
        subTextView.setText(user1.getName());
        Log.v("TAG", "onCreate: "+user1.getLocation() );
    }
}
