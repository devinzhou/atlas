package com.taobao.secondbundle;

import android.app.Application;
import android.widget.Toast;

public class SecondApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Toast.makeText(getBaseContext(), "enter second application", Toast.LENGTH_LONG).show();
    }
}
