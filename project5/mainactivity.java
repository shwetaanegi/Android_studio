package com.example.menu;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.opt1) {
            Toast.makeText(this, "Option 1 clicked", Toast.LENGTH_SHORT).show();
            return true;

        } else if (id == R.id.opt2) {
            Toast.makeText(this, "Option 2 clicked", Toast.LENGTH_SHORT).show();
            return true;

        } else if (id == R.id.opt3) {
            Toast.makeText(this, "Option 3 clicked", Toast.LENGTH_SHORT).show();
            return true;
        } else
            return super.onOptionsItemSelected(item);
    }
}
