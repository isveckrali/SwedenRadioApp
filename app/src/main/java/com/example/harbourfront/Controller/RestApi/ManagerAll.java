package com.example.harbourfront.Controller.RestApi;


import com.example.harbourfront.Controller.Services.Services;
import com.example.harbourfront.Models.RadioListingModel;

import retrofit2.Call;

public class ManagerAll extends BaseManager {

    private static ManagerAll ourInstance = new ManagerAll();

    public static synchronized ManagerAll getInstance() {

        return ourInstance;

    }

    public Call<RadioListingModel> getRadioListingData(String size, String page) {

        Call<RadioListingModel> call = getRestApiClient().getRadioList(size, page);
        return call;
    }
}
