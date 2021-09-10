package com.example.myapplication.Cars.CarStructure

abstract class Car : CarInterface {
    abstract val name: String
    abstract val releaseDate: Int
    abstract val enginePower: Int
    abstract val color: String
    fun printParameters() =
        println("$name + $color + $enginePower")
}
