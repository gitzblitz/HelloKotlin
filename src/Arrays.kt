fun main(args: Array<String>) {

    var myArray = Array<Int>(6) { 2 }
    myArray[0] = 10
    myArray[1] = 8
    myArray[2] = 113
    myArray[3] = 2
    myArray[4] = 100
    myArray[5] = 1000

    //printing objects
    for (element in myArray) {
        println("item is "+ element )
    }

    //printing items

    for (index in 0..myArray.size - 1) {
        println(myArray[index])
    }

}