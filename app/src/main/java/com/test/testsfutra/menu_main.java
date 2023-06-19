package com.test.testsfutra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menu_main extends AppCompatActivity {
    private Button kembali;
    private Button revolusi;
    private Button nasional;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_main);

        kembali= (Button) findViewById(R.id.kembali);
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openMainActivity();}
        });

        revolusi = (Button) findViewById(R.id.revolusi);
        revolusi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openpahlawanrevolusi(); }
        });

        nasional = (Button) findViewById(R.id.nasional);
        nasional.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openpahlawannasional(); }
        });
    }

    private void openMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    private void openpahlawanrevolusi(){
        Intent intent = new Intent(this, pahlawan_revolusi.class);
        startActivity(intent);
    }

    private void openpahlawannasional(){
        Intent intent = new Intent(this, pahlawan_nasional.class);
        startActivity(intent);
    }
}