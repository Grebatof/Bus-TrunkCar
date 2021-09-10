package com.example.myapplication.Cars

import com.example.myapplication.Cars.CarStructure.Bus
import com.example.myapplication.Cars.CarStructure.Car

fun MutableList<Car>.sortCarsByTypes(): MutableList<Car> =
    this.filter{car -> car is Bus }.toMutableList()


fun MutableList<Car>.sortCarsByPower(power: Int): MutableList<Car> =
    this.filter{car -> car.enginePower >= power}.toMutableList()
