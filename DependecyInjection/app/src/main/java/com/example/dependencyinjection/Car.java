package com.example.dependencyinjection;

import android.util.Log;
import javax.inject.Inject;


public class Car {
    private static final String TAG = Car.class.getSimpleName();
    public Engine engine;
    public Wheels wheels;

    @Inject
    public Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    public void driveCar(){
        Log.d(TAG, "Car is Driving");
    }

}
