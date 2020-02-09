package com.example.feed_back;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class P2 extends AppCompatActivity {

    private Button button5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p2);

        button5 = (Button) findViewById(R.id.p2_btn1);

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openP3();
            }
        });

        EditText mEdit;

        mEdit   = (EditText)findViewById(R.id.editText);
        mEdit.getText().toString();

        EditText mEdit2;

        mEdit2   = (EditText)findViewById(R.id.editText2);
        mEdit2.getText().toString();
    }





    public void openP3() {
        Intent intent = new Intent(this, P3.class);
        startActivity(intent);
    }
}
