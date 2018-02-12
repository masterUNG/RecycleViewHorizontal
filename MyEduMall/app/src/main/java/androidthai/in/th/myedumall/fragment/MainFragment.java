package androidthai.in.th.myedumall.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidthai.in.th.myedumall.R;
import androidthai.in.th.myedumall.utility.MyAlertDialog;

/**
 * Created by masterung on 4/12/2017 AD.
 */

public class MainFragment extends Fragment{

    //    Explicit
    private EditText editText;
    private Button button;


//    Manager Method
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        Initial View
        initialView();

//        Button Controller
        buttonController();

    }   // Main Method

    private void buttonController() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                Get Value From EditText
                String moneyString = editText.getText().toString().trim();

//                Check Space
                if (moneyString.isEmpty()) {
//                    Have Space
                    MyAlertDialog myAlertDialog = new MyAlertDialog(getActivity());
                    myAlertDialog.normalDialog("Have Space",
                            "Please Fill All EveryBlank");
                } else {
//                    No Space
                    calculate(moneyString);
                }

            }   // onClick
        });
    }

    private void calculate(String moneyString) {

        double factorADouble = 0.031;
        double moneyADouble = Double.parseDouble(moneyString);
        double answerADouble = moneyADouble * factorADouble;

        String answerString = Double.toString(answerADouble);

        MyAlertDialog myAlertDialog = new MyAlertDialog(getActivity());
        myAlertDialog.normalDialog("Answer",
                "Money = " + answerString + " USD");

        editText.setText("");


    }

    private void initialView() {
        editText = getView().findViewById(R.id.edtMoney);
        button = getView().findViewById(R.id.btnExchange);
    }

    //    Create View from my xml
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

//        Create my View
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        return view;
    }
}   // Main Class
