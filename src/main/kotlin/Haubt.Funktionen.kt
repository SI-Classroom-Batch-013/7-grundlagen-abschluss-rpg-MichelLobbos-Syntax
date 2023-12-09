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


fun sleep() {
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


fun runde() {

    var runde = 1
    var nummer = 1
    println("HELDEN : ")
    for (held in HELDENLIST) {
        println("$nummer - ${held.name}")
        nummer++
    }
    while (true) {
        SNIPERSCHUß = 700
        if (GEGNER.name == "Böser Goblin" && GEGNER.hp <= 0) {
            println("${GEGNER.name} würde besiegt")
            GEGNER.name = "Bika"
            GEGNER.hp = 1000
            BARBARMENÜ = """
             |1 - Angriff
             |2 - Heilung
             |3 - VerteidigungSchild
             |4 - Bonusangriff
         """.trimMargin()
            WIZARDMENÜ = """
             |1 - Angriff
             |2 - Heilung
             |3 - VerteidigungSchild
             |4 - Bonusangriff
         """.trimMargin()
            ARCHERMENÜ = """
             |1 - Angriff
             |2 - Heilung
             |3 - VerteidigungSchild
             |4 - Bonusangriff
         """.trimMargin()

            println("WARNUNG !!!! ${GEGNER.name} kommt !!!! ")
            //runde()
        }
        if (GEGNER.name == "Bika" && GEGNER.hp <= 0) {

            println(
                "                ███████╗██╗███████╗    ██╗  ██╗ █████╗ ██████╗ ███████╗███╗   ██╗     ██████╗ ███████╗██╗    ██╗ ██████╗ ███╗   ██╗███╗   ██╗███████╗███╗   ██╗\n" +
                        "                ██╔════╝██║██╔════╝    ██║  ██║██╔══██╗██╔══██╗██╔════╝████╗  ██║    ██╔════╝ ██╔════╝██║    ██║██╔═══██╗████╗  ██║████╗  ██║██╔════╝████╗  ██║\n" +
                        "                ███████╗██║█████╗      ███████║███████║██████╔╝█████╗  ██╔██╗ ██║    ██║  ███╗█████╗  ██║ █╗ ██║██║   ██║██╔██╗ ██║██╔██╗ ██║█████╗  ██╔██╗ ██║\n" +
                        "                ╚════██║██║██╔══╝      ██╔══██║██╔══██║██╔══██╗██╔══╝  ██║╚██╗██║    ██║   ██║██╔══╝  ██║███╗██║██║   ██║██║╚██╗██║██║╚██╗██║██╔══╝  ██║╚██╗██║\n" +
                        "                ███████║██║███████╗    ██║  ██║██║  ██║██████╔╝███████╗██║ ╚████║    ╚██████╔╝███████╗╚███╔███╔╝╚██████╔╝██║ ╚████║██║ ╚████║███████╗██║ ╚████║\n" +
                        "                ╚══════╝╚═╝╚══════╝    ╚═╝  ╚═╝╚═╝  ╚═╝╚═════╝ ╚══════╝╚═╝  ╚═══╝     ╚═════╝ ╚══════╝ ╚══╝╚══╝  ╚═════╝ ╚═╝  ╚═══╝╚═╝  ╚═══╝╚══════╝╚═╝  ╚═══╝\n" +
                        "                                                                                                                                                               "
            )
            break
        }


        println(
            """GEGNER :
        | ${GEGNER.name}""".trimMargin()
        )
        println("--------RUNDE $runde---------")
        println("Helden greifen zuerst: ")

        hp()



        println("------------------------")

        if (BARBAREN.hp > 0) {
            println("${BARBAREN.name} ist dran")
            println("""Beutel öffnen? (Y/N)
                |Vorsicht wenn Barbar der Beutel öffnet, kann er seine Aktionen erst in der nächste Runde nutzen!!
            """.trimMargin())
            var öffnen = readln()

            if (öffnen == "Y" || öffnen == "y"){
                BARBAREN.beutelNutzen()
            }else
            BARBAREN.aktionAussuchenBarbar()
        }
        if (GEGNER.name == "Böser Goblin" && GEGNER.hp <= 0) {
            println("${GEGNER.name} würde besiegt")
            GEGNER.name = "Bika"
            GEGNER.hp = 1000
            BARBARMENÜ = HELDENMENÜ
            WIZARDMENÜ = HELDENMENÜ
            ARCHERMENÜ = HELDENMENÜ

            println("WARNUNG !!!! ${GEGNER.name} kommt !!!! ")

        }
        if (GEGNER.name == "Bika" && GEGNER.hp <= 0) {

            println(
                "                ███████╗██╗███████╗    ██╗  ██╗ █████╗ ██████╗ ███████╗███╗   ██╗     ██████╗ ███████╗██╗    ██╗ ██████╗ ███╗   ██╗███╗   ██╗███████╗███╗   ██╗\n" +
                        "                ██╔════╝██║██╔════╝    ██║  ██║██╔══██╗██╔══██╗██╔════╝████╗  ██║    ██╔════╝ ██╔════╝██║    ██║██╔═══██╗████╗  ██║████╗  ██║██╔════╝████╗  ██║\n" +
                        "                ███████╗██║█████╗      ███████║███████║██████╔╝█████╗  ██╔██╗ ██║    ██║  ███╗█████╗  ██║ █╗ ██║██║   ██║██╔██╗ ██║██╔██╗ ██║█████╗  ██╔██╗ ██║\n" +
                        "                ╚════██║██║██╔══╝      ██╔══██║██╔══██║██╔══██╗██╔══╝  ██║╚██╗██║    ██║   ██║██╔══╝  ██║███╗██║██║   ██║██║╚██╗██║██║╚██╗██║██╔══╝  ██║╚██╗██║\n" +
                        "                ███████║██║███████╗    ██║  ██║██║  ██║██████╔╝███████╗██║ ╚████║    ╚██████╔╝███████╗╚███╔███╔╝╚██████╔╝██║ ╚████║██║ ╚████║███████╗██║ ╚████║\n" +
                        "                ╚══════╝╚═╝╚══════╝    ╚═╝  ╚═╝╚═╝  ╚═╝╚═════╝ ╚══════╝╚═╝  ╚═══╝     ╚═════╝ ╚══════╝ ╚══╝╚══╝  ╚═════╝ ╚═╝  ╚═══╝╚═╝  ╚═══╝╚══════╝╚═╝  ╚═══╝\n" +
                        "                                                                                                                                                               "
            )
            break
        }

        if (ARCHER.hp > 0) {
            println("${ARCHER.name} ist dran")

            println("Beutel öffnen (Y/N)")
            var öffnen = readln()

            if (öffnen == "Y" || öffnen == "y"){
                ARCHER.beutelNutzen()
            }else
            ARCHER.aktionAussuchenArcher()
        }
        if (GEGNER.name == "Böser Goblin" && GEGNER.hp <= 0) {
            println("${GEGNER.name} würde besiegt")
            GEGNER.name = "Bika"
            GEGNER.hp = 1000
            BARBARMENÜ = HELDENMENÜ
            WIZARDMENÜ = HELDENMENÜ
            ARCHERMENÜ = HELDENMENÜ

            println("WARNUNG !!!! ${GEGNER.name} kommt !!!! ")

        }
        if (GEGNER.name == "Bika" && GEGNER.hp <= 0) {

            println(
                "                ███████╗██╗███████╗    ██╗  ██╗ █████╗ ██████╗ ███████╗███╗   ██╗     ██████╗ ███████╗██╗    ██╗ ██████╗ ███╗   ██╗███╗   ██╗███████╗███╗   ██╗\n" +
                        "                ██╔════╝██║██╔════╝    ██║  ██║██╔══██╗██╔══██╗██╔════╝████╗  ██║    ██╔════╝ ██╔════╝██║    ██║██╔═══██╗████╗  ██║████╗  ██║██╔════╝████╗  ██║\n" +
                        "                ███████╗██║█████╗      ███████║███████║██████╔╝█████╗  ██╔██╗ ██║    ██║  ███╗█████╗  ██║ █╗ ██║██║   ██║██╔██╗ ██║██╔██╗ ██║█████╗  ██╔██╗ ██║\n" +
                        "                ╚════██║██║██╔══╝      ██╔══██║██╔══██║██╔══██╗██╔══╝  ██║╚██╗██║    ██║   ██║██╔══╝  ██║███╗██║██║   ██║██║╚██╗██║██║╚██╗██║██╔══╝  ██║╚██╗██║\n" +
                        "                ███████║██║███████╗    ██║  ██║██║  ██║██████╔╝███████╗██║ ╚████║    ╚██████╔╝███████╗╚███╔███╔╝╚██████╔╝██║ ╚████║██║ ╚████║███████╗██║ ╚████║\n" +
                        "                ╚══════╝╚═╝╚══════╝    ╚═╝  ╚═╝╚═╝  ╚═╝╚═════╝ ╚══════╝╚═╝  ╚═══╝     ╚═════╝ ╚══════╝ ╚══╝╚══╝  ╚═════╝ ╚═╝  ╚═══╝╚═╝  ╚═══╝╚══════╝╚═╝  ╚═══╝\n" +
                        "                                                                                                                                                               "
            )

            break
        }

        if (WIZARD.hp > 0) {
            println("${WIZARD.name} ist dran")

            println("Beutel öffnen (Y/N)")
            var öffnen = readln()

            if (öffnen == "Y" || öffnen == "y"){
                WIZARD.beutelNutzen()
            }else
            WIZARD.aktionAussuchenWizard()
        }
        if (GEGNER.name == "Böser Goblin" && GEGNER.hp <= 0) {
            println("${GEGNER.name} würde besiegt")
            GEGNER.name = "Bika"
            GEGNER.hp = 1000
            BARBARMENÜ = HELDENMENÜ
            WIZARDMENÜ = HELDENMENÜ
            ARCHERMENÜ = HELDENMENÜ

            println("WARNUNG !!!! ${GEGNER.name} kommt !!!! ")

        }
        if (GEGNER.name == "Bika" && GEGNER.hp <= 0) {

            println(
                "                ███████╗██╗███████╗    ██╗  ██╗ █████╗ ██████╗ ███████╗███╗   ██╗     ██████╗ ███████╗██╗    ██╗ ██████╗ ███╗   ██╗███╗   ██╗███████╗███╗   ██╗\n" +
                        "                ██╔════╝██║██╔════╝    ██║  ██║██╔══██╗██╔══██╗██╔════╝████╗  ██║    ██╔════╝ ██╔════╝██║    ██║██╔═══██╗████╗  ██║████╗  ██║██╔════╝████╗  ██║\n" +
                        "                ███████╗██║█████╗      ███████║███████║██████╔╝█████╗  ██╔██╗ ██║    ██║  ███╗█████╗  ██║ █╗ ██║██║   ██║██╔██╗ ██║██╔██╗ ██║█████╗  ██╔██╗ ██║\n" +
                        "                ╚════██║██║██╔══╝      ██╔══██║██╔══██║██╔══██╗██╔══╝  ██║╚██╗██║    ██║   ██║██╔══╝  ██║███╗██║██║   ██║██║╚██╗██║██║╚██╗██║██╔══╝  ██║╚██╗██║\n" +
                        "                ███████║██║███████╗    ██║  ██║██║  ██║██████╔╝███████╗██║ ╚████║    ╚██████╔╝███████╗╚███╔███╔╝╚██████╔╝██║ ╚████║██║ ╚████║███████╗██║ ╚████║\n" +
                        "                ╚══════╝╚═╝╚══════╝    ╚═╝  ╚═╝╚═╝  ╚═╝╚═════╝ ╚══════╝╚═╝  ╚═══╝     ╚═════╝ ╚══════╝ ╚══╝╚══╝  ╚═════╝ ╚═╝  ╚═══╝╚═╝  ╚═══╝╚══════╝╚═╝  ╚═══╝\n" +
                        "                                                                                                                                                               "
            )

            break


        }

        if (GEGNER.name == "Böser Goblin" && GEGNER.hp > 0) {
            println("Vorsicht Böser Goblin ist dran")
        } else println("Vorsicht Bika ist dran !!!")

        sleep()
        GEGNER.randomAngriff()


        runde++


        if (BARBAREN.hp <= 0 && ARCHER.hp <= 0 && WIZARD.hp <= 0) {
            println(
                "                 ██████╗  █████╗ ███╗   ███╗███████╗     ██████╗ ██╗   ██╗███████╗██████╗ \n" +
                        "                ██╔════╝ ██╔══██╗████╗ ████║██╔════╝    ██╔═══██╗██║   ██║██╔════╝██╔══██╗\n" +
                        "                ██║  ███╗███████║██╔████╔██║█████╗      ██║   ██║██║   ██║█████╗  ██████╔╝\n" +
                        "                ██║   ██║██╔══██║██║╚██╔╝██║██╔══╝      ██║   ██║╚██╗ ██╔╝██╔══╝  ██╔══██╗\n" +
                        "                ╚██████╔╝██║  ██║██║ ╚═╝ ██║███████╗    ╚██████╔╝ ╚████╔╝ ███████╗██║  ██║\n" +
                        "                 ╚═════╝ ╚═╝  ╚═╝╚═╝     ╚═╝╚══════╝     ╚═════╝   ╚═══╝  ╚══════╝╚═╝  ╚═╝\n" +
                        "                                                                                          "
            )
            break
        }

        println("------------------------")
    }


}











