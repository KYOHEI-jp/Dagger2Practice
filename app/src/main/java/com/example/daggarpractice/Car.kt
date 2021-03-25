package com.example.daggarpractice

import javax.inject.Inject

class Car {
    lateinit var wheels: Wheels
    lateinit var engine: Engine
    lateinit var driver: Driver

    @Inject
    constructor(engine: Engine, driver: Driver) {
        this.engine = engine
        this.driver = driver

    }

    @Inject
    fun provideCarToRemote(remote: Remote) {
        remote.provideCar(this)
    }

    fun start() {
        System.out.println("Driver: " + driver)
//        engine.start()
//        System.out.println("driving.....")
    }
}