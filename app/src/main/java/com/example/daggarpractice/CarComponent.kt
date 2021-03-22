package com.example.daggarpractice

import dagger.Component

@Component
interface CarComponent {
    fun getCar(): Car
}