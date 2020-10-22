package rcarausu._31_generics

import java.math.BigDecimal

fun main(args: Array<String>) {

    val list = mutableListOf("Hello")
    list.add("another string")
//    printCollection(list)

    val bList = mutableListOf(BigDecimal(-31.45), BigDecimal(12.4), BigDecimal(29.72))
    bList.printCollection()

}

// Adding an extension function
fun <T> List<T>.printCollection() {
    for (item in this) {
        println(item)
    }
}

