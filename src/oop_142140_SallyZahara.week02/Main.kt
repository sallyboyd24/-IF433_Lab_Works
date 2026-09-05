package ` oop_142140_SallyZahara`.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(source =  System.'in')

    println("--- APLIKASI PMB UMN ---")

    print("Masukkan Nama:")
    val name = scanner.nextline()

    print("Masukkan NIM (Wajib 5 Karakter); ")
    val nim = scanner.next()

    scanner.nextline()

    if (nim.length != 5){
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")

    } else {
        print("Masukkan Jurusan: ")
        val major = scanner.nextline()

        val s1 = Student(name, nim, major)
        println("Status: Pendaftaran Selesai.")
    }
}

constructor(name: String, nim: String) : this(name, nim, major = "Non-Matriculated") {
    println("LOG: Menggunakan constructor jalur umum (Tanpa Jurusan).")
}
