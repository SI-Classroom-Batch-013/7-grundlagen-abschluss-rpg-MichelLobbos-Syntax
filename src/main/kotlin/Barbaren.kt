open class Barbaren(name: String): Held(name, 750) {


    fun angriffBarbar(ziel: Gegner) {
        angriff(ziel, SCHADENSWERT + 10)


    }

    fun heilungBarbar() {
        heilung(HEILUNGSWERT + 20)

    }

//    override fun verteidigungsSchild() {
//        verteidigungsSchild()
//
//    }

    fun bonusAngriffBarbar(ziel: Gegner) {
        bonusAngriff(ziel, BONUSSCHADENSWERT + 50)

    }


    fun aktionAussuchenBarbar() {

            var menü = """
             |1 - Angriff
             |2 - Heilung
             |3 - VerteidigungSchild
             |4 - Bonusangriff
         """.trimMargin()
            println(menü)
            repeat(4) {

            var auswahl = readln()
            when (auswahl) {
                "1" -> {
                    angriffBarbar(GEGNER)
                    menü = menü.replace("1 - Angriff", "X - Angriff")
                    println(menü)

                }

                "2" -> {
                    heilungBarbar()
                    menü = menü.replace("2 - Heilung", "X - Heilung")
                    println(menü)

                }

                "3" -> {
                    verteidigungsSchild()
                    menü = menü.replace("3 - VerteidigungSchild", "X - VerteidigungSchild")
                    println(menü)

                }

                "4" -> {
                    bonusAngriffBarbar(GEGNER)
                    menü = menü.replace("4 - Bonusangriff", "X - Bonusangriff")
                    println(menü)


                }
            }
        }
        println("Barbar hat seine vier Aktionen benutzt")



    }


}
