import java.io.FileReader
import java.io.FileWriter

fun main(args: Array<String>) {

    menu()
}

fun menu(): Unit {
    println("Enter")
    println("1 - Write")
    println("2 - Read")
    println("3 - Exit \n")

    var choice = readLine()!!.toInt()
    var message: String? = null

    when(choice){
        1 ->{
            println("Enter message:")
            message = readLine().toString()
            writeToFile(message)

        }
        2->{
            println("Reading")
            readfromFile()
        }
        3->{
            println("Exiting")
        }
    }
    println()

}

fun readfromFile(): Unit {
    var reader = FileReader("AppReader.txt")
    var char: Int? = null
    try {
        do {
            char = reader.read()
            print(char.toChar())

        }while (char != -1)

    } catch (ex: Exception) {
        println(ex.message)
    }
}

fun writeToFile(message: String): Unit {
    try {
        var writer = FileWriter("AppReader.txt", true)

        writer.write(message + "\n")
        writer.close()
        println("Message written to file.")
    } catch (ex: Exception) {
        println("Exception $ex")
    }
}