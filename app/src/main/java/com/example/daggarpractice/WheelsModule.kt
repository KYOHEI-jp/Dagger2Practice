package com.example.daggarpractice

import dagger.Module
import dagger.Provides

@Module
class WheelsModule {


    @Provides
    fun providesWheels(): Wheels {
        System.out.println("Wheels module")
        return Wheels()
    }
}