fun main (args: Array<String>){
    /*
    * user is prompted with a question
    * user has to enter an answer
    * if answer is incorrect, user is prompted with the question
    * else the application terminates
    * */

    var isTrue: Boolean? = false

    do {
        println("How many siblings do I have?")
        var answer: Int? = readLine()!!.toInt()

        when(answer){

            12 ->{
                println("You are correct")
                isTrue =true
            }

        else -> println("Incorrect. Please try again \n")
        }

    }while (isTrue == false)
}