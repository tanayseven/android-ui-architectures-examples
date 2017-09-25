package com.tanayseven.uiarchitectures.ipLocationPresenterFirst;

import android.support.annotation.NonNull;

import com.tanayseven.uiarchitectures.Events;
import com.tanayseven.uiarchitectures.Executor;
import com.tanayseven.uiarchitectures.LocationService;
import com.tanayseven.uiarchitectures.RequestResponsePojos.IPLocationResponse;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by tanay on 24/9/17.
 */

public class IPLocationModel implements IPLocationContract.Model {
    private final LocationService locationService;
    @NonNull
    private IPLocationResponse responseObject;
    private List<Executor> fetchLocationDataSuccess = new ArrayList<>();
    private List<Executor> fetchLocationDataFailure = new ArrayList<>();
    private List<Executor> getLocationInfoSuccess = new ArrayList<>();
    private List<Executor> getLocationInfofailure = new ArrayList<>();

    public IPLocationModel(LocationService locationService) {
        this.locationService = locationService;
    }

    @Override
    public void fetchLocationDataForIP(String ip) {
        if (ip.equals("")) {
            locationService.getCurrentIPLocationStatus().enqueue(new Callback<IPLocationResponse>() {
                @Override
                public void onResponse(Call<IPLocationResponse> call, Response<IPLocationResponse> response) {
                    responseObject = response.body();
                    Events.fire(fetchLocationDataSuccess);
                }

                @Override
                public void onFailure(Call<IPLocationResponse> call, Throwable t) {
                    Events.fire(fetchLocationDataFailure);
                }
            });
        } else {

        }
    }

    @Override
    public String getFailureMessage() {
        return null;
    }

    @Override
    public String getIP() {
        return responseObject.getQuery();
    }

    @Override
    public String getCity() {
        return responseObject.getCity();
    }

    @Override
    public String getCountry() {
        return responseObject.getCountry();
    }

    @Override
    public String getCountryCode() {
        return responseObject.getCountryCode();
    }

    @Override
    public String getIsp() {
        return responseObject.getIsp();
    }

    @Override
    public String getLatitude() {
        return Double.toString(responseObject.getLat());
    }

    @Override
    public String getLongitude() {
        return Double.toString(responseObject.getLon());
    }

    @Override
    public String getOrganization() {
        return responseObject.getOrg();
    }

    @Override
    public String getRegionName() {
        return responseObject.getRegionName();
    }

    @Override
    public String getRegionCode() {
        return responseObject.getRegion();
    }

    @Override
    public String getStatus() {
        return responseObject.getStatus();
    }

    @Override
    public String getTimezone() {
        return responseObject.getTimezone();
    }

    @Override
    public String getZipCode() {
        return responseObject.getZip();
    }

    @Override
    public void whenGetLocationInfoSuccess(Executor executor) {
        this.getLocationInfoSuccess.add(executor);
    }

    @Override
    public void whenGetLocationInfoFailure(Executor executor) {
        this.getLocationInfofailure.add(executor);
    }

}
