package com.lightwind.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 功能：
 * 作者：刘洋
 * 时间：2017/9/6
 */

public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort {
        @SerializedName("txt")
        public String info;
    }

    public class CarWash {
        @SerializedName("txt")
        public String info;
    }

    public class Sport {
        @SerializedName("txt")
        public String info;
    }
}
