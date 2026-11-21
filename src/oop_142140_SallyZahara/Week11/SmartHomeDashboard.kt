package oop_142140_SallyZahara.Week11

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()

    val smartLight = SmartDevice(
        name = "Philips WiZ Living Room",
        category = "Lighting"
    ).apply {
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
    }
}
