fun main(args: Array<String>) {
/*
    Logical operators
    AND = && (Both have to be true)
    OR = ||
    NOT = !

 */

    var firstNum = 5
    var secondNum = 6
    var thirdNum = 10
    var isCorrect: Boolean = true

    /*And*/
//    if ((firstNum < secondNum) && (thirdNum > firstNum)){
//        println("Hello")
//    } else {
//        println("no")
//    }
    /*OR*/
    if ((firstNum > secondNum) || !isCorrect){
        println("Hello")
    } else{
        println("no")
    }

}