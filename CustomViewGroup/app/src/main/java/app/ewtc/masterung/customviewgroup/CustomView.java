package app.ewtc.masterung.customviewgroup;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by masterung on 9/14/2017 AD.
 */

public class CustomView extends View{

    //Explicit
    private boolean isBlue = false;

    public CustomView(Context context) {
        super(context);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initialAttr(attrs, 0, 0);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initialAttr(attrs, defStyleAttr, 0);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        initialAttr(attrs, defStyleAttr, defStyleRes);
    }

    private void initialAttr(AttributeSet attributeSet, int defStyleAttr, int defStyleRes) {
        TypedArray typedArray = getContext().getTheme().obtainStyledAttributes(
                attributeSet,
                R.styleable.CustomView,
                defStyleAttr,
                defStyleRes
        );
        try {

            isBlue = typedArray.getBoolean(R.styleable.CustomView_isBlue, false);

        }finally {
            typedArray.recycle();
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();

        if (isBlue) {
            paint.setColor(Color.BLUE);
        } else {
            paint.setColor(Color.RED);
        }

        canvas.drawLine(0, 0, getMeasuredWidth(), getMeasuredHeight(), paint);
    }
}
