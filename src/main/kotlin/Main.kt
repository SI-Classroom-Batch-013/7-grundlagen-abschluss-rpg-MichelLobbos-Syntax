import Held.Archer
import Held.Barbaren
import Held.Held
import Held.Wizard

var beutelGenutzt = false
var FEUER ="\u001B[31m"+"""                                                                                                   .''.
                                                                       .''.      .        *''*    :_\/_:     .
                                                                      :_\/_:   _\(/_  .:.*_\/_*   : /\ :  .'.:.'.
                                                                  .''.: /\ :    /)\   ':'* /\ *  : '..'.  -=:o:=-
                                                                 :_\/_:'.:::.  | ' *''*    * '.\'/.'_\(/_ '.':'.'
                                                                 : /\ : :::::  =  *_\/_*     -= o =- /)\     '  *
                                                                  '..'  ':::' === * /\ *     .'/.\'.  ' ._____
                                                                      *        |   *..*         :       |.   |' .---"|
                                                                        *      |     _           .--'|  ||   | _|    |
                                                                        *      |  .-'|       __  |   |  |    ||      |
                                                                     .-----.   |  |' |  ||  |  | |   |  |    ||      |
                                                                 ___'       ' /"\ |  '-."".    '-'   '-.'    '`      |____
                                                                ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"""
var SPIELNAME = "\u001B[40m"+"                                                     ██████╗ ██╗██████╗     ██╗██╗  ██╗███╗   ███╗\n" +
        "                                                    ██╔════╝ ██║██╔══██╗    ██║██║  ██║████╗ ████║\n" +
        "                                                    ██║  ███╗██║██████╔╝    ██║███████║██╔████╔██║\n" +
        "                                                    ██║   ██║██║██╔══██╗    ██║██╔══██║██║╚██╔╝██║\n" +
        "                                                    ╚██████╔╝██║██████╔╝    ██║██║  ██║██║ ╚═╝ ██║\n" +
        "                                                     ╚═════╝ ╚═╝╚═════╝     ╚═╝╚═╝  ╚═╝╚═╝     ╚═╝\n" +
        "                                                                                                                          "
var GEWONNEN ="\u001B[40m"+"\u001B[33m"+
    "                       ███████╗██╗███████╗    ██╗  ██╗ █████╗ ██████╗ ███████╗███╗   ██╗     ██████╗ ███████╗██╗    ██╗ ██████╗ ███╗   ██╗███╗   ██╗███████╗███╗   ██╗\n" +
            "                       ██╔════╝██║██╔════╝    ██║  ██║██╔══██╗██╔══██╗██╔════╝████╗  ██║    ██╔════╝ ██╔════╝██║    ██║██╔═══██╗████╗  ██║████╗  ██║██╔════╝████╗  ██║\n" +
            "                       ███████╗██║█████╗      ███████║███████║██████╔╝█████╗  ██╔██╗ ██║    ██║  ███╗█████╗  ██║ █╗ ██║██║   ██║██╔██╗ ██║██╔██╗ ██║█████╗  ██╔██╗ ██║\n" +
            "                       ╚════██║██║██╔══╝      ██╔══██║██╔══██║██╔══██╗██╔══╝  ██║╚██╗██║    ██║   ██║██╔══╝  ██║███╗██║██║   ██║██║╚██╗██║██║╚██╗██║██╔══╝  ██║╚██╗██║\n" +
            "                       ███████║██║███████╗    ██║  ██║██║  ██║██████╔╝███████╗██║ ╚████║    ╚██████╔╝███████╗╚███╔███╔╝╚██████╔╝██║ ╚████║██║ ╚████║███████╗██║ ╚████║\n" +
            "                       ╚══════╝╚═╝╚══════╝    ╚═╝  ╚═╝╚═╝  ╚═╝╚═════╝ ╚══════╝╚═╝  ╚═══╝     ╚═════╝ ╚══════╝ ╚══╝╚══╝  ╚═════╝ ╚═╝  ╚═══╝╚═╝  ╚═══╝╚══════╝╚═╝  ╚═══╝\n" +
            "                                                                                                                                                               "
var BEUTEL= """1 -  VITAMINE * 1
    |2 -  Heiltrank  * 2
""".trimMargin()
var SNIPERSCHUß = 700
var SCHADENSWERT = 200
var HEILUNGSWERT = 50
var BONUSSCHADENSWERT = 300
var GEGNER = Gegner("Böser Goblin",750)

