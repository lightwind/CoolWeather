package com.lightwind.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 功能：
 * 作者：刘洋
 * 时间：2017/9/6
 */

public class Basic {

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
