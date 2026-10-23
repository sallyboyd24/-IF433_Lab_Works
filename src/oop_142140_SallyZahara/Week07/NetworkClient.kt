package oop_142140_SallyZahara.Week07

class NetworkClient private constructor(
    val baseUrl: String
) {
    fun connect() {
        println("Menghubungkan ke server: $baseUrl")
    }

    companion object {
        fun create(url: String): NetworkClient {
            return NetworkClient(url)
        }
    }
}


