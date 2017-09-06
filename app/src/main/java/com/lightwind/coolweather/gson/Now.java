package com.lightwind.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 功能：
 * 作者：刘洋
 * 时间：2017/9/6
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
