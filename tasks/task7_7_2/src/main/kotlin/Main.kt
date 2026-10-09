// Task 7.7.2: phone book simulator
import kotlin.io.path.Path
const val CSV_FILENAME = "phone.csv"

fun main() {
    // Implement the main program here
    // (You can add other functions to this file if you wish)
    val database = createDatabase()
    database.load(CSV_FILENAME)
    
    while (true){
        print("Enter a contacts name or press q to quit: ")
        val name = readln()
        
        if (name == "q"){
            println("Quitting...")
            break
        }
        
        if (name in database.keys){
            println("Phone number: ${database[name]}")
        }
        else{
            print("No number found. Add number: ")
            val number = readln()
            database[name] = number
            database.save(CSV_FILENAME)
        }
    }
}
