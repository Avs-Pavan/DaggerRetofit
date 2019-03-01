package com.example.kevin.daggerretofit;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiInterface {
    @GET("api/notification/push/{id}")
    Call<BasePojo> push(@Path("id")String id);

}
