package com.example.android_java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Intent2 extends AppCompatActivity {
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent2);

        text=findViewById(R.id.name);
        Intent intent=getIntent();
        String name=intent.getStringExtra("nameData");
        text.setText("My name is "+name);


    }
}