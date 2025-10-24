package com.example.androiduitesting;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ShowActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        Intent showCityIntent = getIntent();

        String cityName = showCityIntent.getStringExtra("city");
        TextView cityTextView = findViewById(R.id.cityName);
        cityTextView.setText(cityName);

        Button back = findViewById(R.id.backButton);
        back.setOnClickListener(v -> finish());
    }
}