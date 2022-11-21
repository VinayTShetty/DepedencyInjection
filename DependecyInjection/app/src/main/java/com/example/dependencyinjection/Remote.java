package com.example.dependencyinjection;

import android.util.Log;

import javax.inject.Inject;

public class Remote {
    private static final String TAG = Remote.class.getSimpleName();
    @Inject
    public Remote() {

    }

    public void CarRemoteConnectes(Car car) {
        Log.d(TAG, "CarRemoteConnectes: And Driving");
    }
}
