package oop_142140_SallyZahara.Week05

fun main() {

    val dosen1 = Dosen("Pak Alex", "0123456")
    val admin1 = Admin("Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")

    for (pegawai in daftarPegawai) {

        pegawai.bekerja()

        when (pegawai) {

            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }

            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }

        println("--------------------------")

        println("=== MATH HELPER ===")

        val math = MathHelper()

        println("Luas persegi: ${math.hitungLuas(5)}")
        println("Luas persegi panjang: ${math.hitungLuas(10, 5)}")
        println("Luas lingkaran: ${math.hitungLuas(7.0)}")

        println("=== TUGAS MANDIRI 2 ===")

        val eWallet = EWallet(
            accountName = "Sally",
            balance = 50000.0
        )

        val creditCard = CreditCard(
            accountName = "Sally",
            limit = 100000.0
        )

        val paymentMethods: List<PaymentMethod> = listOf(
            eWallet,
            creditCard
        )

        for (payment in paymentMethods) {

            println("Akun: ${payment.accountName}")

            payment.processPayment(75000.0)

            if (payment is EWallet) {
                println("Saldo tidak cukup, melakukan top up...")

                payment.topUp(50000.0)

                println("Mencoba pembayaran lagi...")
                payment.processPayment(75000.0)
            }

            println()
        }

    }
}


