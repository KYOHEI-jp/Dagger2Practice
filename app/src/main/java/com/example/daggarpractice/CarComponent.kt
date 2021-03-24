package com.example.daggarpractice

import dagger.BindsInstance
import dagger.Component

@Component(modules = [PetrolEngineModule::class, WheelsModule::class])
interface CarComponent {
    fun getCar(): Car

    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun powerCapacity(powerCapacity: Int): Builder

        fun build(): CarComponent
    }
}