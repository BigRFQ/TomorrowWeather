package com.example.tomorrowweather.gson;

import com.google.gson.annotations.SerializedName;

public class Now {
    @SerializedName("tmp")//温度
    public String temperature;

    @SerializedName("cond_txt")//天气描述
    public String more;

    public String wind_dir;//风向

    public String wind_spd;//风速




}
