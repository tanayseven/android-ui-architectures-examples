package com.tanayseven.uiarchitectures;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tanayseven.uiarchitectures.rxWeather.RxWeatherFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadHomeFragment();
    }

    private void loadHomeFragment() {
        RxWeatherFragment weatherRxFragment = new RxWeatherFragment();
        this.switchFragment(weatherRxFragment, RxWeatherFragment.TAG);
    }

    public void switchFragment(Fragment fragment, String tag) {
        getFragmentManager().beginTransaction().replace(R.id.main_activity_container, fragment, tag);
    }
}
