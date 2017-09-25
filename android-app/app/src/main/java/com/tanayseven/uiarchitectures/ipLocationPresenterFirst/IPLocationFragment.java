package com.tanayseven.uiarchitectures.ipLocationPresenterFirst;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.tanayseven.uiarchitectures.Events;
import com.tanayseven.uiarchitectures.Executor;
import com.tanayseven.uiarchitectures.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tanay on 23/9/17.
 */

public class IPLocationFragment extends Fragment implements IPLocationContract.View {
    public static final String TAG = IPLocationFragment.class.getSimpleName();
    private EditText ipAddressEditText;
    private Button getLocationInfoButton;
    private LinearLayout infoLayoutView;
    private TextView countryTextView;
    private TextView countryCodeTextView;
    private TextView regionTextView;
    private TextView regionCodeTextView;
    private TextView cityTextView;
    private TextView zipCodeTextView;
    private TextView latitudeTextView;
    private TextView longitudeTextView;
    private TextView timezoneTextView;
    private TextView ispTextView;
    private TextView organizationTextView;
    private TextView asNumberTextView;
    private ImageView countryFlagImageView;
    private List<Executor> getLocationInfo = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View contentView = super.onCreateView(inflater, container, savedInstanceState);
        if (contentView == null)
            contentView = inflater.inflate(R.layout.fragment_ip_location, container, false);
        bindViews(contentView);
        initializeViews();
        return contentView;
    }

    private void bindViews(View contentView) {
        ipAddressEditText = (EditText) contentView.findViewById(R.id.ip_address_edit_text);
        getLocationInfoButton = (Button) contentView.findViewById(R.id.get_location_info_button);
        infoLayoutView = (LinearLayout) contentView.findViewById(R.id.info_layout);
        countryTextView = (TextView) contentView.findViewById(R.id.country);
        countryCodeTextView = (TextView) contentView.findViewById(R.id.country_code);
        regionTextView = (TextView) contentView.findViewById(R.id.region);
        regionCodeTextView = (TextView) contentView.findViewById(R.id.region_code);
        cityTextView = (TextView) contentView.findViewById(R.id.city);
        zipCodeTextView = (TextView) contentView.findViewById(R.id.zip_code);
        latitudeTextView = (TextView) contentView.findViewById(R.id.latitude);
        longitudeTextView = (TextView) contentView.findViewById(R.id.longitude);
        timezoneTextView = (TextView) contentView.findViewById(R.id.timezone);
        ispTextView = (TextView) contentView.findViewById(R.id.isp);
        organizationTextView = (TextView) contentView.findViewById(R.id.organization);
        asNumberTextView = (TextView) contentView.findViewById(R.id.as_number);
        countryFlagImageView = (ImageView) contentView.findViewById(R.id.country_flag);
    }

    private void initializeViews() {
        getLocationInfoButton.setOnClickListener(v -> {
            Events.fire(getLocationInfo);
        });
    }

    @Override
    public String getIp() {
        return ipAddressEditText.getText().toString();
    }

    @Override
    public void whenGetLocationInfoButtonClick(Executor executor) {
        getLocationInfo.add(executor);
    }

    @Override
    public void showLocationInfoFailure(String failureMessage) {
        // TODO show a dialog message here
    }

    @Override
    public void setIP(String ip) {
        ipAddressEditText.setText(ip);
    }

    @Override
    public void setCity(String city) {
        cityTextView.setText("City: " + city);
    }

    @Override
    public void setCountry(String country) {
        countryTextView.setText("Country: " + country);
    }

    @Override
    public void setCountryCode(String countryCode) {
        countryCodeTextView.setText("Country Code: " + countryCode);
    }

    @Override
    public void setIsp(String isp) {
        ispTextView.setText("ISP: " + isp);
    }

    @Override
    public void setLatitude(String latitude) {
        latitudeTextView.setText("Latitude: " + latitude);
    }

    @Override
    public void setLongitude(String longitude) {
        longitudeTextView.setText("Longitude: " + longitude);
    }

    @Override
    public void setOrganization(String organization) {
        organizationTextView.setText("Organization: " + organization);
    }

    @Override
    public void setRegionName(String regionName) {
        regionTextView.setText("Region Name: " + regionName);
    }

    @Override
    public void setRegionCode(String regionCode) {
        regionCodeTextView.setText("Region Code: " + regionCode);
    }

    @Override
    public void setStatus(String status) {
        infoLayoutView.setVisibility(View.VISIBLE);
        // TODO Handle successful status here
    }

    @Override
    public void setTimezone(String timezone) {
        timezoneTextView.setText("Timezone: " + timezone);
    }

    @Override
    public void setZipCode(String zipCode) {
        zipCodeTextView.setText("ZIP Code: " + zipCode);
    }
}
