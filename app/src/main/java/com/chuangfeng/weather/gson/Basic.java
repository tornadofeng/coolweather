package com.chuangfeng.weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by chuangfeng on 2017/3/13.
 */

public class Basic {

    /**
     * 由于Json中的一些字段可能不太适合直接作为Java字段来命名，
     * 因此这里使用注解的方式来让Json字段之间建立映射关系。
     */

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
