package com.example.tomorrowweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Weather {
    public String status;
    public Basic basic;
    public Update update;
    public Now now;
    @SerializedName("daily_forecast")
    public List<Daily_Forecast> forecastList;

    @SerializedName("hourly")
    public List<Hourly> hourlyList;//未来8小时天气

    @SerializedName("lifestyle")
    public List<Lifestyle> lifestyleList;//生活指数
}
