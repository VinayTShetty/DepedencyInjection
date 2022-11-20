package com.example.dependencyinjection;

import dagger.Component;

@Component
public interface CarComponent {
    /**
     *
     * We cannot pass the AppCompat activity or Base Class.
     * Should pass Current implementation Class Object.
     */
    void injectObject(MainActivity mainActivity);
}
