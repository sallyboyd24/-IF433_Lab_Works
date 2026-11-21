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

    SmartDevice("Ezviz Outdoor", "Camera")
        .apply {
            isOnline = true
            powerLoad = 5
        }.also {
            println("(LOG) Kamera terhubung")
            homeDevices.add(it)
        }
}
