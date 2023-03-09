package com.example.giphy;


import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Data {
    @SerializedName("data")
    ArrayList<gifsModel> gifsModelArrayList;
}
