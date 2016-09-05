package com.example.xiaoqingdu.logcatactivitytest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static String TAG = "LIFTCYCLE";
    @Override  //完全生命周期开始时被调用，初始化Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "(1) onCreate()");
    }

    @Override  //可视生命周期开始时被调用，对用户界面进行必要的更改
    public void onStart() {
        super.onStart();
        Log.i(TAG, "(2) onStart()");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "(2) onStop()");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "(2) onResume()");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "(2) onRestart()");
    }
}
