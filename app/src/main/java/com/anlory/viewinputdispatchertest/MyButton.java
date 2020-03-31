package com.anlory.viewinputdispatchertest;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;


public  class MyButton extends androidx.appcompat.widget.AppCompatButton {
    private String TAG = "MyButton";
    MyButton(Context context){
        super(context);
    }

    public MyButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d(TAG,MainActivity.getFunc(new Exception()));
//        return false;
        return super.onTouchEvent(event);
    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.d(TAG,MainActivity.getFunc(new Exception()));
        return super.dispatchTouchEvent(event);
    }
}
