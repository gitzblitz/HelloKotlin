class Login<T>(name: T, password: T){

    init {
        println("Name: " + name + " Password: " + password)
    }
}

class Person(username: String, password: String){

    var username: String? = null
    var password: String? = null
    init {
        this.username = username
        this.password = password
        println("Person class")
    }
}

fun main(args: Array<String>) {
    var login = Login<String>("George", "ugh%#6")

    var login2 = Login<Int>(2,3)
    var login3 = Login<Boolean>(true,false)

    var person = Person("Paulo", "Paul")

    var user = Login<Person>(person, person)
}
