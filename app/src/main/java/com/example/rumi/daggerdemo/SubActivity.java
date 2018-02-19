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
    TextView subTextView,subTextView1;

    @Inject
    User user1;
    @Inject
    User2 user2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        subTextView=findViewById(R.id.subTextView);
        subTextView1=findViewById(R.id.subTextView2);

        AppComponent daggerAppComponent1=DaggerAppComponent.builder().build();
        daggerAppComponent1.inject(this);
        subTextView.setText(user1.getName());
        subTextView1.setText(user2.getAddress());
        Log.v("TAG", "onCreate: "+user1.getLocation() );
    }
}
