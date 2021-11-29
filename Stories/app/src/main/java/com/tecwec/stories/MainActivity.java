package com.tecwec.stories;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;
import xute.storyview.StoryModel;
import xute.storyview.StoryView;

public class MainActivity extends AppCompatActivity {

    StoryView storyView;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        storyView = findViewById(R.id.storyView);
        storyView.resetStoryVisits();

        ArrayList<StoryModel> StoriesList = new ArrayList<>();
        String image1="https://iso.500px.com/wp-content/uploads/2016/03/stock-photo-142984111.jpg";
        String image2="https://images.unsplash.com/photo-1610878180933-123728745d22?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8Y2FuYWRhJTIwbmF0dXJlfGVufDB8fDB8fA%3D%3D&w=1000&q=80";
        String image3="https://images.unsplash.com/photo-1471879832106-c7ab9e0cee23?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxleHBsb3JlLWZlZWR8Mnx8fGVufDB8fHx8&w=1000&q=80";
        StoriesList.add(new StoryModel(image1,"Status 1","Yesterday"));
        StoriesList.add(new StoryModel(image2,"Status 2","Today,2:15 PM"));
        StoriesList.add(new StoryModel(image3,"Satus 3","Today,11:31 PM"));
        storyView.setImageUris(StoriesList);
    }
}