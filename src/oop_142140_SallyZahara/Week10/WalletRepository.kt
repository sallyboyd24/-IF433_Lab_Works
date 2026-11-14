package oop_142140_SallyZahara.Week10

class WalletRepository<T> {

    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }

    fun searchByName(
        query: String,
        getName: (T) -> String
    ): List<T> {
        return items.filter {
            getName(it).contains(query, ignoreCase = true)
        }
    }
}