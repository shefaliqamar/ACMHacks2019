package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Github extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_github);
        TextView text = (TextView) findViewById(R.id.gitlink);
        text.setMovementMethod(LinkMovementMethod.getInstance());

        Button resources = findViewById(R.id.resources);
        resources.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(Github.this, Resources.class));
                finish();
            }
        });
    }

}
