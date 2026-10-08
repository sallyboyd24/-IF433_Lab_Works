package UTS_142140_SallyZahara

import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)

    // ==========================================
    // PHASE 1: PRE-LOAD MENU DATABASE
    // ==========================================

    println("=== UMN CATERING MANAGER SYSTEM ===")
    println()

    println("[Database Setup] Adding Nasi Goreng Spesial...")

    val nasiGoreng = FoodMenu(
        "Nasi Goreng Spesial",
        "nsg01",
        0.0
    )

    nasiGoreng.basePrice = -15000.0
    nasiGoreng.basePrice = 25000.0

    println("[Database Setup] Price updated to Rp 25.000")
    println()

    val ayamBakar = FoodMenu(
        "Ayam Bakar Madu",
        "aym02",
        35000.0
    )

    val esTehLemon = DrinkMenu(
        "Es Teh Lemon",
        "lem01",
        8000.0,
        true
    )

    val menuCatalog: List<CateringMenu> = listOf(
        nasiGoreng,
        ayamBakar,
        esTehLemon
    )


    // ==========================================
    // PHASE 2: LIVE CUSTOMER INPUT
    // ==========================================

    println("--- CUSTOMER DATA INPUT ---")
    println()

    print("Enter Customer Name: ")
    val customerName = scanner.nextLine()

    print("Enter Phone Number: ")
    val customerPhone = scanner.nextLine()

    print("Enter Delivery Address: ")
    val deliveryAddress = scanner.nextLine()

    val customer = Customer(
        customerName,
        customerPhone,
        deliveryAddress
    )

    val order = CateringOrder(customer)


    // ==========================================
    // PHASE 3: LIVE ORDER INPUT LOOP
    // ==========================================

    while (true) {

        println()
        println("--- MENU CATALOG ---")
        println()

        for (i in menuCatalog.indices) {
            println("${i + 1}. ${menuCatalog[i].name}")
        }

        println()
        println("0. [FINISH & CHECKOUT]")
        println()

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

            println()
            println("Order successfully added!")

        } else {

            println()
            println("[Error] Invalid menu number!")
        }
    }


    // ==========================================
    // PHASE 4: PRINT INVOICE
    // ==========================================

    println()
    println("Processing Checkout...")

    order.status = OrderStatus.COOKING

    order.printInvoice()

    scanner.close()
}