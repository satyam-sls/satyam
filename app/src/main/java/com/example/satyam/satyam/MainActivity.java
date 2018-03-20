package com.example.satyam.satyam;

import android.app.Activity;
import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirebaseDatabase data=FirebaseDatabase.getInstance();
        DatabaseReference myref=data.getReference("mymessage");

        myref.setValue("hello there");
    }
}
