package com.tecwec.stories;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import xute.storyview.StoryView;

public class StoriesAdapter extends RecyclerView.Adapter<StoriesAdapter.ViewHolder> {
    StoriesData[] storiesData;
    Context context;

    public StoriesAdapter(StoriesData[] storiesData,MainActivity activity){
        this.storiesData=storiesData;
        this.context=activity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.stories_list,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final StoriesData userDataList=storiesData[position];

        holder.userName.setText(userDataList.getUserName());
        holder.storyImages.setImageUris(userDataList.getStoryimage());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, userDataList.getUserName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return storiesData.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        StoryView storyImages;
        TextView userName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            storyImages=itemView.findViewById(R.id.storyViewID);
            userName=itemView.findViewById(R.id.nameID);

        }
    }

}
