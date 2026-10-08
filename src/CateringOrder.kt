package UTS_142140_SallyZahara

class CateringOrder(
    val customer: Customer
) {

    var status: OrderStatus = OrderStatus.WAITING_LIST

    private val orderItems: MutableList<Pair<CateringMenu, Int>> =
        mutableListOf()

    fun addMenuToOrder(menu: CateringMenu, qty: Int) {
        orderItems.add(Pair(menu, qty))
    }

    fun printInvoice() {
        println()
        println("================ INVOICE ================")
        println()
        println("Customer: ${customer.name} (${customer.phone})")
        println("Delivery Address: ${customer.deliveryAddress}")
        println()
        println("Order Status: $status")
        println()

        var grandTotal = 0.0

        for ((index, item) in orderItems.withIndex()) {
            val menu = item.first
            val quantity = item.second

            if (menu is FoodMenu) {
                println("${index + 1}. [FOOD] ${menu.menuCode} - ${menu.name}")
            } else if (menu is DrinkMenu) {
                val size = if (menu.isLargeSize) "Large" else "Regular"
                println("${index + 1}. [DRINK] ${menu.menuCode} - ${menu.name} ($size)")
            }

            menu.printMenuDetails(quantity)

            grandTotal += menu.calculateSubtotal(quantity)

            println()
        }

        println("-----------------------------------------")
        println()
        println("GRAND TOTAL: Rp ${"%,.0f".format(grandTotal)}")
        println()
        println("=========================================")
    }
}