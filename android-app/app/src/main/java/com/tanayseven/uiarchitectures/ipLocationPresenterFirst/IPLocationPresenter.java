package com.tanayseven.uiarchitectures.ipLocationPresenterFirst;

/**
 * Created by tanay on 24/9/17.
 */

public class IPLocationPresenter {
    public void IPLocationPresenter(IPLocationContract.Model model, IPLocationContract.View view) {
        view.whenGetLocationInfoButtonClick(() -> model.fetchLocationDataForIP(view.getIp()));
        model.whenGetLocationInfoSuccess(() -> {
            view.setStatus(model.getStatus());
            view.setIP(model.getIP());
            view.setCity(model.getCity());
            view.setCountry(model.getCountry());
            view.setCountryCode(model.getCountryCode());
            view.setIsp(model.getIsp());
            view.setLatitude(model.getLatitude());
            view.setLongitude(model.getLongitude());
            view.setOrganization(model.getOrganization());
            view.setRegionName(model.getRegionName());
            view.setRegionCode(model.getRegionCode());
            view.setTimezone(model.getTimezone());
            view.setZipCode(model.getZipCode());
        });
        model.whenGetLocationInfoFailure(()->{
            view.showLocationInfoFailure(model.getFailureMessage());
        });
    }


}
