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



    }
}
