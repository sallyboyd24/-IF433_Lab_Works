package oop_001_johnthor.week01

fun main() {
    var name: String = "John Thor"
    var score: Int = 80

    // Concatenation gaya lama
    println("Nama: " + name + ", Nilai: " + score)
}

fun main() {
    // REFACTOR: Gunakan val dan hapus tipe data eksplisit
    val name = "John Thor"
    val score = 80

    // REFACTOR: String Template ($name)
    println("Nama: $name, Nilai: $score")
}