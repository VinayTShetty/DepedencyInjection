package com.example.dependencyinjection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
   public Car carObject;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CarComponent carComponent=DaggerCarComponent.create();
        /**
         * Inject component directly into the Activity
         */
        carComponent.InjectObject(this);
        carObject.driveCar();

    }
}