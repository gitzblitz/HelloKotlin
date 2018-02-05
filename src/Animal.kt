open class Animal() {
    var name: String? = null
    var colour: String? = null
    var numLegs: Int? = null

    constructor(name: String, colour: String, numLegs: Int) : this() {
        this.name = name
        this.colour = colour
        this.numLegs = numLegs

        println("Object " + this.name)
        println("Object " + this.colour)
        println("Object " + this.numLegs)
    }
}


class Lion() : Animal() {

}

fun main(args: Array<String>) {

//    var animal = Animal("Dog", "brown", 4)

    var lion = Lion()

    lion.numLegs = 4

    println("num of legs " + lion.numLegs)

}