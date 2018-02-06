fun main(args: Array<String>) {
    //arraylist

    //default is always immutable
    var myArrayList = listOf<String>("Me", "James", "Boonie", "Life")
    println(myArrayList[0])

    // make it mutable
    var mutableList = mutableListOf<String>("Me", "They", "Jamesss", "Life")

    mutableList[0] = "Paulo"


    //HashMap
    var myHashMap = hashMapOf(1 to "paulo", 2 to "George", 3 to "Bond")

    println(myHashMap.get(2))


    //array
    var myArray = arrayOf(1, 3,4,5,6)
    myArray[0] = 3

    for (items in myArray) println("Items in myArray $items")

    for (items in mutableList) println("Items $items")
}