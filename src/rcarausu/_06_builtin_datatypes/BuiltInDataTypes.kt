package rcarausu._06_builtin_datatypes

fun main() {
    // builtin data-types are basically the same as in Java
    val myInt = 10
    val myLong = 22L
    val otherLong: Long = 20

    // Important! Kotlin doesn't automatically widen values
    // val someLong: Long = myInt, this gives an error
    val someLong: Long = myInt.toLong()

    val myByte: Byte = 111
    var myShort: Short
    myShort = myByte.toShort()

    // Kotlin will automatically enlarge numerical literals
    val anotherInt = 5

    var myDouble = 65.12
    println(myDouble is Double)

    val myFloat = 12312.13f
    println("This is a float: ${myFloat is Float}")

    var char = 'b'
    // Can't assign numeric values to char as in Java
    // val myChar: Char = 65
    val myCharInt = 65
    println(myCharInt.toChar()) // This is the Kotlin way to do it

    val myBoolean = true

    // If we want to call methods from Java that work with primitives
    // (for example boolean), we don't need to do anything special
    // because under the covers the Kotlin classes compile to the primitive types
    val vacationTime = true
    val onVacation = DummyClass().isVacationTime(vacationTime)

    println(onVacation)

    val any: Any // top of class hierarchy
    val unit: Unit // equivalent of void in Java. Returned implicitly
    val nothing: Nothing // to use when something doesn't return anything
    // (if it does, throws Exception), no equivalent in Java

}