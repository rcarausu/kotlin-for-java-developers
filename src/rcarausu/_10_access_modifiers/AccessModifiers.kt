package rcarausu._10_access_modifiers

// 4 visibility modifiers: public, private, protected and internal
// Kotlin access modifiers depends if we deal with something at the top level of the file,
// or something that it's a class member. In Java at top level we can have classes (like java),
// functions and properties

// The default visibility in Kotlin is public

// private
// visible only in the same file

// internal
// visible for the same module (classes that are compiled together)
// in Java compiles to public, important since mixing code with Java will see things that from Kotlin
// are not accessible, the Kotlin compiler makes ugly names so they are easy to see and detect
// as an element with internal visibility

fun main(args: Array<String>) {
    val employee = Employee()
    println(employee)



}

private class Employee {

}