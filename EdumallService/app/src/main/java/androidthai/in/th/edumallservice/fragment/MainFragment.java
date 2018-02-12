package androidthai.in.th.edumallservice.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidthai.in.th.edumallservice.R;

/**
 * Created by masterung on 27/11/2017 AD.
 */

public class MainFragment extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

//        Create View Fragment
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        return view;
    }
}   // Main Class
