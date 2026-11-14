package oop_142140_SallyZahara.Week10

fun main() {
    println("=== TEST FENERIC CLASS ===")
    val intBox= Box(100)
    val stringBox = Box("Generics in Kotlin")

    println("Isi intBox: ${intBox.value}")
    println("Isi stringBox: ${stringBox.value}")
}