package oop_142140_SallyZahara.Week04

fun main(){
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle( brand = "Sepeda Onthel" )
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car(brand = "Toyota", numberOfDoors = 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("---Electric Car---")
    val ElectricCar = ElectricCar( brand = "Tesla", numberOfDoors = 4, batteryCapacity = 100 )

    myCar.accelerate()
    myCar.hook()
}