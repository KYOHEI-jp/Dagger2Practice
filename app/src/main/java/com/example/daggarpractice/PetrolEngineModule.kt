package com.example.daggarpractice

import dagger.Module
import dagger.Provides

@Module
class PetrolEngineModule {

    @Provides
    fun povidesPetrolEngine(petrolEngine: PetrolEngine): Engine {
        return petrolEngine
    }

}