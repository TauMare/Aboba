package com.example.aboba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    Integer counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendMessage(View view) {
        Button button = findViewById(R.id.btn1);
        counter++;
        button.setText(counter.toString());
    }
}
