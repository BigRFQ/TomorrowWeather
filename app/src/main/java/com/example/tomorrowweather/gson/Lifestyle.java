package com.example.tomorrowweather.gson;

//生活指数
public class Lifestyle {



    //comf：舒适度指数、cw：洗车指数、drsg：穿衣指数、flu：感冒指数、sport：运动指数、
    // trav：旅游指数、uv：紫外线指数、air：空气污染扩散条件指数、ac：空调开启指数、
    // ag：过敏指数、gl：太阳镜指数、mu：化妆指数、airc：晾晒指数、ptfc：交通指数、fsh：钓鱼指数、spi：防晒指数
    public String type; //生活指数类型
    public String brf;//生活指数简介舒适、较差、弱，根据TYPE得到等
    public String txt;//详细描述
}
