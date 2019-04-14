package com.example.myapplication;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Hackathons extends AppCompatActivity {
    TextView texx;
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


        texx = (TextView) findViewById(R.id.scrapeBox1);
        Button but = (Button) findViewById(R.id.scrapeButton);

        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new doit().execute();
            }
        });
    }

    public class doit extends AsyncTask<Void,Void,Void> {
        String words;
        @Override
        protected Void doInBackground(Void...params) {
            try {
                Document doc = Jsoup.connect("https://mlh.io/seasons/na-2019/events").get();
                words = doc.text();


            } catch(Exception e){e.printStackTrace();}

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            texx.setText(words);
        }
    }
}
