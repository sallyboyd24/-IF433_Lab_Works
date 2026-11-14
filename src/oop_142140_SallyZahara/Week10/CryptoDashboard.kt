package oop_142140_SallyZahara.Week10

fun main() {

    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 0.5))
    coinRepo.add(Coin("ETH", 2.0))
    coinRepo.add(Coin("USDT", 1000.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("=== CRYPTO WALLET DASHBOARD ===")
    println("Response Status: ${response.status}")

    response.data.forEach { coin ->
        println("Coin: ${coin.name}, Balance: ${coin.balance}")
    }

    val txRepo = WalletRepository<Transaction>()

    txRepo.add(Transaction("TX001", 500.0))
    txRepo.add(Transaction("TX002", 250.0))
    txRepo.add(Transaction("TX003", 1000.0))

    println("\n=== TRANSACTION HISTORY ===")

    txRepo.getAll().forEach { transaction ->
        println("ID: ${transaction.id}, Amount: ${transaction.amount}")
    }

    println("\n=== SEARCH COIN ===")

    val searchResult = coinRepo.searchByName("BTC") {
        it.name
    }

    searchResult.forEach { coin ->
        println("Found: ${coin.name}, Balance: ${coin.balance}")
    }

}