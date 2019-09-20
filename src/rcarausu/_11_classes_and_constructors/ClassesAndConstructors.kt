package rcarausu._11_classes_and_constructors

fun main() {

    val employee = Employee("John")

    println(employee.firstName)

    val emp2 = Employee("Joe")
    println(emp2.firstName)
    println(emp2.fullTime)

    val emp3 = Employee("Jane", false)
    println(emp3.firstName)
    println(emp3.fullTime)

    println(Demo().dummy)

}

class Employee(val firstName: String) {

    var fullTime: Boolean = true

    // adding a secondary constructor
    // all the other constructors need to delegate to the primary one
    constructor (firstName: String, fullTime: Boolean): this(firstName) {
        this.fullTime = fullTime
    }
}

// access modifier to constructor
class Employee2 private constructor(val firstName: String)

// Same as Employee class
class Employee3(val firstName: String, var fullTime: Boolean = true)

// Class with secondary bot no primary constructor
class Demo {
    val dummy: String

    constructor() {
        dummy = "Hello"
    }
}