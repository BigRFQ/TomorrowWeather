package com.example.tomorrowweather.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {
    @SerializedName("location")//所在县市名称
    public String cityName;
    @SerializedName("cid")//天气代号
    public String weatherId;

}
