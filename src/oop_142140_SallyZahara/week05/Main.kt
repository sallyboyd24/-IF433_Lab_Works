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

    }
}


