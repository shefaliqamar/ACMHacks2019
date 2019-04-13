package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Search extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        Log.d("katrin", "in search class");


        // Creates a button in Search view to click on Profile
        Button profile = findViewById(R.id.profile);
        profile.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d("katrin", "button is working");
                startActivity(new Intent(Search.this, Profile.class));
                finish();
            }
        });


        // Creates a button in Search view to click on Home
        Button home = findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(Search.this, Home.class));
                finish();
            }
        });
    }
}
