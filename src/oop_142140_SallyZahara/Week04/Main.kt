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
    val myEV = ElectricCar( brand = "Tesla", numberOfDoors = 4, batteryCapacity = 100 )
    myEV.accelerate()
    myEV.honk()
    myEV.openTrunk()

    println("\n--- Testing Employee Hierarchy (Task 2) ---")
    val manager = Manager(name = "Budi", baseSalary = 8000000)
    manager.work()
    println("Bonus ${manager.name}: Rp ${manager.calculateBonus()}")

    val developer = Developer(name = "Ani", baseSalary = 6000000, programmingLanguage = "Kotlin")
    developer.work()
    println("Bonus ${developer.name}: Rp ${developer.calculateBonus()}")
}



}