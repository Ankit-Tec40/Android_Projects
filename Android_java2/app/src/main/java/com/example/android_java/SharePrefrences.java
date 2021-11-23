package com.example.android_java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SharePrefrences extends AppCompatActivity {
    EditText writeName;
    TextView readname;
    Button saveName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share_prefrences);

        writeName=findViewById(R.id.write);
        readname=findViewById(R.id.read);
        saveName=findViewById(R.id.set);

        saveName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=writeName.getText().toString();
                readname.setText(name);

        //write
                SharedPreferences shrd=getSharedPreferences("data",MODE_PRIVATE);
                SharedPreferences.Editor editor=shrd.edit();
                editor.putString("name",name);
                editor.apply();

            }
        });

        //read
        SharedPreferences getShared=getSharedPreferences("data",MODE_PRIVATE);
        String val=getShared.getString("name","Empty");
        readname.setText(val);


    }
}