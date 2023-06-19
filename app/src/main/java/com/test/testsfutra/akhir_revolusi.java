package com.test.testsfutra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class akhir_revolusi extends AppCompatActivity {
    private Button ulangi;
    private Button kembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akhir_revolusi);

        ulangi = (Button) findViewById(R.id.ulangi);
        ulangi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openpahlawan_revolusi(); }
        });

        kembali = (Button) findViewById(R.id.kembali);
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openActivity_2(); }
        });
    }

    private void openpahlawan_revolusi(){
        Intent intent = new Intent(this, pahlawan_revolusi.class);
        startActivity(intent);
    }

    private void openActivity_2(){
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }
}