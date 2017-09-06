package com.lightwind.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * 功能：县区的实体类
 * 作者：刘洋
 * 时间：2017/9/4
 */

public class County extends DataSupport {
    // 序列号
    private int id;
    // 县区名字
    private String countyName;

    // 天气id
    private String weatherId;
    // 所属城市的id
    private int cityId;

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

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }
}

