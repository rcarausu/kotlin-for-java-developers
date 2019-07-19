package rcarausu._07_arrays

import rcarausu._06_builtin_datatypes.DummyClass
import java.math.BigDecimal

fun main() {
    val names = arrayOf("John", "Jane", "Jill", "Joe")
    val longs = arrayOf(1L, 2L, 3L)
    val longs2 = arrayOf<Long>(1, 2, 3)
    val ints = arrayOf(1, 2, 3)

    // We can use array indexing
    println(longs[2])

    // We can initialize arrays with constructor lambda
    val evenNumbers = Array(16) { i -> i * 2 }
//    for (number in evenNumbers) {
//        println(number)
//    }

    val lotsOfNumbers = Array(10000) { i -> i + 1 }
    val allZeroes = Array(100) { 0 }

    var someArray: Array<Int>

    someArray = arrayOf(1, 2, 3, 4)

//    for (number in someArray) {
//        println(number)
//    }

//    someArray = Array(6) { i -> (i + 1) * 10 }

    val mixedArray = arrayOf("hello", 22, BigDecimal(10.5), 'a')

//    for (number in mixedArray) {
//        println(number)
//    }

    println(mixedArray is Array<Any>)

    val myIntArray = arrayOf(1, 2, 3, 4, 5)
    // DummyClass().printNumbers(myIntArray) This won't work for non primitive types
    DummyClass().printNumbers(myIntArray.toIntArray())

    // We can also do
    val myIntArray2 = intArrayOf(1, 2, 3, 4)
    DummyClass().printNumbers(myIntArray2)

    var someOtherArray = IntArray(5) // primitive arrays will be initialized
    for (number in someOtherArray) {
        println(number)
    }


}