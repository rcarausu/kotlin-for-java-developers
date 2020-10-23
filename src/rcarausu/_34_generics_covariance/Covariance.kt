package rcarausu._34_generics_covariance

fun main(args: Array<String>) {
    // This is raises a compilation error because MutableList is not covariant
//    val shortList: MutableList<Short> = mutableListOf(1, 2, 3, 4, 5)
    val shortList: List<Short> = listOf(1, 2, 3, 4, 5)

    convertToInt(shortList)
}

//fun convertToInt(collection: MutableList<Number>) {
fun convertToInt(collection: List<Number>) {
    for (num in collection) {
        println("${num.toInt()}")
    }
}

fun tendGarden(roseGarden: Garden<Rose>) {
    waterGarden(roseGarden) // We get an error because the Garden class is invariant
}

fun waterGarden(garden: Garden<Flower>) {

}

open class Flower {

}

class Rose: Flower() {

}

// We make it covariant by adding the 'out' keyword
// The problem is that we are now restricted with what we can do with the class
// We can read them , but not add anything to it. It can only be used in the 'out' position.
class Garden<out T: Flower> {

    val flowers: List<T> = listOf()

    fun pickFlower(i: Int): T = flowers[i]

    // This has a compile error because we can only use T in the 'out' position, not in the 'in' position
//    fun plantFLower(flower: T) {
//    }


}