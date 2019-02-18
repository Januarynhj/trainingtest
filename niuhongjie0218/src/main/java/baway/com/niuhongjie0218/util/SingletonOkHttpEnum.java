package baway.com.niuhongjie0218.util;

import android.util.Log;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.BufferedSink;

public enum SingletonOkHttpEnum {
    instanceOk;

    private SingletonOkHttpEnum(){}

    public void okHttpGet(){
        //创建OkHttpClient实例对象
        OkHttpClient okHttpClient = new OkHttpClient();
        //创建Request对象
        Request request = new Request.Builder()
                .url("http://365jia.cn/news/api3/365jia/news/headline")
                .get()
                .build();
        //执行Request请求
        //异步请求
        okHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                //请求失败
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                //请求成功
                Log.d("TestOkHttp",response.body().string());
            }
        });
    }
    public void okHttpPost(){
        //创建OkHttpClient实例对象
        OkHttpClient okHttpClient = new OkHttpClient();
        //创建Request对象
        MediaType mediaType = MediaType.parse("application/json; charset=utf-8");
        RequestBody requestBody = RequestBody.create(mediaType,"{}");
        Request request = new Request.Builder()
                .url("http://365jia.cn/news/api3/365jia/news/headline")
                .post(requestBody)
                .build();
        //执行Request请求
        //异步请求
        okHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                //请求失败
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                //请求成功
                Log.d("TestOkHttp",response.body().string());
            }
        });
    }
}
