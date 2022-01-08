package com.technik.weather;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class WeatherRvAdapter  extends RecyclerView.Adapter<WeatherRvAdapter.ViewHolder> {
    private Context context;
    private ArrayList<WeatherRvModel>WeatherarrayList;

    public WeatherRvAdapter(Context context, ArrayList<WeatherRvModel> weatherarrayList) {
        this.context = context;
        WeatherarrayList = weatherarrayList;
    }

    @NonNull
    @Override
    public WeatherRvAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.weather_rv_items,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WeatherRvAdapter.ViewHolder holder, int position) {
        WeatherRvModel model = WeatherarrayList.get(position);
        holder.temperature.setText(model.getTemperature() + "°c");
        Picasso.get().load("http:".concat(model.getIcon())).into(holder.condition);
        holder.windSpeed.setText(model.getWindSpeed() + "Km/h");
        SimpleDateFormat input = new SimpleDateFormat("yyyy-MM-dd hh:mm");
        SimpleDateFormat output = new SimpleDateFormat("hh:mm aa");
        try {
            Date t = input.parse(model.getTime());
            holder.time.setText(output.format(t));
        }
        catch (ParseException e){
            e.printStackTrace();
        }

    }

    @Override
    public int getItemCount() {
        return WeatherarrayList.size();
    }

    public class ViewHolder  extends RecyclerView.ViewHolder{
        private TextView temperature, windSpeed, time;
        private ImageView condition;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            temperature = itemView.findViewById(R.id.idTVTemperature);
            windSpeed = itemView.findViewById(R.id.idTVWindspeed);
            time = itemView.findViewById(R.id.idTVTime);
            condition = itemView.findViewById(R.id.idTVCondition);
        }
    }
}
