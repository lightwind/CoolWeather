package com.lightwind.coolweather.gson;

/**
 * 功能：
 * 作者：刘洋
 * 时间：2017/9/6
 */

public class AQI {

    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
