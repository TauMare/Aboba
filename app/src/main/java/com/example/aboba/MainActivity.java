package com.example.aboba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Button switchToSecondActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        switchToSecondActivity = findViewById(R.id.button2);
        switchToSecondActivity.setText("Чичас вы на первой активити");
        switchToSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchActivities();
            }
        });
    }

    private void switchActivities() {
        Intent switchActivityIntent = new Intent(this, SecondActivity.class);
        startActivity(switchActivityIntent);

    }
}
