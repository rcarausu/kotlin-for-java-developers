package rcarausu.testing

import java.io.File

fun main() {
    File("src/rcarausu.testing/greetings.txt").reader().forEachLine {
        when (it) {
            "hello" -> println("$it is in English")
            "salut" -> println("$it is in Spanish")
            "hola" -> println("$it is in Romanian")
            else -> println("I don't know the language of $it!")
        }
    }
}