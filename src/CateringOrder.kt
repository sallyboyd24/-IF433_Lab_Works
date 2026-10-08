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
        var number = 1

        for ((menu, quantity) in orderItems) {
            print("$number. ")
            menu.printMenuDetails(quantity)

            grandTotal += menu.calculateSubtotal(quantity)
            number++
        }

        println("-----------------------------------------")
        println()
        println("GRAND TOTAL: Rp ${"%,.0f".format(grandTotal)}")
        println()
        println("=========================================")
    }
}