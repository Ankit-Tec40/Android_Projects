package com.technik.weather;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.ActivityCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.material.textfield.TextInputEditText;
import com.squareup.picasso.Picasso;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    private ConstraintLayout home;
    private ProgressBar progress;
    private TextView cityNameTV, Temp, conditionTV;
    private ImageView icon, search, background;
    private TextInputEditText edCity;
    private RecyclerView WeatherRv;
    String time ;
    String temp ;
    String img ;
    String wind ;

    private ArrayList<WeatherRvModel>weatherRvModelArrayList;
    private WeatherRvAdapter weatherRvAdapter;

    private LocationManager locationManager;
    private int PERMISSION_CODE = 1;

    private String CityName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        setContentView(R.layout.activity_main);
        home = findViewById(R.id.home);
        progress = findViewById(R.id.progress);
        cityNameTV = findViewById(R.id.City);
        Temp = findViewById(R.id.temp);
        conditionTV = findViewById(R.id.condition);
        icon = findViewById(R.id.icon);
        search = findViewById(R.id.search);
        background = findViewById(R.id.IVBack);
        edCity = findViewById(R.id.edCity);


        RecyclerView recyclerView=findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));



        weatherRvModelArrayList = new ArrayList<>();


        locationManager = (LocationManager)getSystemService(Context.LOCATION_SERVICE);
        if(ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED){
           ActivityCompat.requestPermissions(MainActivity.this,new String[]{Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION},PERMISSION_CODE);

        }

        Location location = locationManager.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);

        CityName = getCityName(location.getLongitude(),location.getLatitude());
        getWeatherInfo(CityName);

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String city = edCity.getText().toString();
                if(city.isEmpty()){
                    Toast.makeText(MainActivity.this,"enter the city",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    cityNameTV.setText(CityName);
                    getWeatherInfo(city);
                }
            }
        });


        WeatherRvModel[] weatherRvModel=new WeatherRvModel[]{
            new WeatherRvModel(temp,time,wind,img)
        };

        weatherRvAdapter = new WeatherRvAdapter(this,weatherRvModelArrayList);
        recyclerView.setAdapter(weatherRvAdapter);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode,  @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if(requestCode == PERMISSION_CODE){
            if(grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                Toast.makeText(this,"Permission Granted" ,Toast.LENGTH_SHORT).show();
            }
            else
            {
                Toast.makeText(this,"Please provide permission",Toast.LENGTH_SHORT).show();
                finish();
            }
        }

    }

    private String getCityName(double longitude, double latitude)
    {
        String cityName = "Not found";
        Geocoder gcd = new Geocoder(getBaseContext(), Locale.getDefault());
        try{
            List<Address>addresses = gcd.getFromLocation(latitude,longitude,10);
            for(Address adr: addresses)
            {
                if(adr!=null){
                    String city = adr.getLocality();
                    if(city != null && !city.equals("")){
                        cityName = city;
                    }
                    else{
                        Log.d("TAG","CITY_NOT_FOUND");
                        Toast.makeText(this,"User city not found",Toast.LENGTH_LONG).show();
                    }
                }
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }


        return cityName;
    }

    public void getWeatherInfo(String cityname)
    {
        String url = "http://api.weatherapi.com/v1/forecast.json?key=c6845715014849849cb52117212311&q="+ cityname + "&days=1&aqi=no&alerts=no";
        cityNameTV.setText(cityname);
        RequestQueue requestQueue  = Volley.newRequestQueue(this);
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                progress.setVisibility(View.GONE);
                home.setVisibility(View.VISIBLE);
                weatherRvModelArrayList.clear();
                try {
                    String temperature = response.getJSONObject("current").getString("temp_c");
                    Temp.setText(temperature);
                    int isday = response.getJSONObject("current").getInt("is_day");
                    String condition = response.getJSONObject("current").getJSONObject("condition").getString("text");
                    String conditionIcon = response.getJSONObject("current").getJSONObject("condition").getString("icon");
                    Picasso.get().load("http:".concat(conditionIcon)).into(icon);
                    conditionTV.setText(condition);
                    if(isday == 1){
                        Picasso.get().load("https://images.unsplash.com/photo-1590867286251-8e26d9f255c0?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=387&q=80").into(background);

                    }else{
                        Picasso.get().load("https://images.unsplash.com/photo-1472552944129-b035e9ea3744?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=387&q=80").into(background);
                    }

                    JSONObject forecastObj = response.getJSONObject("forecast");
                    JSONObject forecastO = forecastObj.getJSONArray("forecastday").getJSONObject(0);
                    JSONArray hourArray = forecastO.getJSONArray("hour");
                    for(int i = 0;i<hourArray.length();i++){
                        JSONObject hourObj = hourArray.getJSONObject(i);
                        time = hourObj.getString("time");
                        temp = hourObj.getString("temp_c");
                        img = hourObj.getJSONObject("condition").getString("icon");
                        wind = hourObj.getString("wind_kph");
                        weatherRvModelArrayList.add(new WeatherRvModel(temp,time,wind,img));
                    }
                    weatherRvAdapter.notifyDataSetChanged();

                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
           //Toast.makeText(this,"Please enter valid city name..",Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this,"valid city name",Toast.LENGTH_SHORT).show();
            }
        });

        requestQueue.add(jsonObjectRequest);

    }
}