package com.example.myapplication.Cars.CarStructure

import com.example.myapplication.Cars.CarStructure.Car

class TrunkCar (override val name: String, override val releaseDate: Int, override val enginePower: Int, val loadCapacity: Int,
                override val color: String
) : Car() {
    /*override fun beep() {
        println("TrunkCar гудит")
    }*/

    override fun gainSpeed() =
        println("TrunkCar набирает скорость!")
}