import java.io.FileWriter

fun main(args: Array<String>) {

    println("Enter a message")
    var message = readLine().toString()

    if (message.equals("")) {
        println("Please enter a message")
    } else {
        WriteToFile(message)
    }


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