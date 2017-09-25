package com.tanayseven.uiarchitectures;

import com.tanayseven.uiarchitectures.RequestResponsePojos.IPLocationResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by tanay on 24/9/17.
 */

public interface LocationService {
    @GET("/json")
    Call<IPLocationResponse> getCurrentIPLocationStatus();

    @GET("/json/{ip}")
    Call<IPLocationResponse> getCurrentIPLocationStatus(@Path("ip") String ip);
}
