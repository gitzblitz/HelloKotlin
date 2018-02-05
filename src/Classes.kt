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
}

fun main(args: Array<String>) {

    var myHouse = House("3 bedroom house", 23000.0, 2003, "Paulo")
    var secondHouse = House("4 bedroom house", 24000.0, 2016, "Silas")

    myHouse.owner = "King Arthur"
    println(myHouse.owner)
    println("price "+ secondHouse.price)
}