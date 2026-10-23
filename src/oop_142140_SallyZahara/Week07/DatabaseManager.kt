package oop_142140_SallyZahara.Week07


fun main() {


    println("===== LATIHAN 1: SINGLETON =====")

    DatabaseManager.connect()
    DatabaseManager.disconnect()

    val client = NetworkClient.create(
        "https://api.umn.ac.id"
    )

    client.connect()



