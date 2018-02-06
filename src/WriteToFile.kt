import java.io.FileReader
import java.io.FileWriter
import java.nio.file.Files
import java.nio.file.Paths

fun main(args: Array<String>) {

//    readFile()
    readFromFile()
//    println("Enter a message")
//    var message = readLine().toString()
//
//    if (message.equals("")) {
//        println("Please enter a message")
//    } else {
//        WriteToFile(message)
//    }
//

}

fun WriteToFile(message: String): Unit {

    try {
        var writer = FileWriter("message.txt", true)

        writer.write(message + "\n")
        writer.close()
        println("Message written to file.")
    } catch (ex: Exception) {
        println("Exception $ex")
    }

}

fun readFile(): Unit {
    var reader = FileReader("message.txt")
    var readMessage:String? =null
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

fun readFromFile(): Unit {
    val stream = Files.newInputStream(Paths.get("message.txt"))
    stream.buffered().reader().use { reader -> println(reader.readText()) }
}