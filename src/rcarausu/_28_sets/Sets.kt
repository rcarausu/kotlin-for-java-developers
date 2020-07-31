package rcarausu._28_sets

fun main(args: Array<String>) {
    val setInts = setOf(10, 15, 19, 5, 3, -22)
    // This returns a new immutable set with the new elements, it doesn't add duplicated elements
    // If we remove an element that doesn't exist
    println(setInts.plus(20))
    println(setInts.plus(10))
    println(setInts.minus(19))
    println(setInts.minus(100))
    println(setInts.average())
    // Remove first N elements
    println(setInts.drop(3))

    val mutableInts = mutableSetOf(1, 2, 3, 4, 5)
    // .plus function always return a new set, doesn't work directly on the set
    mutableInts.plus(10)
    println(mutableInts)
}