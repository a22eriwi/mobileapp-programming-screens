package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Intent Bertil;
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bertil = new Intent(MainActivity.this, SecondActivity.class);
                Bertil.putExtra("name", "Herberta"); // Optional
                Bertil.putExtra("number", 55); // Optional
                startActivity(Bertil);
            }
        });
    }

}
