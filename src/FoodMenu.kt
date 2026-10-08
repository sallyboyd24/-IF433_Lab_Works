package UTS_142140_SallyZahara

class FoodMenu(
    name: String,
    menuCode: String,
    basePrice: Double,
    val packagingFee: Double = 3000.0
) : CateringMenu(name, menuCode, basePrice) {

    override fun calculateSubtotal(quantity: Int): Double {
        return (basePrice + packagingFee) * quantity
    }

    override fun printMenuDetails(quantity: Int) {
        println(
            "[FOOD] $menuCode - $name"
        )
        println(
            "  Qty: $quantity portions | Subtotal: Rp ${"%,.0f".format(calculateSubtotal(quantity))}"
        )
    }
}