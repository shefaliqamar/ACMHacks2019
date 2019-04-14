package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Log.d("katrin", "inside profile.java");

        Button friends = findViewById(R.id.friends);
        friends.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d("katrin", "friends button pressed from profile class");
                startActivity(new Intent(Profile.this, Friends.class));
                finish();
            }
        });


        Button hackathons = findViewById(R.id.hackathons);
        hackathons.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Profile.this, Hackathons.class));
                finish();
            }
        });

    }
}
