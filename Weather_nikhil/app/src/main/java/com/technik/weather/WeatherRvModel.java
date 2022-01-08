package com.technik.weather;

public class WeatherRvModel {

    private String temperature, time, windSpeed , icon;

    public WeatherRvModel(String temperature, String time, String windSpeed, String icon) {
        this.temperature = temperature;
        this.time = time;
        this.windSpeed = windSpeed;
        this.icon = icon;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(String windSpeed) {
        this.windSpeed = windSpeed;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
