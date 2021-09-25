package com.example.aboba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    Integer counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void incrementBtn(View view) {
        TextView text1 = findViewById(R.id.text1);
        counter++;
        text1.setText(counter.toString());
    }
    public void decrementBtn(View view) {
        TextView text1 = findViewById(R.id.text1);
        counter--;
        text1.setText(counter.toString());
    }
}
