fun main(args: Array<String>) {

    var myArray = Array<Int>(5){2}
    myArray[0] = 10
    myArray[1] = 8
    myArray[2] = 113
    myArray[3] = 2
    myArray[4] = 100

    for (element in myArray){
        println("item is "+ element )
    }

}