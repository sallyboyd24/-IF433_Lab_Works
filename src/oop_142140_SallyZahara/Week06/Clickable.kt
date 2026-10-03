package oop_142140_SallyZahara.Week06

interface Clickable {
    val name: String
    fun click()

    class Button(override val name: String) : Clickable {
        override fun click() {
            println("Tombol '$name' berhasil diklik!")
        }
    }
}

