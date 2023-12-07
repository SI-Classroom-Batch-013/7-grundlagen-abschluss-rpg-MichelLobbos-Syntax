package Held

import ARCHERMENÜ
import BONUSSCHADENSWERT
import GEGNER
import Gegner
import HEILUNGSWERT
import SCHADENSWERT

open class Archer(name: String) : Held(name, 550) {

    fun angriffArcher(ziel: Gegner) {
        angriff(ziel, SCHADENSWERT + 20)
        if (GEGNER.hp > 0) {
            println("${GEGNER.name} HP : ${GEGNER.hp}")
        } else {
            println("${GEGNER.name} wurde besiegt!")
            GEGNER.hp = 0

        }

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
        if (GEGNER.hp > 0) {
            println("${GEGNER.name} HP : ${GEGNER.hp}")
        } else {
            println("${GEGNER.name} wurde besiegt!")
            GEGNER.hp = 0

        }

    }


    fun aktionAussuchenArcher() {
        println("Archer soll angreifen. Wähle die Attacke per Zahleneingabe aus!")



        println(ARCHERMENÜ)


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
                    ARCHERMENÜ = ARCHERMENÜ.replace("1 - Angriff", "X - Angriff")
                    //println(ArcherMenü)

                }

                "2" -> {
                    heilungArcher()
                    ARCHERMENÜ = ARCHERMENÜ.replace("2 - Heilung", "X - Heilung")
                    //println(ArcherMenü)

                }

                "3" -> {
                    verteidigungsSchild()
                    ARCHERMENÜ = ARCHERMENÜ.replace("3 - VerteidigungSchild", "X - VerteidigungSchild")
                    //println(ArcherMenü)

                }

                "4" -> {
                    bonusAngriffArcher(GEGNER)
                    ARCHERMENÜ = ARCHERMENÜ.replace("4 - Bonusangriff", "X - Bonusangriff")
                    //println(ArcherMenü)


                }
            }

        //println("Archer hat ihre vier Aktionen benutzt")


    }
}