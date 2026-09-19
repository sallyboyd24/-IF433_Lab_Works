package oop_142140_SallyZahara.Week04

class Manager(name: String, baseSalary: Int) : Employee(name, baseSalary) {

    override fun work() {
        println("$name sedang memimpin rapat divisi.")
    }

    override fun calculateBonus(): Int {
        // Bonus standar dari parent ditambah Rp 500.000
        return super.calculateBonus() + 500000
    }
}