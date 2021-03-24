package com.example.daggarpractice

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
class PetrolEngineModule {

    var powerCapacity: Int
    constructor(powerCapacity: Int) {
        this.powerCapacity = powerCapacity
    }
    @Provides
    fun povidesPetrolEngine(): Engine {
        return PetrolEngine(powerCapacity)
    }
}