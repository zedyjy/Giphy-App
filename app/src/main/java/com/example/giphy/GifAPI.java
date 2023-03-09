package com.example.giphy;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GifAPI {
    @GET("trending?api_key=UOBuXYN98b4aR7O89h6O0wzBSG148rTd")
    Call<Data> gifsList();
}
