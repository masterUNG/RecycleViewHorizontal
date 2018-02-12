package app.ewtc.masterung.testtoolbar.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import app.ewtc.masterung.testtoolbar.MainActivity;
import app.ewtc.masterung.testtoolbar.R;

/**
 * Created by masterung on 8/14/2017 AD.
 */

public class MainFragment extends Fragment {

    private EditText editText;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        return view;
    }   // onCreateView

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("Name", editText.getText().toString().trim());

    }




    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        editText = getView().findViewById(R.id.edtName);
        editText.setText(savedInstanceState.getString("Name"));


        //Create ToolBar
        createToolBar();


    }   // onActivityCreate

    private void createToolBar() {
        Toolbar toolbar = getView().findViewById(R.id.mainToolbar);
        ((MainActivity) getActivity()).setSupportActionBar(toolbar);

        //Add Title
        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Master UNG");
        ((MainActivity) getActivity()).getSupportActionBar().setSubtitle("EWTC Institute");


        //Add Navigation
        toolbar.setNavigationIcon(R.mipmap.ic_back);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("14AugV1", "Click Back");
            }
        });
    }


}   // Main Class
