open class Gegner(var name: String, var hp: Int, var gegnerSchadenWert: Int = 300) {
//var gegnerTot = false
//    fun tot(){
//    if (GEGNER.hp <= 0){
//        GEGNER.name = "Bika"
//        GEGNER.hp = 750
//    }
//    }

    open fun angriff() {
        println("${GEGNER.name} greift alle Helden an, verursacht $gegnerSchadenWert Schaden.")
        for (held in HELDENLIST) {
            held.hp -= gegnerSchadenWert
            if (held.hp > 0) {
                println("${held.name} HP       : ${held.hp}")
            } else {
                println("${held.name} wurde besiegt!")
            }
        }
    }

    fun bandage (){
        println("${GEGNER.name} hat bandage genutzt, erhöht sein HP mit 100 HP Punkten.")
        GEGNER.hp += 100
        println("${GEGNER.name} HP : $hp")
    }

    fun sniper(){
        while (true) {

            var randomHeld = HELDENLIST.random()
            if (randomHeld.hp >= 0 ) {
                println("${GEGNER.name} greift ${randomHeld.name} mit einem Sniper-Schuß an, verursacht 600 Schaden. ")
                randomHeld.hp -= SNIPERSCHUß
                break
            }
        }

    }
    fun feuer(){
        println("${GEGNER.name} lasst  Feuer regen, allem wird 200 Schaden zugefügt (er trift sich selbst auch!). ")
        hp -= 200
        for (held in HELDENLIST) {
            held.hp -= 200
            if (held.hp > 0) {
                println("${held.name} HP       : ${held.hp}")
            } else {
                println("${held.name} wurde besiegt!")
            }
        }
        if (GEGNER.hp > 0) {
            println("${GEGNER.name} HP : ${GEGNER.hp}")

        } else {
            println("${GEGNER.name} wurde besiegt!")
            GEGNER.hp = 0
        }


    }

    fun schild(){
        println("${GEGNER.name} hat Schild aktualisiert, er verliert ab jetzt 50 HP weniger pro Angriff.")
        SCHADENSWERT -= 50
        println("${GEGNER.name} HP : $hp")
    }

    fun superSchild(){
        println("${GEGNER.name} hat Super Schild aktualisiert, er verliert ab jetzt 100 HP weniger pro Bonus-Angriff.")
        BONUSSCHADENSWERT -= 100
    }

    fun randomAngriff() {

        val verfuegbareAngriffe = mutableListOf(0, 1, 2, 3, 4, 5)

        val randomIndex = verfuegbareAngriffe.random()
        verfuegbareAngriffe.remove(randomIndex)

        when (randomIndex) {
            0 -> sniper()
            1 -> schild()
            2 -> superSchild()
            3 -> feuer()
            4 -> angriff()
            5 -> bandage()
        }
    }
}




