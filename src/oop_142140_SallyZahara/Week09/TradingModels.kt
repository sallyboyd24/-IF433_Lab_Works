package oop_142140_SallyZahara.Week09

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 145.50, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 10, -25.30, "OPEN"),
        TradeLog("ETHUSDT", "LONG", 50, 320.10, "OPEN"),
        TradeLog("ETHUSDT", "SHORT", 25, -65.40, "CLOSED"),
        TradeLog("BTCUSDT", "LONG", 5, 12.80, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 15, -15.20, "OPEN")
    )

    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }

    val losingTrades = closedTrades.filter { it.roe <= 0 }

    println("=== DAFTAR LOSING TRADES (CLOSED & PROFIT) ===")
    losingTrades.forEach { trade ->
        println("Pair: ${trade.pair} | Posisi: ${trade.position} | Leverage: ${trade.leverage}x | ROE: +${trade.roe}% | Status: ${trade.status}")
    }
}

data class TradeLog(
    val pair: String,
    val position: String,
    val leverage: Int,
    val roe: Double,
    val status: String
)