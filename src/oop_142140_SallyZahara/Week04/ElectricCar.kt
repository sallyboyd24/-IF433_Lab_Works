package oop_142140_SallyZahara.Week04

open class ElectricCar(brand: String, val numberOfDoors: Int, val batteryCapacity: Int) : Vehicle(brand) {
    var speed: Int = 0

    final override fun accelerate(){
        println ("$brand berakselerasi dalam sunyi. Kapasitas baterai: $batteryCapacity%.")

    open fun hook(){
        println("Beep beep!")
    }
}
}