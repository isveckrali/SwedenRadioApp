package com.example.harbourfront.Controller.RestApi;

public class BaseManager {

    protected RestApi getRestApiClient() {
        RestApiClient restApiClient = new RestApiClient(BaseUrl.RADIO_URL);
        return restApiClient.getmRestApi();
    }
}