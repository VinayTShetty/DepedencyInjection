package com.example.dependencyinjection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    /**
     * Directly Injecting the Car Object to Activity
     */
   @Inject
   public Car car;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CarComponent carComponent=DaggerCarComponent.create();
        carComponent.injectObject(this);
        car.startDriving();
    }
}