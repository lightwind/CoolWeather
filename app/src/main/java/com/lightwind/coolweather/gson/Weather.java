package com.lightwind.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 功能：
 * 作者：刘洋
 * 时间：2017/9/6
 */

public class Weather {
    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
