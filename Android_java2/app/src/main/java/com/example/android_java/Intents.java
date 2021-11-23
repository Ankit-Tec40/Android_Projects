package com.example.android_java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Intents extends AppCompatActivity {
    Button btn;
    String txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intents);

        btn=findViewById(R.id.btm_intent);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                change();

            }
        });

        }
    public void change() {
        //Implict intent
//        Intent intent = new Intent(this, Intent2.class);
//        startActivity(intent);

        //Explict Intent
        txt=btn.getText().toString();
        Intent intent = new Intent(this, Intent2.class);
        intent.putExtra("nameData",txt);
        startActivity(intent);



    }
}