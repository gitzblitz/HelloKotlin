fun main(args: Array<String>) {

    add(2, 3)
    subtract(3, 1, 1)
}

fun add(num1: Int, num2: Int) {
    var sum = num1 + num2
    println("Sum is: $sum")
}

fun subtract(num1: Int, num2: Int, num3: Int) {
    var result = num1 - num2 - num3
    println("Difference is: $result")
}