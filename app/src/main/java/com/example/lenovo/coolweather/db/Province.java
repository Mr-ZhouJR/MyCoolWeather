package com.example.lenovo.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * 代表省的数据库表
 */

public class Province extends DataSupport {
    private int id;    //id号
    private String provinceName;  //省得名字
    private int provinceCode;    //省得代号

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
