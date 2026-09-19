package oop_142140_SallyZahara.Week03

class Weapon(val name: String){
    var Damage: Int = 0
        set(value) {
            if (value < 0){
                println("DAMAGE TIDAK BOLEH NEGATIF TOLONGGGG!!!")
                field = 0
            }else if (value > 1000){
                field = 1000
            }else{
                field = value
            }
        }
    val tier: String
        get() {

            if (Damage > 800) {
                return "Legendary"
            } else if (Damage > 500) {
                return "Epic"
            } else {
                return "Common"
            }
        }
}