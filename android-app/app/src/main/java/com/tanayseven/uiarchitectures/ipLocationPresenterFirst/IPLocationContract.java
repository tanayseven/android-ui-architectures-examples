package com.tanayseven.uiarchitectures.ipLocationPresenterFirst;

import com.tanayseven.uiarchitectures.Executor;

/**
 * Created by tanay on 24/9/17.
 */

public interface IPLocationContract {
    interface Model {

        void fetchLocationDataForIP(String ip);

        String getFailureMessage();

        void whenGetLocationInfoFailure(Executor executor);

        String getIP();

        String getCity();

        String getCountry();

        String getCountryCode();

        String getIsp();

        String getLatitude();

        String getLongitude();

        String getOrganization();

        String getRegionName();

        String getRegionCode();

        String getStatus();

        String getTimezone();

        String getZipCode();

        void whenGetLocationInfoSuccess(Executor executor);
    }

    interface View {
        String getIp();

        void whenGetLocationInfoButtonClick(Executor executor);

        void showLocationInfoFailure(String failureMessage);

        void setIP(String ip);

        void setCity(String city);

        void setCountry(String country);

        void setCountryCode(String countryCode);

        void setIsp(String isp);

        void setLatitude(String latitude);

        void setLongitude(String longitude);

        void setOrganization(String organization);

        void setRegionName(String regionName);

        void setRegionCode(String regionCode);

        void setStatus(String status);

        void setTimezone(String timezone);

        void setZipCode(String zipCode);
    }
}
