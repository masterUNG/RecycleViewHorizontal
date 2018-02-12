package androidthai.in.th.testgetimage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import androidthai.in.th.testgetimage.fragment.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.contentFragment, new MainFragment()).commit();
        }

    }
}
