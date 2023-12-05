open class Barbaren(name: String): Held(name, 750) {


    fun angriffBarbar(ziel: Gegner) {
        angriff(ziel,  SCHADENSWERT + 10)


    }

    fun heilungBarbar() {
        heilung(HEILUNGSWERT + 20)

    }

    override fun verteidigungsSchild() {
        verteidigungsSchild()

    }

    fun bonusAngriffBarbar(ziel: Gegner) {
        bonusAngriff(ziel, BONUSSCHADENSWERT + 50)

    }



     fun aktionAussuchenBarbar () {
         println(MENÜ)
         var auswahl = readln()
         when (auswahl) {
             "1" -> {
                 angriffBarbar(GEGNER)
             }

             "2" -> {
                 heilungBarbar()
             }

             "3" -> {
                 verteidigungsSchild()
             }

             "4" -> {
                 bonusAngriffBarbar(GEGNER)
             }
         }
     }





}
