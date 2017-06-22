package com.example.tmkin.keeptalkingandnobodyexplodescompanion;

import android.app.Application;

/**
 * Created by tmkin on 6/21/2017.
 * The purpose of this class is to house all of the public variables needed to run the application
 */



class MyAppApplication extends Application {

    private String mGlobalVarValue;

    public String getGlobalVarValue() {
        return mGlobalVarValue;
    }

    public void setGlobalVarValue(String str) {
        mGlobalVarValue = str;
    }
}