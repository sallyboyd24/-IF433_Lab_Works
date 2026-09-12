package oop_142140_SallyZahara.Week03
fun main(){
    val e = Employee("Budi")

    e.salary = -1000
    e.salary = 500000
    println("Gaji: ${e.salary}")

    e.increasePerformance()
}