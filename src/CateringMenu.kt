package UTS_14210_SallyZahara

abstract class CateringMenu(
    val name: String,
    initialMenuCode: String,
    initialBasePrice: Double
) : IBillable {

    var basePrice: Double = 0.0
        set(value) {
            if (value >= 0) {
                field = value
            } else {
                println("[Error] Invalid price!")
            }
        }

    var menuCode: String = initialMenuCode
        set(value) {
            field = value.uppercase()
        }
        get() = "UMN-$field"

    init {
        basePrice = initialBasePrice
        menuCode = initialMenuCode
    }

    abstract override fun calculateSubtotal(quantity: Int): Double

    abstract override fun printMenuDetails(quantity: Int)
}