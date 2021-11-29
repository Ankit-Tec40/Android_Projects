package com.tecwec.stories;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tecwec.stories.databinding.FragmentUserStoriesBinding;

import java.util.ArrayList;

public class StatusAdapter extends RecyclerView.Adapter<StatusAdapter.statusViewHolder> {

    Context context;
    ArrayList<user_status> userStatuses;
    public StatusAdapter(Context context,ArrayList<user_status> userStatuses){

        this.context=context;
        this.userStatuses=userStatuses;
    }


    @NonNull
    @Override
    public statusViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.fragment_user_stories,parent,false);
        return new statusViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull statusViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return userStatuses.size();
    }

    public class statusViewHolder extends RecyclerView.ViewHolder {

        FragmentUserStoriesBinding binding;

         public statusViewHolder(@NonNull View itemView) {
             super(itemView);
             binding=FragmentUserStoriesBinding.bind(itemView);
         }
     }

}
