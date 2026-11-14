package oop_142140_SallyZahara.Week10


fun <T> isAnagram(value1: T, value2: T): Boolean {
    val first = value1.toString()
        .lowercase()
        .replace(" ", "")

    val second = value2.toString()
        .lowercase()
        .replace(" ", "")

    return first.toCharArray().sorted() ==
            second.toCharArray().sorted()
}

fun main() {
    println("=== PROGRAM ANAGRAM DENGAN GENERIC ===")

    print("Masukkan kata pertama: ")
    val word1 = readLine()!!

    print("Masukkan kata kedua: ")
    val word2 = readLine()!!

    if (isAnagram(word1, word2)) {
        println("$word1 dan $word2 adalah Anagram")
    } else {
        println("$word1 dan $word2 bukan Anagram")
    }

    println("\n=== CONTOH GENERIC LAIN ===")
    println(isAnagram(123, 321))
    println(isAnagram("Dormitory", "Dirty room"))
}
