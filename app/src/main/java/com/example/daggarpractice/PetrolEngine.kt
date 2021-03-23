package com.example.daggarpractice

import javax.inject.Inject

class PetrolEngine: Engine {

    @Inject
    constructor() {

    }

    override fun start() {
        System.out.println("Petrol Engine started")
    }
}