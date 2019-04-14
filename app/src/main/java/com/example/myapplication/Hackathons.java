package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Hackathons extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hackathons);

        // Button between Hackathons and Profiles
        Button profile = findViewById(R.id.profile);
        profile.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d("katrin", "pressed search button from home");
                startActivity(new Intent(Hackathons.this, Profile.class));
                finish();
            }
        });

        // Button between Hackathons and Friends
        Button friends = findViewById(R.id.friends);
        friends.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(Hackathons.this, Friends.class));
                finish();
            }
        });

        // Button between Hackathons and Resources
        Button resources = findViewById(R.id.resources);
        friends.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Log.d("katrin", "pressed resources button");
                startActivity(new Intent(Hackathons.this, Resources.class));
                Log.d("katrin", "after startactivity");
                finish();
            }
        });


    }
}
