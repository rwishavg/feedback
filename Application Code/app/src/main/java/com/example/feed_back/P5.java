package com.example.feed_back;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

public class P5 extends AppCompatActivity {

    private Button button9 ;
    DocumentReference db =  FirebaseFirestore.getInstance().collection("students").document();
    private static final String TAG = P5.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p5);

        button9 = (Button) findViewById(R.id.btn_feed);


        button9.setOnClickListener(new View.OnClickListener() {
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
