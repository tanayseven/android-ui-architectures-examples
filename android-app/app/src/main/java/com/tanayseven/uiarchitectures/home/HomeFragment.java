package com.tanayseven.uiarchitectures.home;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.tanayseven.uiarchitectures.MainActivity;
import com.tanayseven.uiarchitectures.R;
import com.tanayseven.uiarchitectures.ipLocationPresenterFirst.IPLocationFragment;

/**
 * Created by tanay on 12/9/17.
 */

public class HomeFragment extends Fragment {
    public static final String TAG = HomeFragment.class.getSimpleName();

    private Button ipLocationButton;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View contentView = super.onCreateView(inflater, container, savedInstanceState);
        if (contentView == null)
            contentView = inflater.inflate(R.layout.fragment_home, container, false);
        bindViews(contentView);
        initViews();
        return contentView;
    }

    private void bindViews(View contentView) {
        ipLocationButton = (Button) contentView.findViewById(R.id.ip_location);
    }

    private void initViews() {
        ipLocationButton.setOnClickListener(v -> {
            goToIpLocationFragment();
        });
    }

    private void goToIpLocationFragment() {
        IPLocationFragment ipLocationFragment = new IPLocationFragment();
        ((MainActivity) getActivity()).switchFragment(ipLocationFragment, IPLocationFragment.TAG);
    }
}
