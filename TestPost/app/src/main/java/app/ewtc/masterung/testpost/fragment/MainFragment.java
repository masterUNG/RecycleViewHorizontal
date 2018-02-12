package app.ewtc.masterung.testpost.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import app.ewtc.masterung.testpost.MainActivity;
import app.ewtc.masterung.testpost.R;

/**
 * Created by masterung on 8/13/2017 AD.
 */

public class MainFragment extends Fragment{

    //Explicit
    private String phoneString;
    private int moneyAnInt = 10;
    private String moneyString;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        return view;
    }   // onCreateView

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        // Create Toolbar
        createToolbar();

        // Create Spinner
        createSpinner();

    }   // onActivityCreate

    private void createSpinner() {
        final String[] moneyStrings = new String[]{"10 THB", "20 THB", "30 THB", "40 THB", "50 THB"};
        Spinner spinner = getView().findViewById(R.id.spnMoney);
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, moneyStrings);
        spinner.setAdapter(stringArrayAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                moneyAnInt = (1 + i) * 10;
                moneyString = Integer.toString(moneyAnInt);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                moneyString = Integer.toString(moneyAnInt);
            }
        });

    }


    private void createToolbar() {
        Toolbar toolbar = getView().findViewById(R.id.mainToolbar);
        ((MainActivity)getActivity()).setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.mipmap.ic_upload);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d("13AugV1", "Click Navigation");
                EditText editText = getView().findViewById(R.id.edtPhone);
                phoneString = editText.getText().toString().trim();

                //Check Space
                if (phoneString.equals("")) {
                    //Have Space
                    Toast.makeText(getActivity(), "Please Fill Phone Number", Toast.LENGTH_SHORT).show();
                } else {
                    //No Space
                    Log.d("13AugV1", "Phone ==> " + phoneString);
                    Log.d("13AugV1", "Money ==> " + moneyString);
                }


            }   // onClick
        });
    }

}   // Main Class
