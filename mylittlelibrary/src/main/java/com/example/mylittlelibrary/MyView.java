package com.example.mylittlelibrary;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/**
 * Created by mazab on 07/04/2018.
 */

public class MyView extends LinearLayout {


    public MyView(Context context) {
        super(context);
        initialize(context);
    }

    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initialize(context);
    }

    private void initialize(Context context){
        inflate(context, R.layout.my_view, this);
    }

}
