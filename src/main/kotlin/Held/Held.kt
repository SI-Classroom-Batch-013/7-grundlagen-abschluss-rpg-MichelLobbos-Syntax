package Held

import ARCHERMENÜ
import BARBARMENÜ
import Gegner
import HELDENMENÜ
import SNIPERSCHUß
import WIZARDMENÜ

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


    var BEUTEL= """1 -  VITAMINE * 1
    |2 -  Heiltrank  * 2
""".trimMargin()


    fun beutelNutzen() {
        println("Beutel : ")
        println(BEUTEL)
        while (true) {
            if (BEUTEL.count { it == 'X' } == 2) {
                println("Beutel Leer !!!")
                break
            }


            var gesucht = readln()
            if (gesucht == "1") {
                println("$name hat VITAMIN genommen. Seine aktionen werden Aktualisiert ")
                if (name == "Barbar") {
                    BARBARMENÜ = HELDENMENÜ
                }
                if (name == "Archer") {
                    ARCHERMENÜ = HELDENMENÜ
                }
                if (name == "Wizard") {
                    WIZARDMENÜ = HELDENMENÜ
                }
                BEUTEL = BEUTEL.replace("1 -  VITAMINE * 1", "X -  VITAMINE  Fertig")
                break
            }
            if (gesucht == "2") {
                println("$name hat Heiltank benutzt. $name tankt 200 HP punkte")
                hp += 200
                if ("2 -  Heiltrank  * 2" in BEUTEL) {
                    BEUTEL = BEUTEL.replace("2 -  Heiltrank  * 2", "2 -  Heiltrank  * 1")
                    break
                } else if ("2 -  Heiltrank  * 1" in BEUTEL) {
                    BEUTEL = BEUTEL.replace("2 -  Heiltrank  * 1", "X -  Heiltrank  Fertig")
                    break
                }
            }
        }

    }
}