package rcarausu._05_challenge_1

fun main() {
    val hello1 = "Hello"
    val hello2 = "Hello"

    // prints true because JVM optimizes string literal instances
    println("referential equality: ${hello1 === hello2}")

    println("structural equality: ${hello1 == hello2}")

    var integer: Int = 2988

    val any: Any = "The any type is the root of the Kotlin class hierarchy"

    if (any is String) {
        println(any.toUpperCase()) // now we can use the toUpperCase method because of smart casting
    }

    print("""
            1   1
            1  11
            1 111
            11111""".trimMargin("1"))

}
