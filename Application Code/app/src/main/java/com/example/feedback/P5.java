package com.example.feedback;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class P5 extends AppCompatActivity {

    Button button5 = findViewById(R.id.button_feed);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p5);

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openP6();
            }
        });
    }

    public void openP6() {
        Intent intent = new Intent(this, P6.class);
        startActivity(intent);
    }

}
