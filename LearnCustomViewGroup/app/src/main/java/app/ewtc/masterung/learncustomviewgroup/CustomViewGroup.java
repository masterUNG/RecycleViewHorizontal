package app.ewtc.masterung.learncustomviewgroup;

import android.content.Context;
import android.os.Build;
import android.support.annotation.AttrRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.annotation.StyleRes;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/**
 * Created by masterung on 9/1/2017 AD.
 */

public class CustomViewGroup extends FrameLayout{
    public CustomViewGroup(@NonNull Context context) {
        super(context);
        initInflate();
    }


    public CustomViewGroup(@NonNull Context context,
                           @Nullable AttributeSet attrs) {
        super(context, attrs);
        initInflate();
    }

    public CustomViewGroup(@NonNull Context context,
                           @Nullable AttributeSet attrs,
                           @AttrRes int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initInflate();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public CustomViewGroup(@NonNull Context context,
                           @Nullable AttributeSet attrs,
                           @AttrRes int defStyleAttr,
                           @StyleRes int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        initInflate();
    }


    private void initInflate() {
        inflate(getContext(), R.layout.sample_layout, this);
    }

}   // Main Class
