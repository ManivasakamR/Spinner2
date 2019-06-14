package com.example.spinnerloader;
import retrofit2.Call;
import retrofit2.http.GET;

public interface SpinnerInterface {
    String JSONURL = "http://myyearsprovider.somee.com/api/";
    @GET("years")
    Call<String> getJSONString();
}