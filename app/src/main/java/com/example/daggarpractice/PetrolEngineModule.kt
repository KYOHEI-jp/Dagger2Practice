package com.example.daggarpractice

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class PetrolEngineModule {

    @Binds
    abstract fun povidesPetrolEngine(petrolEngine: PetrolEngine): Engine
}