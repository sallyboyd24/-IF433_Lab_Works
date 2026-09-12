package week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("=== MINI RPG BATTLE ===")

    print("Masukkan nama Hero: ")
    val name = scanner.nextLine()

    print("Masukkan Base Damage: ")
    val baseDamage = scanner.nextInt()

    val hero = Hero(name, baseDamage)

    var enemyHp = 100

    println("\nPertarungan dimulai!")
    println("HP Hero  : ${hero.hp}")
    println("HP Enemy : $enemyHp")

    while (hero.isAlive() && enemyHp > 0) {

        println("\n=== MENU ===")
        println("1. Serang")
        println("2. Kabur")
        print("Pilih: ")

        val choice = scanner.nextInt()

        if (choice == 1) {

            hero.attack("Enemy")

            enemyHp -= hero.baseDamage

            if (enemyHp < 0) {
                enemyHp = 0
            }

            println("HP Enemy: $enemyHp")

            if (enemyHp > 0) {
                val enemyDamage = (10..20).random()

                println("Enemy menyerang balik!")
                println("Damage Enemy: $enemyDamage")

                hero.takeDamage(enemyDamage)

                println("HP Hero: ${hero.hp}")
            }

        } else if (choice == 2) {

            println("$name memilih untuk kabur.")
            break

        } else {

            println("Pilihan tidak valid.")
        }
    }

    println("\n=== HASIL PERTARUNGAN ===")

    if (!hero.isAlive()) {
        println("Enemy menang!")
    } else if (enemyHp <= 0) {
        println("$name menang!")
    } else {
        println("$name kabur dari pertarungan.")
    }

    scanner.close()
}
