
// Enum classes allow us to represent a collection of information
// (fixed or static)

enum class Suits{
    HEARTS,
    SPADES,
    CLUBS,
    DIAMONDS

}

enum class Directions{
    NORTH, SOUTH, EAST, WEST
}



fun main(args: Array<String>) {

    var cardPlayer = Suits.DIAMONDS
    var cardPlayer2 = Suits.CLUBS

    if (cardPlayer == Suits.DIAMONDS) println("You are doing great")
    if (cardPlayer2 == Suits.CLUBS) println("You are playing bad")

    var playerDirection = Directions.EAST
    if (playerDirection == Directions.EAST) println("You are going EAST bound")
}