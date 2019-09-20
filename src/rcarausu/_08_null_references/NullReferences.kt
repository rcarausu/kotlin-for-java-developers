package rcarausu._08_null_references

import rcarausu.javacode.DummyClass

fun main() {
    // We have nullable variables with the ? operator
    val str: String? = null
    // But the methods we can use are restricted
    // This is not allowed now, since it is not null safe
    // str.toUpperCase()

    if (str != null) {
        // we can use it if we check for nullability
        str.toUpperCase()
    }

    // We can do the same with the null safe operator
    str?.toUpperCase()

    println("What happens when we do this: ${str?.toUpperCase()}, " +
                    "the expression evaluates to null")

    // Can also be used when accessing class operators
    DummyClass().text?.toUpperCase()

    // The Elvis operator '?:'
    // It's used to avoid assigning null to a value, we define a default for it
    val str2 = str ?: "This is the default value"

    println(str2)

    val array: Any = arrayOf(1, 2, 3)
    val str3 = array as? String // safe cast operator also evaluates to null
    println(str3)

    val str4: String? = "This isn't null"
    val str5 = str4!!.toUpperCase() // The !! operator is the non null assertion operator
    // This is to be used when working with values declared as nullable (str4) and if
    // it's null then we may wan't to throw an exception.

    //val str6: String? = null
    //val str7 = str6!!.toUpperCase() // This will throw KotlinNullPointerException

    // We cant do this, the function expects a non-nullable type
    // printText(str)
    //printText(str!!) // We can do this when we are sure it's not null

    // We can also use the .let function to call printText only when not null
    str?.let { printText(it) }

    // Arrays and Nullability
    val nullableInts = arrayOfNulls<Int?>(5)

    for (i in nullableInts) {
        println(i)
    }

    (nullableInts[3] ?: "It's null").let { print(it) }

}

fun printText(text: String) {
    println(text)
}