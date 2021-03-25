package com.example.daggarpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    //@Inject
    lateinit var car: Car

    //@Inject
    lateinit var car1: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var carComponent = (application as ExampleApp).carComponent()

        car = carComponent.getCar()

        car.start()
        car1.start()
    }
}