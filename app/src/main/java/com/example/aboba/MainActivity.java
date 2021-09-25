package com.example.aboba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
<<<<<<< Updated upstream

=======
import android.widget.Button;
>>>>>>> Stashed changes

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
<<<<<<< Updated upstream
    public void sendMessage(View view) {
        Button button = findViewById(R.id.btn1);
        counter++;
        button.setText(counter.toString());
=======
    private void switchActivities() {
        Intent switchActivityIntent = new Intent(this, SecondActivity.class);
        startActivity(switchActivityIntent);
>>>>>>> Stashed changes
    }
}
