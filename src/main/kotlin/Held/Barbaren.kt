package Held

import BONUSSCHADENSWERT
import GEGNER
import Gegner
import HEILUNGSWERT
import SCHADENSWERT

open class Barbaren(name: String) : Held(name, 750) {


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

    var gewaltBeiBarbar: MutableList<String> = mutableListOf()
    fun aktionAussuchenBarbar() {
        println("Barbar soll angreifen. Wähle die Attacke per Zahleneingabe aus!")
        var menü = """
             |1 - Angriff
             |2 - Heilung
             |3 - VerteidigungSchild
             |4 - Bonusangriff
         """.trimMargin()

        println(menü)


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
                angriffBarbar(GEGNER)
                gewaltBeiBarbar.add("1")

            }

            "2" -> {
                heilungBarbar()
                gewaltBeiBarbar.add("2")

            }

            "3" -> {
                verteidigungsSchild()
                gewaltBeiBarbar.add("3")

            }

            "4" -> {
                bonusAngriffBarbar(GEGNER)
                gewaltBeiBarbar.add("4")


            }
        }
    if (gewaltBeiBarbar.size == 4 ) {
        println("Barbar hat seine vier Aktionen benutzt")
        println("Suchen Sie andere Held aus!")

    }
    }


}
