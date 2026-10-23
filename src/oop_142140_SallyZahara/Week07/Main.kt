package oop_142140_SallyZahara.Week07

fun main() {


    println("===== LATIHAN 1: SINGLETON =====")

    DatabaseManager.connect()
    DatabaseManager.disconnect()

    println("\n=== NETWORK CLIENT ===")
    val client = NetworkClient.create(
        "https://api.umn.ac.id"
    )

    client.connect()

    println("===== LATIHAN 2: SINGLETON =====")
    val user1 = User("Sally", 19)
    val user2 = User("Sally", 19)

    println(dataUser1)
    println(dataUser1 == dataUser2)
}