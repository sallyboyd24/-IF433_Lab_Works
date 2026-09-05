package ` oop_142140_SallyZahara`.week02

class Student (
    val name: String,
    val nim: String,
    var major: String,
    var gpa: Double = 0.0
){

}
class Student (val name: String, val nim: String, var major: String, var nim: Double = 0.0)
init {
    if (nim.length != 5) {
        println("WARNING: Objek tercipta dengan NIM ($nim) yang tidak valid!")
        println("Data mahasiswa $name mungkin akan bermasalah di sistem.")
    } else {
        println("LOG: Objek Student $name berhasil dialokasikan di Memory.")
    }
}
