package UTS_142140_SallyZahara

abstract class CateringMenu(
    val name: String,
    menuCode: String,
    basePrice: Double
) : IBillable {

    var basePrice: Double = 0.0
        set(value) {
            if (value >= 0) {
                field = value
            } else {
                println("[Error] Invalid price!")
            }
        }

    var menuCode: String = menuCode
        set(value) {
            field = value.uppercase()
        }
        get() = "UMN-$field"

    init {
        this.basePrice = basePrice
    }

    abstract override fun calculateSubtotal(quantity: Int): Double

    abstract override fun printMenuDetails(quantity: Int)
}