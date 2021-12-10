package com.tecwec.stories;

import java.util.ArrayList;

import xute.storyview.StoryModel;

public class StoriesData {
    private String userName;
    private ArrayList<StoryModel> storyimage = new ArrayList<>();

    public StoriesData(String userName, ArrayList<StoryModel> storyimage) {
        this.userName = userName;
        this.storyimage = storyimage;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ArrayList<StoryModel> getStoryimage() {
        return storyimage;
    }

    public void setStoryimage(ArrayList<StoryModel> storyimage) {
        this.storyimage = storyimage;
    }
}
