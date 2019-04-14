package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Resources extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resources);
        Log.d("katrin", "in resources");

        // Button between Resources and Profile
        Button profile = findViewById(R.id.profile);
        profile.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(Resources.this, Profile.class));
                finish();
            }
        });

        // Button between Resources and Friends
        Button friends = findViewById(R.id.friends);
        friends.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(Resources.this, Friends.class));
                finish();
            }
        });

        // Button between Resources and Hackathons
        Button hackathons = findViewById(R.id.hackathons);
        hackathons.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(Resources.this, Hackathons.class));
                finish();
            }
        });

        Button github = findViewById(R.id.github);
        github.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(Resources.this, Github.class));
                finish();
            }
        });

        Button devpost = findViewById(R.id.devpost);
        devpost.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(Resources.this, Devpost.class));
                finish();
            }
        });

        Button slack = findViewById(R.id.slack);
        slack.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(Resources.this, Slack.class));
                finish();
            }
        });
    }
}
