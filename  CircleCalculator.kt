package oop_001_johnthor.week01

fun main() {
    val radius : Double  = 7.0
    val pi : Double = 3.14
    val area: Double = pi * radius * radius

    println("Radius: " + radius + ", Area: " + area)
    checkSize(area)
}

fun checkSize(area: Double) {
    if (area > 100) {
       println "This is a Big Circle"
    } else {
        println "This is a Small Circle"
    }
}