package com.tecwec.cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView=findViewById(R.id.recyclerViewID);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        MyMovieData[] myMovieData=new MyMovieData[]{
                new MyMovieData("Avengers",R.drawable.movie_image1),
                new MyMovieData("Avengers2",R.drawable.movie_image1),
                new MyMovieData("Avengers3",R.drawable.movie_image1),
                new MyMovieData("Avengers4",R.drawable.movie_image1),


        };

        MyMovieAdapter myMovieAdapter= new MyMovieAdapter(myMovieData,MainActivity.this);
        recyclerView.setAdapter(myMovieAdapter);



    }
}