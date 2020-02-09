package com.example.feed_back;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

        private Button button;
        private Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.TeacherLogin);
        button1 = (Button) findViewById(R.id.StudentLogin);

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

    public void openP2() {
        Intent intent = new Intent(this, P2.class);
        startActivity(intent);
    }

    public void openP5() {
        Intent intent = new Intent(this, P5.class);
        startActivity(intent);
    }


}

