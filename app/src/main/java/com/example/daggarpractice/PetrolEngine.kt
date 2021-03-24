package com.example.daggarpractice

import javax.inject.Inject

class PetrolEngine: Engine {

    var powerCapacity: Int

    @Inject
    constructor(powerCapacity: Int) {
        this.powerCapacity = powerCapacity
    }
    override fun start() {
        System.out.println("Petrol Engine started: powerCapacity: " + powerCapacity)
    }
}