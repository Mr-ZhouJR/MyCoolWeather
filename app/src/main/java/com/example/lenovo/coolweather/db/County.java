package com.example.lenovo.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * 代表县的数据库表
 */

public class County extends DataSupport {
    private int id;
    private String countName;  //县的名字
    private String weatherId;   //天气id
    private int cityId;    //当前县所属城市的id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountName() {
        return countName;
    }

    public void setCountName(String countName) {
        this.countName = countName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
