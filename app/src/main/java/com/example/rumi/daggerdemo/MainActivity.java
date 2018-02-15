package com.example.rumi.daggerdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button button;


//    User user= new User("aa","a");
    @Inject
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.txtview);
        button=findViewById(R.id.submitButton);

        AppComponent daggerAppComponent=DaggerAppComponent.builder().build();
        daggerAppComponent.inject(this);
        textView.setText(user.getLocation());

        Log.v("TAG", "onCreate: "+user.getName() );
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this, SubActivity.class);
                startActivity(intent);
            }
        });
    }
}
