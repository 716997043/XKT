package com.example.xktapp.model;

import com.test.mvp.mvpdemo.mvp.v7.SecondContract;
import com.test.mvp.mvpdemo.mvp.v7.basemvp.BaseModel;

import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;

public class SecondModel extends BaseModel implements SecondContract.ISecondModel {
    @Override
    public void requestBaidu(Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://blog.csdn.net/smile_running")
                .build();
        client.newCall(request).enqueue(callback);
    }
}
