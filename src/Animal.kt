open class Animal() {

    //public == default
    //private = will not be visible outside the class
    // protected = same as private + visible in subclasses
    var name: String? = null
    var colour: String? = null
   private var numLegs: Int? = null

    constructor(name: String, colour: String, numLegs: Int) : this() {
        this.name = name
        this.colour = colour
        this.numLegs = numLegs

        println("Object " + this.name)
        println("Object " + this.colour)
        println("Object " + this.numLegs)
    }

    constructor(name: String, colour: String) : this() {
        this.name = name
        this.colour = colour

        println("Third constructor " + this.name)
    }

    fun setNumLegs(num: Int) {
        this.numLegs = num
    }

    open fun makeNoise() {
        println("Animal noise")
    }
    fun showAnimal() {
        println("Name is " + this.name)
        println("Colour is " + this.colour)
        println("NumLegs is " + this.numLegs)

    }
}

class Cat : Animal {
    constructor() : super() {
        

    }

    override fun makeNoise() {
        println("MEOOWWW!")
        super.colour
    }

}

class Lion : Animal {
    var numEyes: Int? = null
    var age: Int? = null

    constructor(numEyes: Int, age: Int, name: String) : super() {
        super.name = name
        this.numEyes = numEyes
        this.age = age

        println("Lion constructor " + this.numEyes + " " + this.age)
    }

}

fun main(args: Array<String>) {

    var newAnimal = Animal("Animal", "Brown")

    newAnimal.setNumLegs(4)

    newAnimal.showAnimal()

//var animal = Animal("Animal", "brown")

//    var animal = Animal()
//    animal.colour = "brown"
//    animal.name = "Elephant"
//    animal.numLegs = 4
//
//    var animal2 = Animal("Another animal", "blue", 6)
////    animal.showAnimal()
//    animal2.showAnimal()
//    var animal = Animal("Dog", "brown", 4)
//
//    var lion = Lion()
//
//    lion.numLegs = 4
//
//    println("num of legs " + lion.numLegs)

}
