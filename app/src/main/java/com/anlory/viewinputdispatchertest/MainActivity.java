package com.anlory.viewinputdispatchertest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.mybutton).setOnTouchListener(new View.OnTouchListener() {
                                                           @Override
                                                           public boolean onTouch(View v, MotionEvent event) {
                                                               Log.d(TAG,getFunc(new Exception()));
                                                               return false;
                                                           }
                                                       }
        );
        findViewById(R.id.mybutton).setOnClickListener(new View.OnClickListener() {
                                                           @Override
                                                           public void onClick(View v) {
                                                               Log.d(TAG,getFunc(new Exception()));
                                                           }
                                                       }
        );

    }





    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.d(TAG,getFunc(new Exception()));
        return super.dispatchTouchEvent(ev);
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d(TAG,getFunc(new Exception()));
        //Thread.dumpStack();
        return super.onTouchEvent(event);
    }



    //获取行号
    public static String getFunc(Exception e){
         StackTraceElement[] trace =e.getStackTrace();
         if(trace==null||trace.length==0)
            return "";
        return   trace[0].getMethodName() + "  " + trace[0].getLineNumber();
    }



}
