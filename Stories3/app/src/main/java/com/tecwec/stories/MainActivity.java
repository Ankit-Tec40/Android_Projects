package com.tecwec.stories;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import xute.storyview.StoryModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView=findViewById(R.id.recyclerViewID);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));


        ArrayList<StoryModel> StoriesList1 = new ArrayList<>();
        String image1="https://iso.500px.com/wp-content/uploads/2016/03/stock-photo-142984111.jpg";
        String image2="https://images.unsplash.com/photo-1610878180933-123728745d22?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8Y2FuYWRhJTIwbmF0dXJlfGVufDB8fDB8fA%3D%3D&w=1000&q=80";
        String image3="https://img-asset-01.visitbali.id/lg5AgjkreMofeVd647BKcRt7_PfijI6_qdZimkNDJ1c/fill/650/450/no/0/aHR0cHM6Ly92aXNpdGJhbGkuaWQvaW1hZ2VzL2RhdGEvMjAyMC9BcHIvMjEvNWU5ZWQxYTc1NWM1NTQ4YWIuanBn.jpg";
        StoriesList1.add(new StoryModel(image1,"Status 1","Yesterday"));
        StoriesList1.add(new StoryModel(image2,"Status 2","Today,2:15 PM"));
        StoriesList1.add(new StoryModel(image3,"Satus 3","Today,11:31 PM"));

        ArrayList<StoryModel> StoriesList2 = new ArrayList<>();
        String image4="https://cdn-prod.medicalnewstoday.com/content/images/articles/325/325466/man-walking-dog.jpg";
        String image5="https://www.mia-online.org/wp-content/uploads/2019/12/images3359-5df990568df23.jpg";
        String image6="https://cdn.theculturetrip.com/wp-content/uploads/2017/05/man-in-nature-1024x678.jpeg";
        StoriesList2.add(new StoryModel(image4,"Status 1","Yesterday"));
        StoriesList2.add(new StoryModel(image5,"Status 2","Today,1:15 PM"));
        StoriesList2.add(new StoryModel(image6,"Satus 3","Today,1:31 PM"));

        ArrayList<StoryModel> StoriesList3 = new ArrayList<>();
        String image7="https://natureandhealth.uw.edu/wp-content/uploads/sites/28/2019/12/alberto-casetta-REKXJ7JhwiI-unsplash-1024x768.jpg";
        String image8="https://fa-cms-staging.s3.amazonaws.com/media/original_images/6-tips-to-get-your-kids-to-love-nature_gETnBEz.jpg";
        String image9="https://montessorirocks.org/wp-content/uploads/2017/02/Nature-loving-kids-featured.jpg";
        StoriesList3.add(new StoryModel(image7,"Status 1","Yesterday"));
        StoriesList3.add(new StoryModel(image8,"Status 2","Today,6:15 PM"));
        StoriesList3.add(new StoryModel(image9,"Satus 3","Today,11:21 PM"));

        ArrayList<StoryModel> StoriesList4 = new ArrayList<>();
        String image10="https://natureandhealth.uw.edu/wp-content/uploads/sites/28/2019/12/shutterstock_576159088_adj-1024x909.jpg";
        String image11="https://images.pexels.com/photos/3788363/pexels-photo-3788363.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500";
        String image12="https://www.travelanddestinations.com/wp-content/uploads/2020/01/Backpacker-on-top-of-a-mountain.jpg";
        StoriesList4.add(new StoryModel(image10,"Status 1","Yesterday"));
        StoriesList4.add(new StoryModel(image11,"Status 2","Today,5:15 PM"));
        StoriesList4.add(new StoryModel(image12,"Satus 3","Today,8:31 PM"));

        ArrayList<StoryModel> StoriesList5 = new ArrayList<>();
        String image13="https://www.wwf.org.uk/sites/default/files/styles/social_share_image/public/2020-04/Learn_To_Love_Nature_Jungles_Theme.jpg?itok=gy-OmNSk";
        String image14="https://www.telenor.no/binaries/privat/artikler/underholdning/aktuelt/film-serier/love-nature-ny-kanal/love%20nature%20orangutan.png";
        String image15="https://bloximages.newyork1.vip.townnews.com/lancasteronline.com/content/tncms/assets/v3/editorial/9/5e/95e89d8c-e0e8-11eb-8b3e-cb66fe4997f7/60e89de7ad745.image.jpg?crop=1769,995,0,87&resize=1120,630&order=crop,resize";
        StoriesList5.add(new StoryModel(image13,"Status 1","Yesterday"));
        StoriesList5.add(new StoryModel(image14,"Status 2","Today,3:10 PM"));
        StoriesList5.add(new StoryModel(image15,"Satus 3","Today,9:43 PM"));



        StoriesData[] storiesData=new StoriesData[]{
                new StoriesData("Your Story",StoriesList1),
                new StoriesData("User1",StoriesList2),
                new StoriesData("User2",StoriesList3),
                new StoriesData("User3",StoriesList4),
                new StoriesData("User4",StoriesList5)



        };


        StoriesAdapter storiesAdapter= new StoriesAdapter(storiesData,MainActivity.this);
        recyclerView.setAdapter(storiesAdapter);


    }
}