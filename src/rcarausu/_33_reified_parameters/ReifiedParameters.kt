package rcarausu._33_reified_parameters

import java.math.BigDecimal

fun main(args: Array<String>) {

    val mixedList: List<Any> = listOf("string", 1, BigDecimal(22.5), "fall", BigDecimal(-10.3))
    val bigDecimalOnly = getElementsOfType<String>(mixedList)
    for (item in bigDecimalOnly) {
        println(item)
    }

}

inline fun <reified T> getElementsOfType(list: List<Any>): List<T> {
    var newList: MutableList<T> = mutableListOf()

    for (element in list) {
        // At runtime the JVM doesn't know what T is, it's erased at runtime
        // If we declare the function as inline and 'reify' the generic parameter (Kotlin feature)
        // to avoid being erased at runtime.
        // Mostly used when we need to check a type inside a function
        if (element is T) {
            newList.add(element)
        }
    }

    return newList
}
