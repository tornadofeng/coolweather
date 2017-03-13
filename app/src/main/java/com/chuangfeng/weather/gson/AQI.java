package com.chuangfeng.weather.gson;

/**
 * Created by chuangfeng on 2017/3/13.
 */

public class AQI {

    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }

}
