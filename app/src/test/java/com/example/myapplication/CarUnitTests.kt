package com.example.myapplication

import com.example.myapplication.Cars.*
import com.example.myapplication.Cars.CarStructure.Bus
import com.example.myapplication.Cars.CarStructure.Car
import com.example.myapplication.Cars.CarStructure.TrunkCar
import kotlinx.coroutines.*
import org.junit.Assert
import org.junit.Test

class CarUnitTests {
    @Test
    fun crashTest() = runBlocking {
        val bus1 = Bus(
            "Bus0.1",
            1998,
            100,
            "grey"
        )
        val bus2 = Bus(
            "Bus0.4",
            1999,
            200,
            "grey"
        )
        val bus3 = Bus(
            "Bus0.6",
            2001,
            300,
            "grey"
        )
        val bus4 = Bus(
            "Bus0.8",
            2002,
            350,
            "blue"
        )
        val bus5 = Bus(
            "Bus0.8",
            2003,
            450,
            "green"
        )
        val trunkCar1 = TrunkCar(
            "TrunkCar0.4",
            2000,
            200,
            400,
            "grey"
        )
        val trunkCar2 = TrunkCar(
            "TrunkCar0.8",
            2003,
            400,
            500,
            "grey"
        )

        var cars = mutableListOf<Car>()

        cars.add(bus1)
        cars.add(bus2)
        cars.add(bus3)
        cars.add(bus4)
        cars.add(bus5)
        cars.add(trunkCar1)
        cars.add(trunkCar2)

        cars.displayCars()

        bus1.beep()

        Assert.assertEquals(4, 2 + 2)

        cars = cars.sortCarsByPowerInBigWay(250)
        cars.displayCars()
        cars = cars.filterCarsByTypes<Bus>()
        cars.displayCars()
        cars = cars.filterCarsByPowerMoreThan(300)

        cars.displayCars()
    }
}