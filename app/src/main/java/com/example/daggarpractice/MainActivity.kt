package com.example.daggarpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var carComponent = DaggerCarComponent.builder()
            .petrolEngineModule(PetrolEngineModule(300))
            .build()
        carComponent.inject(this)
        car.start()
    }
}