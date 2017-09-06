package com.lightwind.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * 功能：城市实体类
 * 作者：刘洋
 * 时间：2017/9/4
 */

public class City extends DataSupport {
    // 序列号
    private int id;
    // 城市名字
    private String cityName;
    // 城市代号
    private int cityCode;
    // 当前市所属省的id
    private int provinceId;

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }
}
