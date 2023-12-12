package Held

import BARBARMENÜ
import BONUSSCHADENSWERT
import GEGNER
import Gegner
import HEILUNGSWERT
import SCHADENSWERT
import sleep

open class Barbaren(name: String) : Held(name, 750) {


    fun angriffBarbar(ziel: Gegner) {
        angriff(ziel, SCHADENSWERT + 10)
        if (GEGNER.hp > 0) {
            println("${GEGNER.name} HP : ${GEGNER.hp}")
        } else {
            //println("${GEGNER.name} wurde besiegt!")
            GEGNER.hp = 0

        }


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
        if (GEGNER.hp > 0) {
            println("${GEGNER.name} HP : ${GEGNER.hp}")
        } else {
            //println("${GEGNER.name} wurde besiegt!")
            GEGNER.hp = 0

        }

    }

    open fun aktionAussuchenBarbar() {

        println("Barbar soll angreifen. Wähle die Attacke per Zahleneingabe aus!")

        println(BARBARMENÜ)


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
//        if (BARBARMENÜ.count { it == 'X' } == 4) {
//            println("""Barbar hat keine übrige Effect.
//                | um die Effecte wiederherzustellen Soll der Barbar Effect-Tablette nehmen!
//                | soll er nehmen?? Y/N """.trimMargin())
//            var nehmmen= readln()
//            if (nehmmen == "y"){
//
//
//            }
//
//        }

        when (auswahl) {
            "1" -> {
                angriffBarbar(GEGNER)
                BARBARMENÜ = BARBARMENÜ.replace("1 - Angriff", "X - Angriff")
                //println(BARBARMENÜ)
            }

            "2" -> {
                heilungBarbar()
                BARBARMENÜ = BARBARMENÜ.replace("2 - Heilung", "X - Heilung")
                //println(BARBARMENÜ)
            }

            "3" -> {
                verteidigungsSchild()
                BARBARMENÜ = BARBARMENÜ.replace("3 - VerteidigungSchild", "X - VerteidigungSchild")
                //println(BARBARMENÜ)
            }

            "4" -> {
                bonusAngriffBarbar(GEGNER)
                BARBARMENÜ = BARBARMENÜ.replace("4 - Bonusangriff", "X - Bonusangriff")
                //println(BARBARMENÜ)
            }

        }
    }

}



