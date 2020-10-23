package rcarausu._32_generics_functions_and_erasure

fun main(args: Array<String>) {
    val shorts: List<Short?> = listOf(10, 20, 30, 40)
    val floats: List<Float> = listOf(1f, 2f, 3f, 4f)
    val strings = listOf("1", "2", "3")
    var listAny: Any = listOf("str1", "str2")


    // We can check the 'star projection syntax' for checking type
    // at compile time, List<String> will return an error. Check related
    // Java code for an example of what the JVM can do at runtime but not at
    // compile time

    listAny = listOf(1, 2, 3)

    if (listAny is List<*>) {
        println("Yes, this is a list. Than you star projection")
        val strList = listAny as List<String>
        println(strList[1].replace("str", "string"))
    }

//    convertToInt(shorts)
//    convertToInt(floats)

//    printCollection(shorts) // Won't work because list is nullable
    printCollection(strings)

    append(StringBuilder("String 1"), StringBuilder("String2"))
}

// If we want to limit the function to non-nullable types,
// we'll use Any
fun <T: Any> printCollection(collection: List<T>) {
    for (item in collection) {
        print(item)
    }
}

// Here we need to specify the class extended by our type,
// also known as 'Upper Bound'
fun <T : Number> convertToInt(collection: List<T>) {
    for (num in collection) {
        println("${num.toInt()}")
    }
}

// We use the 'where' clause when we want to specify
// more than one 'upper bound'
fun <T> append(item1: T, item2: T)
        where T : CharSequence, T : Appendable {
    println("Result is ${item1.append(item2)}")
}
