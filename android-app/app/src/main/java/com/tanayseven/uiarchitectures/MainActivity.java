package com.tanayseven.uiarchitectures;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.tanayseven.uiarchitectures.home.HomeFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadHomeFragment();
    }

    private void loadHomeFragment() {
        HomeFragment homeFragment = new HomeFragment();
        this.switchFragment(homeFragment, HomeFragment.TAG);
    }

    public void switchFragment(Fragment fragment, String tag) {
        getFragmentManager().beginTransaction().replace(R.id.main_activity_container, fragment, tag).commit();
    }
}
