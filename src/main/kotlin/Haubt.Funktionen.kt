fun hp() {
    for (held in HELDENLIST) {
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
    }
}


fun sleep(){
    Thread.sleep(2000)
}


//fun heldAussuchen(){
//    val ausgewählteAktionen = mutableSetOf<String>()
//    println("Suchen Sie einen Held per Zahleneingabe aus!")
//        var nummer = 1
//        for (held in HELDENLIST) {
//            println("$nummer - ${held.name}")
//            nummer++
//        }
//
//        val heldAuswahl = readln()
//
//
//
//
//            when (heldAuswahl) {
//                "1" -> {
//                    BARBAREN.aktionAussuchenBarbar()
//                    ausgewählteAktionen.add("1")
//                }
//
//                "2" -> {
//                    ARCHER.aktionAussuchenArcher()
//                    ausgewählteAktionen.add("2")
//                }
//
//                "3" -> {
//                    WIZARD.aktionAussuchenWizard()
//                    ausgewählteAktionen.add("3")
//                }
//
//                else -> {
//                    println("Ungültige Eingabe. Bitte wählen Sie 1, 2 oder 3.")
//                    return
//                }
//
//            }
//fun heldAuswählen() {
//    val ausgewählteAktionen = mutableSetOf<String>()
//
//    while (true) {
//        println("Wählen Sie einen Helden durch Eingabe der entsprechenden Zahl:")
//
//        var nummer = 1
//        for (held in HELDENLIST) {
//            println("$nummer - ${held.name}")
//            nummer++
//        }
//
//        val heldAuswahl = readLine()
//
//        when (heldAuswahl) {
//            "1" -> {
//                BARBAREN.aktionAussuchenBarbar()
//                ausgewählteAktionen.add("1")
//                break
//            }
//
//            "2" -> {
//                ARCHER.aktionAussuchenArcher()
//                ausgewählteAktionen.add("2")
//                break
//            }
//
//            "3" -> {
//                WIZARD.aktionAussuchenWizard()
//                ausgewählteAktionen.add("3")
//                break
//            }
//
//            else -> {
//                println("Ungültige Eingabe. Bitte wählen Sie 1, 2 oder 3.")
//
//            }
//        }
//    }
//
//}

fun tot(){

}

fun runde(){

    while ()
    var runde = 1

    var nummer = 1
    println("HELDEN : ")
    for (held in HELDENLIST) {
        println("$nummer - ${held.name}")
        nummer++
    }
    println("""GEGNER :
        | ${GEGNER.name}""".trimMargin())
    println("--------RUNDE $runde---------")
    println("Helden greifen zuerst: ")

    hp()



    println("------------------------")


    BARBAREN.aktionAussuchenBarbar()

    ARCHER.aktionAussuchenArcher()
    WIZARD.aktionAussuchenWizard()


    if (GEGNER.hp <= 0){
        GEGNER.name = "Bika"
        GEGNER.hp = 750
    }
    println("Vorsicht ${GEGNER.name} ist dran !!!")
    sleep()
    GEGNER.randomAngriff()




    runde ++
    println("------------------------")




}












