package UTS_142140_SallyZahara

import java.util.Scanner

fun main() {

    println("=== UMN CATERING MANAGER SYSTEM ===")
    println()
    println("[Database Setup] Adding Nasi Goreng Spesial...")

    val nasiGoreng = FoodMenu(
        name = "Nasi Goreng Spesial",
        menuCode = "nsg01",
        basePrice = -15000.0
    )

    nasiGoreng.basePrice = 25000.0

    println("[Database Setup] Price updated to Rp 25.000")
    println()

    val ayamBakar = FoodMenu(
        name = "Ayam Bakar Madu",
        menuCode = "aym02",
        basePrice = 35000.0
    )

    val esTehLemon = DrinkMenu(
        name = "Es Teh Lemon",
        menuCode = "lem01",
        basePrice = 8000.0,
        isLargeSize = true
    )

    val menuCatalog: List<CateringMenu> = listOf(
        nasiGoreng,
        ayamBakar,
        esTehLemon
    )

    val scanner = Scanner(System.`in`)

    println("--- CUSTOMER DATA INPUT ---")

    print("Enter Customer Name: ")
    val name = scanner.nextLine()

    print("Enter Phone Number: ")
    val phone = scanner.nextLine()

    print("Enter Delivery Address: ")
    val deliveryAddress = scanner.nextLine()

    val customer = Customer(
        name = name,
        phone = phone,
        deliveryAddress = deliveryAddress
    )

    val order = CateringOrder(customer)

    while (true) {

        println()
        println("--- MENU CATALOG ---")

        for (i in menuCatalog.indices) {
            println("${i + 1}. ${menuCatalog[i].name}")
        }

        println("0. [FINISH & CHECKOUT]")

        print("Select Menu Number: ")
        val menuNumber = scanner.nextInt()

        if (menuNumber == 0) {
            break
        }

        if (menuNumber >= 1 && menuNumber <= menuCatalog.size) {

            print("Enter Quantity: ")
            val quantity = scanner.nextInt()

            val selectedMenu = menuCatalog[menuNumber - 1]

            order.addMenuToOrder(
                selectedMenu,
                quantity
            )

            println("Order successfully added!")

        } else {
            println("Invalid menu number!")
        }
    }

    println()
    println("Processing Checkout...")

    order.status = OrderStatus.COOKING

    order.printInvoice()

    scanner.close()
}
