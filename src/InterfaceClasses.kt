/*Interface Classes - classes that have methods without bodies*/

interface InputHandler{

    fun clicked()
    fun doubleClick()
    fun singleClick()
}


class Button : InputHandler{
    override fun clicked() {
        println("Button clicked")
    }

    override fun doubleClick() {
        println("Double click button")
    }

    override fun singleClick() {
        println("single click button")
    }
}

class Phone : InputHandler{
    override fun clicked() {
        println("Phone clicked")
    }

    override fun doubleClick() {
        println("Double click phone")
    }

    override fun singleClick() {
        println("single click phone")
    }
}

fun main(args: Array<String>) {
    var myButton = Button()
    myButton.clicked()

    var phone = Phone()
    phone.clicked()
    phone.doubleClick()

}