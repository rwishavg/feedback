package com.example.feedback;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button = findViewById(R.id.button_teacher);
    Button button1 = findViewById(R.id.button_student);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openP2();
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openP5();
            }
        });
    }


    public void openP5() {
        Intent intent = new Intent(this, P5.class);
        startActivity(intent);
    }


    public void openP2() {
        Intent intent = new Intent(this, P2.class);
        startActivity(intent);
    }

}