package com.lightwind.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * 功能：存放省的信息
 * 作者：刘洋
 * 时间：2017/9/4
 */

public class Province extends DataSupport {
    // 序列号
    private int id;
    // 省的名字
    private String provinceName;
    // 省的代号
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
