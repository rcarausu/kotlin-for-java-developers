package rcarausu._30_sequences

import rcarausu._29_more_collections_functions.Car

fun main(args: Array<String>) {
    val immutableMap = mapOf<Int, Car>(
            1 to Car("green", "Toyota", 2015),
            2 to Car("red", "Ford", 2016),
            3 to Car("silver", "Honda", 2013),
            56 to Car("green", "Ford", 2010)
    )

    // Sequences -> basically the same as Streams in Java. They were introduced because some platforms, like android,
    // don't support Java 8 so they don't have Streams. It is evaluated by terminating functions as find or toList.
    println(
            immutableMap.asSequence()
                    .filter { it.value.model == "Ford" }
                    .map { it.value.color }
//                    .find { it.endsWith('e') }
                    .toList()
    )


}

data class Car(val color: String, val model: String, val year: Int)

