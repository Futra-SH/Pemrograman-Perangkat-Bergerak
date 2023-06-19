package com.test.testsfutra;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ToggleButton;

public class Activity2 extends AppCompatActivity {
    private Button ayo_main;
    private Button caramain;
    private Button daftarpahlawan;

    MediaPlayer audio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        audio = MediaPlayer.create(this, R.raw.lagu);
        audio.setLooping(true);
        audio.setVolume(1,1);
        audio.start();

        ayo_main = (Button) findViewById(R.id.ayo_main);
        ayo_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openmenu_main(); }
        });

        caramain = (Button) findViewById(R.id.cara_main);
        caramain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { opencaramain(); }
        });

        daftarpahlawan = (Button) findViewById(R.id.daftarpahlawan);
        daftarpahlawan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { opendaftarpahlawan(); }
        });


    }

    public void onToggleClicked(View view){
        boolean on = ((ToggleButton) view).isChecked();
        if (on){
            audio.setVolume(0,0);
        }
        else {
            audio.setVolume(1,1);
        }
    }

    public void onBackPressed(){
        audio.stop();
        Activity2.this.finish();
    }

    private void openmenu_main(){
        Intent intent = new Intent(this, menu_main.class);
        startActivity(intent);
    }

    private void opencaramain(){
        Intent intent = new Intent(this, caramain.class);
        startActivity(intent);
    }

    private void opendaftarpahlawan(){
        Intent intent = new Intent(this, daftarpahlawan.class);
        startActivity(intent);
    }
}