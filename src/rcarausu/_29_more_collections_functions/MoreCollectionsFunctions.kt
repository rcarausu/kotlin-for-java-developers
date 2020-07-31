package rcarausu._29_more_collections_functions

fun main(args: Array<String>) {
    val setInts = setOf(10, 15, 19, 5, 2, -22)

    println(setInts.filter { it % 2 != 0 })

    val immutableMap = mapOf<Int, Car>(1 to Car("green", "Toyota", 2015),
            2 to Car("red", "Ford", 2016),
            3 to Car("silver", "Honda", 2013))

    println(immutableMap.filter { it.value.year == 2016 })

    val mutableMap = mutableMapOf<Int, Car>(1 to Car("green", "Toyota", 2015),
            2 to Car("red", "Ford", 2016),
            3 to Car("silver", "Honda", 2013),
            56 to Car("green", "Ford", 2010))

    mutableMap.filter { it.value.color == "silver" }
    println("THe filters map is $mutableMap")
    val ints = arrayOf(1, 2, 3, 4, 5)
    // Here we tell the compiler the type since we create a list without any type
//    val add10List: MutableList<Int> = mutableListOf()
//    for (i in ints) {
//        add10List.add(i + 10)
//    }
//    println(add10List)
    val add10List = ints.map { it + 10 }
    println(add10List.javaClass)
    println(add10List)

    println(immutableMap.map { it.value.year })

    println(immutableMap.filter { it.value.model == "Ford" }
            .map { it.value.color })

    println(immutableMap.all { it.value.year > 1999 })
    println(immutableMap.any { it.value.year > 2014 })
    println(immutableMap.count { it.value.year > 2014 })

    println(immutableMap.toSortedMap())

    val cars = immutableMap.values
    // Finds the first item in the list that satisfies the condition
    println(cars.find {it.year > 2014})

    // Grouping
    println(cars.groupBy { it.color })

    println(cars.sortedBy { it.year })

}

data class Car(val color: String, val model: String, val year: Int)