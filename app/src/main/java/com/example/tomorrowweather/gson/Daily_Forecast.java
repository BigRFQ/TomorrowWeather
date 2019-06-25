package com.example.tomorrowweather.gson;

import com.google.gson.annotations.SerializedName;
//未来7天天气预报
public class Daily_Forecast {
    public String date;//预报的日期

    @SerializedName("tmp_max")
    public String temperature_max;//温度最大值

    @SerializedName("tmp_min")
    public String temperature_min;//温度最小值

    public String cond_txt_d; //天气描述

}
