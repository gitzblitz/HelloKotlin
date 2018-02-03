//var myName = "Lebron" //global variable
var myName: String? = null //global variable

fun main(args: Array<String>) {
// var myName - local variable

    showName("James")
}

fun showName(name: String) {
    myName = "Looni"
    println("Name: $myName")
}