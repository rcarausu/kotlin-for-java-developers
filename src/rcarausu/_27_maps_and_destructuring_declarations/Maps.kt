package rcarausu._27_maps_and_destructuring_declarations

fun main(args: Array<String>) {
    val immutableMap = mapOf<Int, Car>(
            1 to Car("green", "Toyota", 2015),
            2 to Car("red", "Ford", 2016),
            3 to Car("silver", "Honda", 2013)
    )

    println(immutableMap.javaClass)
    println(immutableMap)

//    val mutableMap = mutableMapOf<String, Car>("John's car" to Car("red", "Range Rover", 2010),
//    "Jane's car" to Car("blue", "Hyunday", 2012))
    val mutableMap = hashMapOf<String, Car>("John's car" to Car("red", "Range Rover", 2010),
            "Jane's car" to Car("blue", "Hyunday", 2012))

//    mutableMap.put("Mary's car", Car("red", "Corvette", 1965))
    mutableMap["Mary's car"] = Car("red", "Corvette", 1965)

    println(immutableMap.javaClass)
    println(immutableMap)

    // Here we use 'destructuring' for  printing the values of the map
    // It can be implemented in our own object via 'component functions'
    for ((key, value) in mutableMap) {
        println(key)
        println(value)
    }

    val pair = Pair(10, "ten")
//    val firstValue = pair.first
//    val secondValue = pair.second
    val (firstValue, secondValue) = pair

    // Using destructuring with objects
    val car = Car("blue", "Corvette", 1959)
    val (color, model, year) = car
    println("color=$color, model=$model and year=$year")

}

//class Car(val color: String, val model: String, val year: Int) {
//    // This is not necessary for data classes!
//    operator fun component1() = color
//    operator fun component2() = model
//    operator fun component3() = year
//}

data class Car(val color: String, val model: String, val year: Int)