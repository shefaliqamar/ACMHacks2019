package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Devpost extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_devpost);

        Button resources = findViewById(R.id.resources);
        resources.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(Devpost.this, Resources.class));
                finish();
            }
        });
    }
}
