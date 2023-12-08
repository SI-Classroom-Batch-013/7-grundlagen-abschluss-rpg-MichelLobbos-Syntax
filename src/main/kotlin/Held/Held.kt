package Held

import Gegner
import SNIPERSCHUß

open class Held(var name: String, var hp: Int) {

    var schutzzauberAktiv = false


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


    var BEUTEL= """1 -  VITAMINE 
    |2 -  Heiltrank  * 2
""".trimMargin()
    fun beutelNutzen(){
        println("Was möchten Sie Haben")
        println(BEUTEL)
        var gesucht = readln()
        if (gesucht == "1"){
            println("$name hat VITAMIN genommen  ")
        }
    }


}