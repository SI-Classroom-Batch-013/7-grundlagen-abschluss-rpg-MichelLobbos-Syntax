package Held

import BONUSSCHADENSWERT
import GEGNER
import Gegner
import HEILUNGSWERT
import SCHADENSWERT
import WIZARDMENÜ
import sleep

open class Wizard (name: String) : Held(name, 450) {

    fun angriffWizard(ziel: Gegner) {
        angriff(ziel, SCHADENSWERT + 30)
        if (GEGNER.hp > 0) {
            println("${GEGNER.name} HP : ${GEGNER.hp}")
        } else {
            //println("${GEGNER.name} wurde besiegt!")
            GEGNER.hp = 0

        }

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
        if (GEGNER.hp > 0) {
            println("${GEGNER.name} HP : ${GEGNER.hp}")
        } else {
            //println("${GEGNER.name} wurde besiegt!")
            GEGNER.hp = 0

        }

    }

    fun aktionAussuchenWizard() {
        println("Wizard soll angreifen. Wähle die Attacke per Zahleneingabe aus!")



        println(WIZARDMENÜ)


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
                    WIZARDMENÜ = WIZARDMENÜ.replace("1 - Angriff", "X - Angriff")
                    //println(WIZARDMENÜ)

                }

                "2" -> {
                    heilungWizard()
                    WIZARDMENÜ = WIZARDMENÜ.replace("2 - Heilung", "X - Heilung")
                    //println(WIZARDMENÜ)

                }

                "3" -> {
                    verteidigungsSchild()
                    WIZARDMENÜ = WIZARDMENÜ.replace("3 - VerteidigungSchild", "X - VerteidigungSchild")
                    //println(WIZARDMENÜ)

                }

                "4" -> {
                    bonusAngriffWizard(GEGNER)
                    WIZARDMENÜ = WIZARDMENÜ.replace("4 - Bonusangriff", "X - Bonusangriff")
                    //println(WIZARDMENÜ)


                }
            }

        //println("Wizard hat seine vier Aktionen benutzt")


    }

}