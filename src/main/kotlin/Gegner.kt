open class Gegner(val name: String,var hp: Int = 1300, var gegnerSchadenWert: Int = 300) {
//var gegenerList :MutableList<>

    fun angriff() {
        println("${GEGNER.name} greift alle Helden an, verursacht $gegnerSchadenWert Schaden")
        for (held in HELDENLIST) {
            held.hp -= gegnerSchadenWert
            println("${held.name} HP: ${held.hp} ")
        }
    }

    fun bandage (){
        println("${GEGNER.name} hat bandage genutzt, HP wird aktualisiert ")
        GEGNER.hp = 1300
        println("${GEGNER.name} HP : $hp")
    }

    fun sniper(){
        var randomHeld = HELDENLIST.random()
        println("${GEGNER.name} greift ${randomHeld.name} mit einem Sniper-Schuß an, verursacht 600 Schaden ")
        randomHeld.hp -= 600
        println("${randomHeld.name} HP : ${randomHeld.hp}")
    }
    fun feuer(){
        println("${GEGNER.name} lasst es Feuer regent, verursacht 200 Schaden an allen ")   //alle
        hp -= 200
        for (held in HELDENLIST) {
            held.hp -= 200
            println("${held.name} HP: ${held.hp} ")
        }
        println("$name HP : $hp")

    }

    fun schild(){
        println("${GEGNER.name} hat Schild aktualisiert, er verliert ab jetzt 50 HP weniger pro Angriff")
        SCHADENSWERT -= 50
        println("${GEGNER.name} HP : $hp")
    }

    fun superSchild(){
        println("${GEGNER.name} hat Super Schild aktualisiert, er verliert ab jetzt 100 HP weniger pro Bonus-Angriff")
        BONUSSCHADENSWERT -= 100
    }

    fun random(): Any{
        var randomFun = mutableListOf(sniper(), schild(), superSchild(), feuer(), angriff(), bandage())
        var x = randomFun.random()

        return x
    }



}
