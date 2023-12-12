package Held

import ARCHERMENÜ
import BARBARMENÜ
import BEUTEL

import Gegner
import HELDENMENÜ
import SNIPERSCHUß
import WIZARDMENÜ
import beutelGenutzt

open class Held(var name: String, var hp: Int) {


    open fun angriff(ziel: Gegner, schadenswert: Int) {
        ziel.hp -= schadenswert
        println("$name greift ${ziel.name} an und verursacht $schadenswert Schaden!")
        //println("${ziel.name} HP : ${ziel.hp}")
    }


    open fun heilung(HEILUNGWERT: Int) {
        hp += HEILUNGWERT
        println("$name heilt sich um $HEILUNGWERT.")
    }

    open fun verteidigungsSchild() {
        println("$name aktiviert einen Verteidigung-Schild.")
        println("Alle Helden bekommen 200 Schaden weniger wenn der gegner Sniper-Schuß schießt, gilt nur für diese Runde.")
        SNIPERSCHUß -= 200

    }


    open fun bonusAngriff(ziel: Gegner, bonusSchadenswert: Int) {
        ziel.hp -= bonusSchadenswert
        println("$name greift ${ziel.name} an und verursacht $bonusSchadenswert Schaden!")
    }


    fun beutelNutzen() {
        if (beutelGenutzt) {
            println("Der Beutel wurde bereits in dieser Runde verwendet.")
//            when (name) {
//                "Barbar" -> BARBAREN.
//                "Archer" ->
//                "Wizard" ->
//            }

            return
        }

        beutelGenutzt = true
            println("Beutel : ")
            println(BEUTEL)

            while (true) {
                if (BEUTEL.count { it == 'X' } == 2) {
                    println("Beutel Leer !!! ")
                    break
                }

                var gesucht = readln()
                when (gesucht) {
                    "1" -> {
                        println("$name hat VITAMIN genommen. Seine Aktionen werden aktualisiert.")
                        when (name) {
                            "Barbar" -> BARBARMENÜ = HELDENMENÜ
                            "Archer" -> ARCHERMENÜ = HELDENMENÜ
                            "Wizard" -> WIZARDMENÜ = HELDENMENÜ
                        }
                        BEUTEL = BEUTEL.replace("1 -  VITAMINE * 1", "X -  VITAMINE  Fertig")
                        //BEUTELGENUTZT = true
                        break
                    }

                    "2" -> {
                        println("$name hat Heiltrank benutzt. $name tankt 200 HP Punkte.")
                        //BEUTELGENUTZT = true
                        hp += 200
                        when {
                            "2 -  Heiltrank  * 2" in BEUTEL -> BEUTEL =
                                BEUTEL.replace("2 -  Heiltrank  * 2", "2 -  Heiltrank  * 1")

                            "2 -  Heiltrank  * 1" in BEUTEL -> BEUTEL =
                                BEUTEL.replace("2 -  Heiltrank  * 1", "X -  Heiltrank  Fertig")
                        }
                        break
                    }

                    else -> {
                        println("Ungültige Eingabe. Bitte wählen Sie 1 oder 2.")

                    }
                }
            }
        }
    }
