package com.example.tomorrowweather.db;

import org.litepal.crud.DataSupport;

public class County extends DataSupport {
    private int id;
    private String countyName;//县城名称
    private String weatherId;//天气代号
    private int cityId;//所属市的ID号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
