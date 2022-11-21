package com.example.dependencyinjection;

import dagger.Component;

@Component
public interface CarComponent {
    void InjectObject(MainActivity mainActivity);
}
