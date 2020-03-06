package rcarausu._19_for_loop

fun main(args: Array<String>) {
    // For loops work with ranges, there is no typical for (int i = 0 ...) in Kotlin
    // Any comparable type can be used in a range
    val range = 1..5
    val charRange = 'a'..'z'
    val stringRange = "ABD".."XYZ"

    println(3 in range)
    println('q' in charRange)
    println("CCC" in stringRange)
    println("CCCCC" in stringRange)
    println("ZZZZZZ" in stringRange)

    val backwardRange = 5.downTo(1)
    val r = 5..1 // empty range, don't create it like this
    println(5 in r) // false because 5 is greater or equal than start value (5) but not lower or equal to end value (1)
    println(5 in backwardRange)
    // step ranges only work with numeric ranges
    val stepRange = 3..15
    val stepThree = stepRange.step(3)
    val reversedRange = range.reversed()


//    for (i in range) {
//        println(i)
//    }

    for (i in stepThree) {
        println(i)
    }

    for ( i in 1..20 step 4) {
        println(i)
    }

    for (i in 20 downTo 15) {
        println(i)
    }

    // exclusive 10, nubers 1 to 9
    for (i in 1 until 10) {
        println(i)
    }

    val s = "goodbye"
    val sRange = 0..s.length

    val seasons = arrayOf("spring", "summer", "winter", "fall")
    for (season in seasons) {
        println(season)
    }

    println("blabla" !in seasons)

    for (index in seasons.indices) {
        println("${seasons[index]} is season number $index")
    }

    seasons.forEach { println(it) }
    seasons.forEachIndexed {index, value -> println("$value is season number $index")}

    // breaking on a named loop
    for (i in 1..3) {
        println("i = $i")
        jloop@ for (j in 1..4) {
            println("j = $j")
            for (k in 5..10) {
                println("k = $k")
                if (k == 7) {
                    break@jloop
                }
            }
        }
    }
}