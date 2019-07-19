package rcarausu._04_strings

fun main() {

    val longString = """hehehe blablabla C\Home
                        |asdasdas as da da
                        |asdsadasdas
    """ // we don't need to include new lines characters when printing

    println(longString)

    // We remove the indentation with trimMargin function
    // This way we maintain the code indent
    // Default trim character is '|', but we can substitute it
    println(longString.trimMargin())

    val someValue = "hehehe"

    val longString2 = """hehehe blablabla C\Home
                        *asdasdas as da da
                        *asdsadasdas $someValue"""

    println(longString2.trimMargin("*"))
}