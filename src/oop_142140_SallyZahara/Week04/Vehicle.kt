package oop_142140_SallyZahara.Week04

open class Vehicle(val brand: String) {
    var speed: Int = 0

    open fun accelerate() {
        speed += 10
        println("$brand melaju. Kecepatan: $speed km/jam")
    }

    open fun hook(){
        println("Beep beep!")
    }
}