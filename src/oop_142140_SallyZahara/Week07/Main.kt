
package oop_142140_SallyZahara.Week07

fun main() {


    println("===== LATIHAN 1: SINGLETON =====")

    DatabaseManager.connect()
    DatabaseManager.disconnect()

    val client = NetworkClient.create(
        "https://api.umn.ac.id"
    )
    client.connect()


    println("\n===== LATIHAN 2: REGULAR CLASS =====")

    val user1 = User("Sally", 19)
    val user2 = User("Sally", 19)

    println(user1)
    println("Apakah sama? ${user1 == user2}")


    println("\n===== LATIHAN 2: DATA CLASS =====")

    val dataUser1 = UserData("Sally", 19)
    val dataUser2 = UserData("Sally", 19)

    println(dataUser1)
    println("Apakah sama? ${dataUser1 == dataUser2}")

    val updatedUser = dataUser1.copy(age = 20)

    println("Data asli: $dataUser1")
    println("Data baru: $updatedUser")

    val (userName, userAge) = dataUser1

    println("Nama: $userName")
    println("Umur: $userAge")


    println("\n===== LATIHAN 3: ENUM =====")

    val appState = AppState.LOADING
    println("App State: $appState")

    println("\n===== LATIHAN 3: SEALED CLASS =====")

    val responses = listOf<ApiResponse>(
        ApiResponse.Loading,
        ApiResponse.Success("Data mahasiswa berhasil dimuat"),
        ApiResponse.Error("Koneksi gagal")
    )

    for (response in responses) {
        val uiMessage = when (response) {
            is ApiResponse.Loading ->
                "Tampilkan Spinner"

            is ApiResponse.Success ->
                "Tampilkan data: ${response.data}"

            is ApiResponse.Error ->
                "Tampilkan pesan error: ${response.message}"
        }

        println(uiMessage)
    }

    println("\n===== RPG GAME ENGINE =====")

    GameManager.startGame()
    GameManager.startGame()

    println("\n===== ITEM RARITY =====")

    println(
        "Legendary Drop Chance: " +
                "${ItemRarity.LEGENDARY.dropChance}%"
    )


    println("\n===== WEAPON FACTORY =====")

    val starterSword = Weapon.forgeStarterSword()
    val epicSword = Weapon.forgeEpicSword()

    println("Senjata awal:")
    println("Nama: ${starterSword.item.name}")
    println("Damage: ${starterSword.item.damage}")
    println("Rarity: ${starterSword.item.rarity}")
    println("Durability: ${starterSword.durability}")

    println("\nSenjata EPIC:")
    println("Nama: ${epicSword.item.name}")
    println("Damage: ${epicSword.item.damage}")
    println("Rarity: ${epicSword.item.rarity}")
    println("Durability: ${epicSword.durability}")


    // Data Class copy(): Upgrade senjata
    println("\n===== BLACKSMITH UPGRADE =====")

    val upgradedItem = starterSword.item.copy(
        damage = 25
    )

    println("Senjata sebelum upgrade:")
    println(starterSword.item)

    println("Senjata setelah upgrade:")
    println(upgradedItem)


    // Sealed Class: Battle Events
    println("\n===== BATTLE EVENTS =====")

    processEvent(BattleState.SafeZone)

    processEvent(
        BattleState.MonsterEncounter("Goblin Nakal")
    )

    processEvent(
        BattleState.LootDropped(upgradedItem)
    )

    processEvent(
        BattleState.GameOver("Terkena jebakan racun")
    )


    println("\n===== PROGRAM SELESAI =====")
}

class User(string: String, i: Int) {

}
