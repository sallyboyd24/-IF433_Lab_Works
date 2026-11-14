package oop_142140_SallyZahara.Week10


fun isAnagram(word1: String, word2: String): Boolean {
    val first = word1.lowercase().replace(" ", "")
    val second = word2.lowercase().replace(" ", "")

    return first.toCharArray().sorted() ==
            second.toCharArray().sorted()
}

fun main() {
    println("=== PROGRAM ANAGRAM TANPA GENERIC ===")

    print("Masukkan kata pertama: ")
    val word1 = readLine()!!

    print("Masukkan kata kedua: ")
    val word2 = readLine()!!

    if (isAnagram(word1, word2)) {
        println("$word1 dan $word2 adalah Anagram")
    } else {
        println("$word1 dan $word2 bukan Anagram")
    }
}
