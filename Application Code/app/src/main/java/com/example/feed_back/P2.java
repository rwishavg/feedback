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
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.proto.TargetGlobal;

import java.util.HashMap;
import java.util.Map;

public class P2 extends AppCompatActivity {

     Button button5;
    DocumentReference db =  FirebaseFirestore.getInstance().collection("teachers").document();
    private static final String TAG = P2.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p2);

        button5 = (Button) findViewById(R.id.p2_btn1);

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText mEdit;

                mEdit   = (EditText)findViewById(R.id.editText);
                String s1 = mEdit.getText().toString();

                EditText mEdit2;

                mEdit2   = (EditText)findViewById(R.id.editText2);
                String s2 = mEdit2.getText().toString();
                Map<String, Object> docData = new HashMap<String, Object>();
                docData.put("t_id", s1);
                docData.put("section",s2);

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

                openP3();
            }
        });
    }





    public void openP3() {
        Intent intent = new Intent(this, P3.class);
        startActivity(intent);
    }


}
