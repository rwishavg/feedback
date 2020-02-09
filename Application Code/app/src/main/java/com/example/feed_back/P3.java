package com.example.feed_back;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class P3 extends AppCompatActivity {


    private Button button8;
    private Button button7;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p3);
        button8 = (Button) findViewById(R.id.teacher_continue);
        button7 = (Button) findViewById(R.id.teacher_check);

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openP3();
            }
        });

        EditText mEdit3;

        mEdit3   = (EditText)findViewById(R.id.editText3);
        mEdit3.getText().toString();

        EditText mEdit4;

        mEdit4   = (EditText)findViewById(R.id.editText4);
        mEdit4.getText().toString();

    }
    public void openMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void openP3() {
        Intent intent = new Intent(this, P3.class);
        startActivity(intent);
    }




}



