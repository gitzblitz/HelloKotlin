/*Abstract class are not meant to be instantiated. they have a mixture of functions declared with or without implementation*/

abstract class GraphicObject {

    fun moveTo(newX: Int, newY: Int): Unit {
        println("Moved to new $newX and $newY")
    }
    abstract fun draw()
    abstract fun resize()
}


class Circle: GraphicObject(){
    override fun draw() {
        println("Drawing circle")
    }

    override fun resize() {
        println("Resizing circle")
    }
}

class Triangle: GraphicObject(){
    override fun draw() {
        println("Drawing triangle")
    }

    override fun resize() {
        println("Resizing triangle")
    }
}

fun main(args: Array<String>) {

    var circle = Circle()
    circle.draw()
    circle.moveTo(12,23)

    var triangle = Triangle()
    triangle.draw()
    triangle.resize()
}