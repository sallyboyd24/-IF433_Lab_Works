package oop_142140_SallyZahara.Week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> {
            println("Monster ditemukan: ${event.monsterName}")
        }

        is BattleState.LootDropped -> {
            println("Item didapatkan: ${event.item.name}")
            println("Damage: ${event.item.damage}")
            println("Rarity: ${event.item.rarity}")
        }

        is BattleState.GameOver -> {
            println("Game Over!")
            println("Alasan: ${event.reason}")
        }

        BattleState.SafeZone -> {
            println("Pemain berada di zona aman.")
        }
    }
}