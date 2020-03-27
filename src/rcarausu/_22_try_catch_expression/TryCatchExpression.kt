package rcarausu._22_try_catch_expression

import java.lang.IllegalArgumentException
import java.lang.NumberFormatException

fun main(args: Array<String>) {
    println(getNumber("hola"))
    println(getNumber("34"))
//    println(getNumber("22.5") ?: throw  IllegalArgumentException("Number isn't an Int"))

    notImplementedYet("string")
}

// Example use case for the Nothing type
// For functions that don't return anything or functions that always throw an exception
fun notImplementedYet(something: String): Nothing {
    throw IllegalArgumentException("Implement me!")
}

fun getNumber(str: String): Int? {
    return try {
        Integer.parseInt(str)
    }
    catch(e: NumberFormatException) {
        null
    }
    finally {
        println("Im in the finally block")
    }
}