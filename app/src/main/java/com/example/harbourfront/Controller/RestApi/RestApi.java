package com.example.harbourfront.Controller.RestApi;

import com.example.harbourfront.Models.RadioListingModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RestApi {
    @GET("programs?format=json")
    Call<RadioListingModel> getRadioList(@Query("size") String size, @Query("page") String page);
}
