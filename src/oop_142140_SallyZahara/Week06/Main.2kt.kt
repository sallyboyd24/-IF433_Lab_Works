package oop_142140_SallyZahara.Week06

fun main() {

    val lamp = SmartLamp(
        "L001",
        "Ruang Tamu"
    )

    val speaker = SmartSpeaker(
        "S001",
        "Google Nest Dapur"
    )

    val cctv = SmartCCTV(
        "C001",
        "Ezviz Garasi"
    )

    val hub = SmartHomeHub()

    hub.addDevice(lamp)
    hub.addDevice(speaker)
    hub.addDevice(cctv)

    println("=== SECURITY MODE ===")
    hub.activateSecurityMode()

    println()

    println("=== TURN OFF ALL SWITCHES ===")
    hub.turnOffAllSwitches()
}