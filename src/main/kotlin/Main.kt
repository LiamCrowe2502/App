import mu.KotlinLogging
import java.lang.System.exit
import java.util.*

val scanner = Scanner(System.`in`)

private val logger = KotlinLogging.logger {}

fun main(args: Array<String>) {
    runMenu()
}

fun mainMenu() : Int {
    print(""" 
         > ----------------------------------
         > |        NOTE KEEPER APP         |
         > ----------------------------------
         > | NOTE MENU                      |
         > |   1) Add a note                |
         > |   2) List all notes            |
         > |   3) Update a note             |
         > |   4) Delete a note             |
         > ----------------------------------
         > |   0) Exit                      |
         > ----------------------------------
         > ==>> """.trimMargin(">"))
    return scanner.nextInt()
}

fun runMenu() {
    do {
        val option = mainMenu()
        when (option) {
            1  -> addNote()
            2  -> listNotes()
            3  -> updateNote()
            4  -> deleteNote()
            0  -> exitApp()
            else -> System.out.println("Invalid option entered: ${option}")
        }
    } while (true)
}

fun addNote(){
    logger.info { "addNote() function invoked" }
}

fun listNotes(){
    logger.info { "listNote() function invoked" }
}

fun updateNote(){
    logger.info { "updateNote() function invoked" }
}

fun deleteNote(){
    logger.info { "deleteNote() function invoked" }
}

fun exitApp() {
    logger.info { "exit function invoked" }
    exit(0)
}
