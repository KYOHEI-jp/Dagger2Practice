package com.example.daggarpractice

import javax.inject.Inject

class PetrolEngine: Engine {

    var powerCapacity: Int
    var engineCapacity: Int

    @Inject
    constructor(powerCapacity: Int, engineCapacity: Int) {
        this.powerCapacity = powerCapacity
        this.engineCapacity = engineCapacity
    }
    override fun start() {
        System.out.println("Petrol Engine started: powerCapacity: " + powerCapacity + " engineCapacity: " + engineCapacity)
    }
}