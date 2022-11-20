package com.example.dependencyinjection;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = Car.class.getSimpleName();
    public Wheels wheels;
    public Engine engine;
    @Inject
    public Car(Wheels wheels, Engine engine) {
        this.wheels = wheels;
        this.engine = engine;
    }

    public void startDriving(){
        Log.d(TAG, "Car is Driving On Filed");
    }
}
