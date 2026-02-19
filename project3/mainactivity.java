package com.example.gridgame;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gridgame.R;

public class MainActivity extends AppCompatActivity {

    Button btnRed, btnBlue, btnGreen, btnYellow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRed = findViewById(R.id.btnRed);
        btnBlue = findViewById(R.id.btnBlue);
        btnGreen = findViewById(R.id.btnGreen);
        btnYellow = findViewById(R.id.btnYellow);

        btnRed.setOnClickListener(v ->
                Toast.makeText(MainActivity.this, "Red Button Clicked", Toast.LENGTH_SHORT).show()
        );

        btnBlue.setOnClickListener(v ->
                Toast.makeText(MainActivity.this, "Blue Button Clicked", Toast.LENGTH_SHORT).show()
        );

        btnGreen.setOnClickListener(v ->
                Toast.makeText(MainActivity.this, "Green Button Clicked", Toast.LENGTH_SHORT).show()
        );

        btnYellow.setOnClickListener(v ->
                Toast.makeText(MainActivity.this, "Yellow Button Clicked", Toast.LENGTH_SHORT).show()
        );
    }
}
