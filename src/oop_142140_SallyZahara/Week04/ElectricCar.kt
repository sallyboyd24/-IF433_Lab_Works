package oop_142140_SallyZahara.Week04

open class ElectricCar(brand: String, val numberOfDoors: Int, val batteryCapacity: Int) : Vehicle(brand) {
    var nspeed: Int = 0

    fun openTrunk() {
        println("Bagasi mobil $brand dengan $numberOfDoors pintu dibuka.")
    }

    final override fun accelerate(){
        println ("$brand berakselerasi dalam sunyi. Kapasitas baterai: $batteryCapacity%.")

     fun honk(){
        println("Beep beep!")
    }

}
}