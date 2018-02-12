package androidthai.in.th.testgetimage.fragment;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidthai.in.th.testgetimage.MainActivity;
import androidthai.in.th.testgetimage.R;

/**
 * Created by masterung on 27/11/2017 AD.
 */

public class MainFragment extends Fragment{

    private ImageView imageView;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        imageView = getView().findViewById(R.id.imvImage);

//        Image Controller
        imageController();

    }   // Main Method



    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        Log.d("28novV1", "onActivityResult Work");

        if (resultCode == getActivity().RESULT_OK) {
            Log.d("28novV1", "Reaulte OK");

            try {

                Uri uri = data.getData();

                Bitmap bitmap = BitmapFactory.decodeStream(getActivity().getContentResolver()
                        .openInputStream(uri));
                imageView.setImageBitmap(bitmap);

            } catch (Exception e) {
                Log.d("28novV1", "e ==> " + e.toString());
            }


        } else {
            Log.d("28novV1", "Reaulte Not OK");
        }




    }

    private void imageController() {

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
                intent.setType("image/*");
//                getActivity().startActivityForResult(Intent.createChooser(intent, "Please Choose"),
//                        1);
                startActivityForResult(Intent.createChooser(intent, "Please Choose"), 1);

            }
        });
    }   // imageController

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        return view;
    }
}
