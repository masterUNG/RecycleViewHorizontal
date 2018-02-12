package app.ewtc.masterung.testtoolbar.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import app.ewtc.masterung.testtoolbar.MainActivity;
import app.ewtc.masterung.testtoolbar.R;

/**
 * Created by masterung on 8/13/2017 AD.
 */

public class MainFragment extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        //Create ToolBar
       // createToolBar();

    }

    private void createToolBar() {
//        Toolbar toolbar = getView().findViewById(R.id.toolbarMain);
//        ((MainActivity)getActivity()).setSupportActionBar(toolbar);
//        ((MainActivity) getActivity()).getSupportActionBar().setTitle("มาสเตอร์ อึ่ง");
//        ((MainActivity) getActivity()).getSupportActionBar().setSubtitle("androidthai.in.th");
    }


}
