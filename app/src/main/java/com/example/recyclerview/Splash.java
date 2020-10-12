package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        MediaPlayer md = new MediaPlayer();
        md = MediaPlayer.create(this,R.raw.dna);
        final MediaPlayer finalMd = md;
        Thread background = new Thread() {
            public void run() {
                try {

                    finalMd.start();
                    // Thread will sleep for 5 seconds
                    sleep(5*1000);
                    finalMd.stop();
                    // After 5 seconds redirect to another intent
                    Intent i=new Intent(getBaseContext(),RecipeListActivity.class);
                    startActivity(i);

                    //Remove activity
                    finish();
                } catch (Exception e) {
                }
            }
        };
        // start thread
        background.start();
    }
}