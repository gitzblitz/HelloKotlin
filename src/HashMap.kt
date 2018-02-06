fun main(args: Array<String>) {
    //HashMaps is key-value pairs
    // (1-> Mary)
    //(Mary -> Married)

    var hashMap = HashMap<String, String>()

    hashMap.put("Mary", "Married")
    hashMap.put("Paulo", "Divorced")
    hashMap.put("James", "Single")

    for (k in hashMap.keys) println(hashMap.get(k))
//    println(hashMap.get("James"))
}