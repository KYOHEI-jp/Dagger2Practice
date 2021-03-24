package com.example.daggarpractice

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
class PetrolEngineModule {

    @Provides
    fun providesPetrolEngine(powerCapacity: Int, engineCapacity: Int): Engine {
        return PetrolEngine(powerCapacity, engineCapacity)
    }

}