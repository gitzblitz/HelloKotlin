fun main(args: Array<String>) {

//    println(multiply(2,3))
    var result = multiply(2,3)
    var FinalResult = result/divide(2)

    println("result is: $FinalResult")
    println("My name is ${getName("George")}")
    println("result is: ${getBool(true)}")
}

fun divide(num1: Int): Int{
    return num1

}

fun multiply(num1: Int, num2: Int): Int{
    var result = num1 * num2
    return result
}

fun getName( name: String):String{
    return name
}
fun getBool( bool: Boolean):Boolean{
    return bool
}

