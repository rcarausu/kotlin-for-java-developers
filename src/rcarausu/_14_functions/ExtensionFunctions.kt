package rcarausu._14_functions

fun main() {
    val str = "this is all lowercase"
//    println(Utils().upperFirstAndLast(str))
    str.upperFirstAndLast()
}

//class Utils {
//    fun upperFirstAndLast(str: String): String {
//        val upperFirst = str.substring(0, 1).toUpperCase() + str.substring(1)
//
//        return upperFirst.substring(0, upperFirst.length - 1) +
//                upperFirst.substring(upperFirst.length - 1, upperFirst.length).toUpperCase()
//    }
//}

// Extending the String class with an extension function
fun String.upperFirstAndLast(): String {
    val upperFirst = substring(0, 1).toUpperCase() + substring(1)

    return upperFirst.substring(0, upperFirst.length - 1) +
            upperFirst.substring(upperFirst.length - 1, upperFirst.length).toUpperCase()
}
