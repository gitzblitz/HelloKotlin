fun main(args: Array<String>) {
    //Arraylist
    var myArraylist = ArrayList<String>()

    myArraylist.add("James")
    myArraylist.add("Bond")
    myArraylist.add("Die")
    myArraylist.add("Another")
    myArraylist.add("Day")
    myArraylist.set(1, "Salmon")

    if (myArraylist.contains("Die")) println("It is a james bond movie")

    myArraylist.remove("Bond")


    //iterating through objects
    for (names in myArraylist) {
        println("Names in object " + names)
    }

    for (index in 0..myArraylist.size - 1) {
        println("Names in index " + myArraylist.get(index))
    }

    println(myArraylist.get(1))
}