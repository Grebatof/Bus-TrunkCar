package com.example.myapplication.Cars.CarStructure

import com.example.myapplication.Cars.CarStructure.Car

class Bus (override val name: String, override val releaseDate: Int, override val enginePower: Int,
           override val color: String
) : Car() {
    val numberOfSeats: Int by lazy {
        5
    }

    override fun beep() =
        println("Bus гудит")

    override fun gainSpeed() =
        println("Bus набирает скорость!")
}
