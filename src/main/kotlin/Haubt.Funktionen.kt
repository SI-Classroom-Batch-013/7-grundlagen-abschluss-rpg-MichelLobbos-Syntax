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


fun runde() {

    var runde = 1
    var nummer = 1
    println("\u001B[40m"+"HELDEN : ")
    for (held in HELDENLIST) {
        println("$nummer - ${held.name}")
        nummer++
    }
    while (true) {
        beutelGenutzt = false
        SNIPERSCHUß = 700
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
            println(FEUER)
            println(GEWONNEN)
            break
        }


        println(
            """GEGNER :
        |1 - ${GEGNER.name}""".trimMargin()
        )
        println("\u001B[32m"+"╔══════════════════════╗")
        println("╠--------RUNDE $runde-------╣")
        println("╚══════════════════════╝")
        println("\u001B[34m"+"Helden greifen zuerst: ")

        hp()



        println("------------------------")

        if (BARBAREN.hp > 0){
            println(BARBAREN.name +" ist dran")
            var barbarWhile = false

            while (!beutelGenutzt) {
                println(
                    """Beutel öffnen? (Y/N)
            |Vorsicht, Beutel darf nur von einem Held pro Runde öffnen ,wenn ein Held der Beutel öffnet, kann er seine Aktionen erst in der nächsten Runde nutzen!!
        """.trimMargin()
                )
                barbarWhile = !barbarWhile
                var öffnen = readln()

                when (öffnen.toLowerCase()) {
                    "y" -> {
                        BARBAREN.beutelNutzen()
                        break
                    }

                    "n" -> {
                        BARBAREN.aktionAussuchenBarbar()
                        break
                    }

                    else -> {
                        println("Ungültige Eingabe. Bitte wählen Sie Y oder N.")

                    }
                }
            }
            if (!barbarWhile){
                BARBAREN.aktionAussuchenBarbar()
            }
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
            println(FEUER)
            println(GEWONNEN)
            break
        }

        if (ARCHER.hp > 0) {
            println("${ARCHER.name} ist dran")
            var archerWhile = false
            while (!beutelGenutzt) {
                println(
                    """Beutel öffnen? (Y/N)
            |Vorsicht, Beutel darf nur von einem Held pro Runde öffnen ,wenn ein Held der Beutel öffnet, kann er seine Aktionen erst in der nächsten Runde nutzen!!
        """.trimMargin()
                )
                archerWhile = !archerWhile
                var öffnen = readln()

                when (öffnen.toLowerCase()) {
                    "y" -> {
                        ARCHER.beutelNutzen()
                        break
                    }

                    "n" -> {
                        ARCHER.aktionAussuchenArcher()
                        break
                    }

                    else -> {
                        println("Ungültige Eingabe. Bitte wählen Sie Y oder N.")

                    }
                }
            }
            if (!archerWhile){
                ARCHER.aktionAussuchenArcher()
            }
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
            println(FEUER)
            println(GEWONNEN)

            break
        }

        if (WIZARD.hp > 0) {
            println("${WIZARD.name} ist dran")
            var wizardWhile = false

            while (!beutelGenutzt) {
                println(
                    """Beutel öffnen? (Y/N)
            |Vorsicht, Beutel darf nur von einem Held pro Runde öffnen ,wenn ein Held der Beutel öffnet, kann er seine Aktionen erst in der nächsten Runde nutzen!!
        """.trimMargin()
                )
                wizardWhile = !wizardWhile
                var öffnen = readln()

                when (öffnen.toLowerCase()) {
                    "y" -> {
                        WIZARD.beutelNutzen()
                        break
                    }

                    "n" -> {
                        WIZARD.aktionAussuchenWizard()
                        break
                    }

                    else -> {
                        println("Ungültige Eingabe. Bitte wählen Sie Y oder N.")

                    }
                }
            }
            if (!wizardWhile){
                WIZARD.aktionAussuchenWizard()
            }
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
            println(FEUER)
            println(GEWONNEN)

            break


        }

        if (GEGNER.name == "Böser Goblin" && GEGNER.hp > 0) {
            println("Vorsicht Böser Goblin ist dran")
        } else println("Vorsicht Bika ist dran !!!")

        sleep()
        GEGNER.randomAngriff()


        runde++


        if (BARBAREN.hp <= 0 && ARCHER.hp <= 0 && WIZARD.hp <= 0) {
            println("\u001B[31m"+
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











