package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btn;
    EditText et;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // findViewById
        btn = findViewById(R.id.btn1);
        et = findViewById(R.id.et1);
        tv = findViewById(R.id.tv1);

        // setOnClickListener
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // EditText se text lena
                String text = et.getText().toString();

                // TextView me set karna
                tv.setText(text);

                // Toast show karna
                Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
