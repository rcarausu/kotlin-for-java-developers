package rcarausu._26_collections

fun main(args: Array<String>) {

    val strings = listOf("spring", "summer", "fall", "summer", "winter")
    val colorList = arrayOf("black", "white", "green", "black", "red")

    println(strings.last())
    println(strings.asReversed())
    if (strings.size > 5) {
        println(strings[5])
    }
    // returning null instead of exception
    println(strings.getOrNull(5))

    val ints = listOf(1, 2, 3, 4, 5)
    println(ints.max())

    // joining collections together
    // the zip function creates pairs of class Pair
    println(colorList.zip(strings))

    // joining lists into a list of two lists
    val mergedLists = listOf(colorList, strings)
    println(mergedLists)
    println(mergedLists.javaClass)

    // combining list elements into one list
    val combinedList = listOf(colorList, strings)
    println(combinedList)

    val noDuplicatesList = colorList.union(strings)
    println(noDuplicatesList)

    val noDuplicatesColors = colorList.distinct()
    println(noDuplicatesColors)

    val mutableSeasons = strings.toMutableList()
    mutableSeasons.add("some other season")
    println(mutableSeasons)

}
