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

    val uniquePairs = tradeHistory
        .map { it.pair }
        .toSet()

    println("=== PASANGAN KOIN YANG PERNAH DITRADINGKAN ===")
    uniquePairs.forEach { pair ->
        println("- $pair")
    }
}

data class TradeLog(
    val pair: String,
    val position: String,
    val leverage: Int,
    val roe: Double,
    val status: String
)