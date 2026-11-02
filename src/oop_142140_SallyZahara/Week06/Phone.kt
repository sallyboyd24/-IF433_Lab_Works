package oop_142140_SallyZahara.Week06

interface Phone {
    fun turnOn()
}

open class Camera {
    open fun turnOn() {
        println("Camera berhasil dinyalakan.")
    }
}

class Smartphone : notCamera, Phone {
    override fun turnOn() {
        super<notCamera>.turnOn()
        println("Sistem operasi Smartphone berhasil booting.")
    }
}
