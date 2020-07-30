package rcarausu._26_collections

fun main(args: Array<String>) {
    val strings = listOf("spring", "summer", "fall", "winter")
    println(strings.javaClass)

    val emptyList = emptyList<String>()
    println(emptyList.javaClass)

    // null value is never added to the list
    // This returns an immutable list, java.util.Arrays$ArrayList
    val notNullList = listOfNotNull("hello", null, "goodbye")
    println(notNullList)

    // This returns java.util.Array
    val arrayList = arrayListOf(1, 2, 3, 4)
    println(arrayList.javaClass)

    // This returns java.util.Array
    val mutableList = mutableListOf<Int>(1, 2, 3)
    println(mutableList.javaClass)
    println(mutableList[2])
    mutableList[1] = 20
    println(mutableList)


    // This cretes a list with one element
    val array = arrayOf("black", "white", "green")
    val colorList = listOf(array)
    println(colorList)

    val ints = intArrayOf(1, 2, 3)
    println(ints.toList())


}
