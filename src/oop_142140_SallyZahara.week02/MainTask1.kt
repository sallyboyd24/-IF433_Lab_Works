package oop_142140_SallyZahara.week02
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Masukkan judul buku: ")
    val bookTitle = scanner.nextLine()

    print("Masukkan nama peminjam: ")
    val borrower = scanner.nextLine()

    print("Masukkan lama pinjam (hari): ")
    val inputDuration = scanner.nextInt()

    val duration = if (inputDuration < 0) {
        1
    } else {
        inputDuration
    }

    val loan = Loan(bookTitle, borrower, duration)

    println("\n=== DETAIL PEMINJAMAN ===")
    println("Judul Buku   : ${loan.bookTitle}")
    println("Peminjam     : ${loan.borrower}")
    println("Lama Pinjam  : ${loan.loanDuration} hari")
    println("Total Denda  : Rp${loan.calculateFine()}")

    scanner.close()
}
