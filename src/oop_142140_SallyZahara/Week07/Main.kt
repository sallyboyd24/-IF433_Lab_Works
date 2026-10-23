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

    val originalUser = UserData("Sally", 19)

    val updatedUser = originalUser.copy(age = 20)

    println("Data asli: $originalUser")
    println("Data baru: $updatedUser")

    val (userName, userAge) = originalUser

    println("Nama: $userName")
    println("Umur: $userAge")

    println("===== LATIHAN 3: SINGLETON =====")

    val response: ApiResponse = ApiResponse.Loading

    val uiMessage = when (response) {
        is ApiResponse.Loading -> "Tampilkan Spinner"
        is ApiResponse.Success -> "Tampilkan data"
        is ApiResponse.Error -> "Tampilkan pesan error"
    }

    println(uiMessage)
}