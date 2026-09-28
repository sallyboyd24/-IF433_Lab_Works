package oop_142140_SallyZahara.Week05


abstract class PaymentMethod(val accountName: String) {

    abstract fun processPayment(amount: Double)
}