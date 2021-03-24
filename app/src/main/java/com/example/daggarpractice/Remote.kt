package com.example.daggarpractice

import javax.inject.Inject

class Remote {
    lateinit var car: Car

    @Inject
    constructor() {

    }
    fun provideCar(car: Car) {
        System.out.println("providing car to remote")
        this.car = car
    }
}