package com.example.lenovo.coolweather.util;


import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * 和服务器交互工具类
 * 传入一个请求地址，并注册一个回调来处理服务器响应
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
