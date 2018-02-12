package app.ewtc.masterung.demodrawermenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import app.ewtc.masterung.demodrawermenu.fragment.MainFragment;
import app.ewtc.masterung.demodrawermenu.fragment.SecondFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Add Fragment
        addFragment(savedInstanceState);

        //Main Fragment Controller
        mainFragmentController();

        //Second Fragment Controller
        secondFragmentController();

    }   // Main Method



    private void secondFragmentController() {
        TextView textView = (TextView) findViewById(R.id.txtSecondFragment);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("6AugV1", "Click Second");
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.content, new SecondFragment())
                        .commit();
                
            }
        });
    }

    private void mainFragmentController() {
        TextView textView = (TextView) findViewById(R.id.txtMainFragment);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("6AugV1", "Click Main");
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.content, new MainFragment())
                        .commit();
            }
        });
    }

    private void addFragment(Bundle savedInstanceState) {
        if (savedInstanceState == null) {
            MainFragment mainFragment = new MainFragment();
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.content, mainFragment)
                    .commit();
        }
    }
}
