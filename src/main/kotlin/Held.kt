open class Held(var name: String, var hp: Int) {

    var schutzzauberAktiv = false


    open fun angriff(ziel: Gegner, schadenswert: Int) {
        ziel.hp -= schadenswert
        println("$name greift ${ziel.name} an und verursacht $schadenswert Schaden!")
    }


    open fun heilung(HEILUNGWERT: Int) {
        hp += HEILUNGWERT
        println("$name heilt sich um $HEILUNGWERT.")
    }

    open fun verteidigungsSchild() {
        schutzzauberAktiv = true
        println("$name aktiviert einen Schutzzauber.")
    }


    open fun bonusAngriff(ziel: Gegner, bonusSchadenswert: Int) {
        ziel.hp -= bonusSchadenswert
        println("$name greift ${ziel.name} an und verursacht $bonusSchadenswert Schaden!")
    }
}