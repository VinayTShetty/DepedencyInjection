package com.example.dependencyinjection;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    public static final String TAG = Car.class.getSimpleName();
    public Wheels wheels;
    @Inject
    public Engine engine;

    @Inject
    public Car(Wheels wheels) {
        this.wheels = wheels;
    }

    public void driveCar() {
        Log.d(TAG, "Car is Driving");
    }

    /**
     * Method Injection
     * In this Mehtod , Object of Remote is Injected.
     * 1) Frist Constructor Injection will be completed.
     * 2) Next Filed Injection will be completed.i.e Engine Object
     * 3) Method injection will be completed.
     *
     * Note:-
     * This method will be executed automatically from dagger.
     * In this method Its possible to use 'remote.CarRemoteConnectes(this)' inside the constructor only.
     * But the constructor Object will not be fully completed to use it.So Using it inside the method.
     */
    @Inject
    public void ConnectRemote(Remote remote) {
        remote.CarRemoteConnectes(this);
    }
}
