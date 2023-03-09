package com.example.giphy;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitGifs {
    private static RetrofitGifs instance = null;
    private GifAPI myApi;

    private RetrofitGifs() {
        String baseUrl = "https://api.giphy.com/v1/gifs/";
        Retrofit retrofit = new Retrofit.Builder().baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        myApi = retrofit.create(GifAPI.class);
    }

    public static synchronized RetrofitGifs getInstance() {
        if (instance == null) {
            instance = new RetrofitGifs();
        }
        return instance;
    }

    public GifAPI getMyApi() {
        return myApi;
    }
}
