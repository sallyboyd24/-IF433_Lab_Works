package oop_142140_SallyZahara.Week09

fun main() {

    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 145.50, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 10, -25.30, "OPEN"),
        TradeLog("ETHUSDT", "LONG", 50, 320.10, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 25, -65.40, "CLOSED"),
        TradeLog("BTCUSDT", "LONG", 5, 12.80, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 15, -15.20, "CLOSED")
    )


    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
    val winningTrades = closedTrades.filter { it.roe > 0 }
    val losingTrades = closedTrades.filter { it.roe <= 0 }

    val topPerformersString = winningTrades
        .sortedByDescending { it.roe }
        .map { "WIN [${it.pair} - ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)" }

    val worstPerformersString = losingTrades
        .sortedBy { it.roe }
        .map { "LOSS [${it.pair} - ${it.position}]: ${it.roe}% ROE (Lev: ${it.leverage}x)" }

    val uniquePairs = tradeHistory.map { it.pair }.toSet()

    println("=== CRYPTO TRADING DASHBOARD ===")

    println("\nTop Performers (Profit):")
    topPerformersString.forEach { println(it) }

    println("\nWorst Performers (Loss):")
    worstPerformersString.forEach { lossBaris ->
        println(lossBaris)
    }

    println("\nUnique Traded Pairs:")
    println(uniquePairs)
}


data class TradeLog(
    val pair: String,
    val position: String,
    val leverage: Int,
    val roe: Double,
    val status: String
)