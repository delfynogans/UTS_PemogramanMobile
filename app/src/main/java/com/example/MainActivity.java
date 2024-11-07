package com.example.coffeeshop_khilink;


import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.coffeeshop_khilink.R;
import com.example.coffeeshop_khilink.homeactivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inisialisasi tombol Get Started
        ImageView buttonGetStarted = findViewById(R.id.button_get_started);

        // Set OnClickListener untuk pindah ke SecondActivity
        buttonGetStarted.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, homeactivity.class);
            startActivity(intent);
        });
    }
}
