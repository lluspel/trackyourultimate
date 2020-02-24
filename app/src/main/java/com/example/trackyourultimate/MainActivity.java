package com.example.trackyourultimate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void players(View view) {
        startActivity(new Intent(MainActivity.this, PlayersActivity.class));
    }

    public void tourneys(View view) {
        startActivity(new Intent(MainActivity.this, TourneysActivity.class));
    }
}
