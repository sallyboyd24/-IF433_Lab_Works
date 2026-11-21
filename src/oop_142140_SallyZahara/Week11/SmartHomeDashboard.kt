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

    val acUnit = SmartDevice(
        "Daikin Inverter (Kabel 3x2.5)",
        "HVAC",
        false,
        800
    ).run {
        this
    }

    homeDevices.add(acUnit)

    homeDevices.add(
        SmartDevice("Picolo's Auto Feeder", "Pet Care", true, 10)
    )
}
