package Held

import BONUSSCHADENSWERT
import GEGNER
import Gegner
import HEILUNGSWERT
import SCHADENSWERT

open class Archer(name: String) : Held(name, 550) {

    fun angriffArcher(ziel: Gegner) {
        angriff(ziel, SCHADENSWERT + 20)

    }

    fun heilungArcher() {
        heilung(HEILUNGSWERT + 15)

    }

//    override fun verteidigungsSchild() {
//        super.verteidigungsSchild()
//
//    }

    fun bonusAngriffArcher(ziel: Gegner) {
        bonusAngriff(ziel, BONUSSCHADENSWERT + 75)

    }


    fun aktionAussuchenArcher() {
        println("Held.Held.Archer soll angreifen. Wähle die Attacke per Zahleneingabe aus!")

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
                    angriffArcher(GEGNER)
                    menü = menü.replace("1 - Angriff", "X - Angriff")
                    println(menü)

                }

                "2" -> {
                    heilungArcher()
                    menü = menü.replace("2 - Heilung", "X - Heilung")
                    println(menü)

                }

                "3" -> {
                    verteidigungsSchild()
                    menü = menü.replace("3 - VerteidigungSchild", "X - VerteidigungSchild")
                    println(menü)

                }

                "4" -> {
                    bonusAngriffArcher(GEGNER)
                    menü = menü.replace("4 - Bonusangriff", "X - Bonusangriff")
                    println(menü)


                }
            }
        }
        println("Archer hat ihre vier Aktionen benutzt")


    }
}