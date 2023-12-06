import Held.Held

fun hp() {
    for (held in HELDENLIST)
        println("${held.name} HP : ${held.hp}")

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


fun runde(){

    println("Helden greifen zuerst: ")
    var nummer = 1
        for (held in HELDENLIST) {
            println("$nummer - ${held.name}")
            nummer++
        }
    println("${GEGNER.name} HP : ${GEGNER.hp}")
    var runde = 1

    BARBAREN.aktionAussuchenBarbar()
    ARCHER.aktionAussuchenArcher()
    WIZARD.aktionAussuchenWizard()




}












