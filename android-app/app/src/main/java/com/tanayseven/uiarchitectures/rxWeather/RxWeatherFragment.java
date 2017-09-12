package com.tanayseven.uiarchitectures.rxWeather;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tanayseven.uiarchitectures.R;

/**
 * Created by tanay on 11/9/17.
 */

public class RxWeatherFragment extends Fragment {
    public static final String TAG = RxWeatherFragment.class.getSimpleName();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View contentView = super.onCreateView(inflater, container, savedInstanceState);
        if (contentView == null)
            contentView = inflater.inflate(R.layout.fragment_weather_rx, container, false);
        return contentView;
    }
}
