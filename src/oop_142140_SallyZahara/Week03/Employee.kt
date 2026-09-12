package oop_142140_SallyZahara.Week03

class Employee(val name: String) {

    private var performanceRating: Int = 3

    fun increasePerformance() {
        performanceRating++
        println("Kinerja: $name, Rating: $performanceRating")
    }

    fun printStatus() {
        println("Karyawan: $name, Rating: $performanceRating")
    }

    var salary: Int = 0
        set (value) {
            if (value < 0){
                println("ERROR: Gaji tidak boleh negatif! Di-set ke 0.")
                field = 0
            } else {
                field = value
            }

        }
}







