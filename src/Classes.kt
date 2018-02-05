class House(type: String, price: Double, yearBuilt: Int, owner: String) {

    var type: String? = null
    var price: Double? = null
    var yearBuilt: Int? = null
    var owner: String? = null

    init { // initialises all the properties
        this.type = type
        this.price = price
        this.yearBuilt = yearBuilt
        this.owner = owner
    }

    /*In Kotlin getter and setters are done in the background.
    You do not need to create getters and setters for your classes*/
    fun GetType(): String? {
        return this.type
    }

    fun SetType(type: String): Unit {
        this.type = type
    }
}

fun main(args: Array<String>) {

    var myHouse = House("3 bedroom house", 23000.0, 2003, "Paulo")
    var secondHouse = House("4 bedroom house", 24000.0, 2016, "Silas")
    

    myHouse.SetType("8 bedroom house")
    println(myHouse.GetType())
    println(myHouse.owner)
    println("price " + secondHouse.price)
}