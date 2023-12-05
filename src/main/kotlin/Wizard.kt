class Wizard (name: String) : Held(name, 850) {

    fun angriffWizard(ziel: Gegner) {
        angriff(ziel, SCHADENSWERT + 30)

    }

    fun heilzauberWizard() {
        heilung(HEILUNGSWERT + 10)

    }

    override fun verteidigungsSchild() {
        verteidigungsSchild()

    }

    fun bonusSchadenWizard(ziel: Gegner) {
        bonusAngriff(ziel, BONUSSCHADENSWERT + 100)

    }

    fun aktionAussuchenWizard() {
        println(MENÜ)
        var auswahl = readln()
        when (auswahl) {
            "1" -> {
                angriffWizard(GEGNER)
            }

            "2" -> {
                heilzauberWizard()
            }

            "3" -> {
                verteidigungsSchild()
            }

            "4" -> {
                bonusSchadenWizard(GEGNER)
            }
        }
    }

}