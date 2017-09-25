package com.tanayseven.uiarchitectures;

import retrofit2.Retrofit;

/**
 * Created by tanay on 24/9/17.
 */

public class RestClient {
    public static Retrofit ipLocationService() {
        return new Retrofit.Builder()
                .baseUrl("http://ip-api.com")
                .build();
    }
}
