class Wizard (name: String) : Held(name, 850) {

    fun angriffWizard(ziel: Gegner) {
        angriff(ziel, SCHADENSWERT + 30)

    }

    fun heilungWizard() {
        heilung(HEILUNGSWERT + 10)

    }

//    override fun verteidigungsSchild() {
//        verteidigungsSchild()
//
//    }

    fun bonusAngriffWizard(ziel: Gegner) {
        bonusAngriff(ziel, BONUSSCHADENSWERT + 100)

    }

    fun aktionAussuchenWizard() {

        var menü = """
             |1 - Angriff
             |2 - Heilung
             |3 - VerteidigungSchild
             |4 - Bonusangriff
         """.trimMargin()

        println(menü)

        repeat(4) {
            var auswahl: String
            while (true) {
                auswahl = readln()
                when (auswahl) {
                    "1", "2", "3", "4" -> break
                    else -> {
                        println("Ungültige Eingabe. Bitte wählen Sie 1, 2, 3 oder 4.")
                    }
                }
            }

            when (auswahl) {
                "1" -> {
                    angriffWizard(GEGNER)
                    menü = menü.replace("1 - Angriff", "X - Angriff")
                    println(menü)

                }

                "2" -> {
                    heilungWizard()
                    menü = menü.replace("2 - Heilung", "X - Heilung")
                    println(menü)

                }

                "3" -> {
                    verteidigungsSchild()
                    menü = menü.replace("3 - VerteidigungSchild", "X - VerteidigungSchild")
                    println(menü)

                }

                "4" -> {
                    bonusAngriffWizard(GEGNER)
                    menü = menü.replace("4 - Bonusangriff", "X - Bonusangriff")
                    println(menü)


                }
            }
        }
        println("Wizard hat seine vier Aktionen benutzt")


    }

}