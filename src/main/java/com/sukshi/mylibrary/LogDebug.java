package com.sukshi.mylibrary;

import android.util.Log;

/**
 * Created by shashankpashikanti on 9/10/18.
 */

public class LogDebug {

    public static final String TAG = "shank's Log";

    public void logHere(String message) {

        Log.e(TAG, message);
    }
}
