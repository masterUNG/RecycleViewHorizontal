package app.ewtc.masterung.testfragmentmap.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;

import app.ewtc.masterung.testfragmentmap.R;

/**
 * Created by masterung on 11/10/2017 AD.
 */

public class MainFragment extends Fragment {

    private MapView mapView;
    private GoogleMap googleMap;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        mapView = view.findViewById(R.id.map);
        return view;
    }
}
