package oop_142140_SallyZahara.Week06

class SmartSpeaker(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    override fun turnOn() {
        println("$name menyala.")
    }

    override fun turnOff() {
        println("$name mati.")
    }

    fun playMusic(song: String) {
        println("Memutar lagu $song dari Spotify.")
    }
}