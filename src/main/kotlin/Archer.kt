class Archer(name: String) : Held(name, 750) {

    fun angriffArcher(ziel: Gegner) {
        angriff(ziel, SCHADENSWERT + 20)

    }

    fun heilzauberArcher() {
        heilung(HEILUNGSWERT + 15)

    }

    override fun verteidigungsSchild() {
        super.verteidigungsSchild()

    }

    fun bonusSchadenArcher(ziel: Gegner) {
        bonusAngriff(ziel, BONUSSCHADENSWERT + 75)

    }
    fun aktionAussuchenBarbar () {
        println(MENÜ)
        var auswahl = readln()
        when (auswahl) {
            "1" -> {
                angriffArcher(GEGNER)
            }

            "2" -> {
                heilzauberArcher()
            }

            "3" -> {
                verteidigungsSchild()
            }

            "4" -> {
                bonusSchadenArcher(GEGNER)
            }
        }
    }
}