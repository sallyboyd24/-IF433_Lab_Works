package oop_142140_SallyZahara.Week07

class NetworkClient private constructor(
    val baseUrl: String
) {
    fun connect() {
        println("Menghubungkan ke server: $baseUrl")
    }
}

