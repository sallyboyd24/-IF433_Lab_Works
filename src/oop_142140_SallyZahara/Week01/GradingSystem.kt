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
    val grade = when (score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }

    println("Grade kamu: $grade")

    println("Status: ${calculateStatus(score)}")
    val studentId: String? = null

    val idLength = studentId?.length ?: 0

println("Panjang ID: $idLength")
}

fun calculateStatus(score: Int) = if (score > 75) "Lulus" else "Tidak Lulus"