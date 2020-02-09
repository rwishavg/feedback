package com.example.feed_back;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FieldValue;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class P3 extends AppCompatActivity {

    private Button button8;
    private Button button7;
    DocumentReference db =  FirebaseFirestore.getInstance().collection("sections").document("sec").collection("faculty").document();
    private static final String TAG = P3.class.getSimpleName();

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
       String s3 =  mEdit3.getText().toString();

        EditText mEdit4;

        mEdit4   = (EditText)findViewById(R.id.editText4);
       String s4 = mEdit4.getText().toString();

        Map<String, Object> docData = new HashMap<String, Object>();
        docData.put("subject", s3);
        docData.put("name",s4);

        db
                .set(docData)
                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        Log.d(TAG, "DocumentSnapshot successfully written!");
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Log.w(TAG, "Error writing document", e);
                    }
                });


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



