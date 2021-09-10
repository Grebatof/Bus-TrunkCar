package com.example.myapplication.Cars

import com.example.myapplication.Cars.CarStructure.Bus
import com.example.myapplication.Cars.CarStructure.Car

inline fun <reified T>MutableList<Car>.filterCarsByTypes(): MutableList<Car> =
    this.filter{car -> car is T }.toMutableList()

fun MutableList<Car>.filterCarsByPowerMoreThan(power: Int): MutableList<Car> =
    this.filter{car -> car.enginePower >= power}.toMutableList()

fun MutableList<Car>.sortCarsByPowerInBigWay(power: Int): MutableList<Car> =
    this.sortedWith(compareBy<Car> { it.enginePower }).toMutableList()