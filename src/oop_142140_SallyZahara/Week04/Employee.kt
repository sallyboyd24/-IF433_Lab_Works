package oop_142140_SallyZahara.Week04

open class Employee(val name: String, val baseSalary: Int) {

    open fun work() {
        println("$name sedang bekerja.")
    }

    open fun calculateBonus(): Int {
        return (baseSalary * 0.1).toInt() // Bonus standar 10% dari gaji pokok
    }
}