package com.example.myapplication.Cars
import com.example.myapplication.Cars.CarStructure.Car
import kotlinx.coroutines.*

suspend fun MutableList<Car>.displayCars(){
    for(car in this) {
        car.printParameters()
        delay(1000)
    }
}