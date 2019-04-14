package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Friends extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends);
        Log.d("katrin", "in friends class");


        // Creates a button in Search view to click on Profile
        Button profile = findViewById(R.id.profile);
        profile.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d("katrin", "button is working");
                startActivity(new Intent(Friends.this, Profile.class));
                finish();
            }
        });

        /*
        // Creates a button in Search view to click on Home
        Button home = findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(Friends.this, Hackathons.class));
                finish();
            }
        });
        */
    }
}