var BARBAREN= Barbaren("Barbar")
var ARCHER= Archer("Archer")
var WIZARD: Wizard = Wizard("Wizard")
var MENÜ =
    "\u001B[33m" + """ 
 ██╗                   █████╗ ███╗   ██╗ ██████╗ ██████╗ ██╗███████╗███████╗                                                                                          
███║                  ██╔══██╗████╗  ██║██╔════╝ ██╔══██╗██║██╔════╝██╔════╝                                                                                          
╚██║        █████╗    ███████║██╔██╗ ██║██║  ███╗██████╔╝██║█████╗  █████╗                                                                                            
 ██║        ╚════╝    ██╔══██║██║╚██╗██║██║   ██║██╔══██╗██║██╔══╝  ██╔══╝                                                                                            
 ██║                  ██║  ██║██║ ╚████║╚██████╔╝██║  ██║██║██║     ██║                                                                                               
 ╚═╝                  ╚═╝  ╚═╝╚═╝  ╚═══╝ ╚═════╝ ╚═╝  ╚═╝╚═╝╚═╝     ╚═╝                                                                                               
██████╗               ██╗  ██╗███████╗██╗██╗     ██╗   ██╗███╗   ██╗ ██████╗                                                                                          
╚════██╗              ██║  ██║██╔════╝██║██║     ██║   ██║████╗  ██║██╔════╝                                                                                          
 █████╔╝    █████╗    ███████║█████╗  ██║██║     ██║   ██║██╔██╗ ██║██║  ███╗                                                                                         
██╔═══╝     ╚════╝    ██╔══██║██╔══╝  ██║██║     ██║   ██║██║╚██╗██║██║   ██║                                                                                         
███████╗              ██║  ██║███████╗██║███████╗╚██████╔╝██║ ╚████║╚██████╔╝                                                                                         
╚══════╝              ╚═╝  ╚═╝╚══════╝╚═╝╚══════╝ ╚═════╝ ╚═╝  ╚═══╝ ╚═════╝                                                                                          
██████╗               ██╗   ██╗███████╗██████╗ ████████╗███████╗██╗██████╗ ██╗ ██████╗ ██╗   ██╗███╗   ██╗ ██████╗ ███████╗███████╗ ██████╗██╗  ██╗██╗██╗     ██████╗ 
╚════██╗              ██║   ██║██╔════╝██╔══██╗╚══██╔══╝██╔════╝██║██╔══██╗██║██╔════╝ ██║   ██║████╗  ██║██╔════╝ ██╔════╝██╔════╝██╔════╝██║  ██║██║██║     ██╔══██╗
 █████╔╝    █████╗    ██║   ██║█████╗  ██████╔╝   ██║   █████╗  ██║██║  ██║██║██║  ███╗██║   ██║██╔██╗ ██║██║  ███╗███████╗███████╗██║     ███████║██║██║     ██║  ██║
 ╚═══██╗    ╚════╝    ╚██╗ ██╔╝██╔══╝  ██╔══██╗   ██║   ██╔══╝  ██║██║  ██║██║██║   ██║██║   ██║██║╚██╗██║██║   ██║╚════██║╚════██║██║     ██╔══██║██║██║     ██║  ██║
██████╔╝               ╚████╔╝ ███████╗██║  ██║   ██║   ███████╗██║██████╔╝██║╚██████╔╝╚██████╔╝██║ ╚████║╚██████╔╝███████║███████║╚██████╗██║  ██║██║███████╗██████╔╝
╚═════╝                 ╚═══╝  ╚══════╝╚═╝  ╚═╝   ╚═╝   ╚══════╝╚═╝╚═════╝ ╚═╝ ╚═════╝  ╚═════╝ ╚═╝  ╚═══╝ ╚═════╝ ╚══════╝╚══════╝ ╚═════╝╚═╝  ╚═╝╚═╝╚══════╝╚═════╝ 
██╗  ██╗              ██████╗  ██████╗ ███╗   ██╗██╗   ██╗███████╗ █████╗ ███╗   ██╗ ██████╗ ██████╗ ██╗███████╗███████╗                                              
██║  ██║              ██╔══██╗██╔═══██╗████╗  ██║██║   ██║██╔════╝██╔══██╗████╗  ██║██╔════╝ ██╔══██╗██║██╔════╝██╔════╝                                              
███████║    █████╗    ██████╔╝██║   ██║██╔██╗ ██║██║   ██║███████╗███████║██╔██╗ ██║██║  ███╗██████╔╝██║█████╗  █████╗                                                
╚════██║    ╚════╝    ██╔══██╗██║   ██║██║╚██╗██║██║   ██║╚════██║██╔══██║██║╚██╗██║██║   ██║██╔══██╗██║██╔══╝  ██╔══╝                                                
     ██║              ██████╔╝╚██████╔╝██║ ╚████║╚██████╔╝███████║██║  ██║██║ ╚████║╚██████╔╝██║  ██║██║██║     ██║                                                   
     ╚═╝              ╚═════╝  ╚═════╝ ╚═╝  ╚═══╝ ╚═════╝ ╚══════╝╚═╝  ╚═╝╚═╝  ╚═══╝ ╚═════╝ ╚═╝  ╚═╝╚═╝╚═╝     ╚═╝                                                   
                                                                                                                                                                      
    """.trimIndent()
var HELDENLIST : MutableList<Held> = mutableListOf(BARBAREN,ARCHER,WIZARD)
var HELDENMENÜ = """
             |1 - Angriff
             |2 - Heilung
             |3 - VerteidigungSchild
             |4 - Bonusangriff
         """.trimMargin()
var BARBARMENÜ = """
             |1 - Angriff
             |2 - Heilung
             |3 - VerteidigungSchild
             |4 - Bonusangriff
         """.trimMargin()
var WIZARDMENÜ = """
             |1 - Angriff
             |2 - Heilung
             |3 - VerteidigungSchild
             |4 - Bonusangriff
         """.trimMargin()
var ARCHERMENÜ = """
             |1 - Angriff
             |2 - Heilung
             |3 - VerteidigungSchild
             |4 - Bonusangriff
         """.trimMargin()

var LOGO = "\u001B[40m"+"\u001B[31m"+"""                                                     O                                          O
                                               {o)xxx|===============>  MICHEL  <===============|xxx(o}
                                                     O                                          O"""+"\u001B[34m"

fun main() {
println("\u001B[31m" + SPIELNAME)
    println(LOGO)
    runde()


}
