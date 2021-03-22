package com.example.daggarpractice

import javax.inject.Inject

class Car {
    lateinit var wheels: Wheels
    lateinit var engine: Engine


    @Inject
    constructor(wheels: Wheels, engine: Engine) {
        this.wheels = wheels
        this.engine = engine
    }

    fun start() {
        System.out.println("driving.....")
    }
}